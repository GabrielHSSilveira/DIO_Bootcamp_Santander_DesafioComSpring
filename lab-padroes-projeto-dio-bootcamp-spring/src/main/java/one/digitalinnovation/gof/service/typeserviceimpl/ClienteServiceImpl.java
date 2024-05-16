package one.digitalinnovation.gof.service.typeserviceimpl;

import java.util.Optional;

import one.digitalinnovation.gof.servico.cliente.Cliente;
import one.digitalinnovation.gof.servico.cliente.ClienteRepository;
import one.digitalinnovation.gof.servico.cliente.infocliente.Endereco;
import one.digitalinnovation.gof.servico.cliente.infocliente.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import one.digitalinnovation.gof.service.ClienteService;
import one.digitalinnovation.gof.service.ViaCepService;

// Classe de implementação do serviço de cliente
@Service
public class ClienteServiceImpl implements ClienteService {

    // Injeção de dependências dos repositórios e serviços necessários
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;

    // Método para buscar todos os clientes
    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    // Método para atualizar um cliente existente
    @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if (clienteBd.isPresent()) {
            salvarClienteComCep(cliente);
        }
    }

    // Método para deletar um cliente pelo ID
    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }

    // Método para buscar um cliente por ID
    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    // Método para inserir um novo cliente
    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCep(cliente);
    }



    // Método privado para salvar um cliente com seu endereço, consultando o CEP se necessário
    private void salvarClienteComCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            // Se o endereço não existir no banco, consultamos o CEP via serviço ViaCepService
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            // Salvamos o novo endereço no banco
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        // Atualizamos o endereço do cliente e salvamos no banco
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }
}
