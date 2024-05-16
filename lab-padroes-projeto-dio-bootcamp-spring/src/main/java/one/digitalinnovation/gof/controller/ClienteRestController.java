package one.digitalinnovation.gof.controller;

import one.digitalinnovation.gof.servico.cliente.Cliente;
import one.digitalinnovation.gof.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteRestController {

    @Autowired
    private ClienteService clienteService;

    // Endpoint para listar todos os clientes
    @GetMapping
    public ResponseEntity<List<Cliente>> listarClientes() {
        List<Cliente> clientes = (List<Cliente>) clienteService.buscarTodos();
        return ResponseEntity.ok(clientes);
    }

    // Endpoint para buscar um cliente por ID
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarClientePorId(@PathVariable Long id) {
        Cliente cliente = clienteService.buscarPorId(id);
        if (cliente == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(cliente);
    }

    // Endpoint para criar um novo cliente
    @PostMapping
    public ResponseEntity<Cliente> criarCliente(@RequestBody Cliente cliente) {
        clienteService.inserir(cliente);
        // Retorna a resposta HTTP 201 (Created) ao criar um novo cliente
        return ResponseEntity.status(HttpStatus.CREATED).body(cliente);
    }

    // Endpoint para atualizar um cliente existente
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizarCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
        // Verifica se o cliente com o ID fornecido existe antes de atualizar
        if (!clienteService.existe(id)) {
            return ResponseEntity.notFound().build();
        }
        cliente.setId(id);
        clienteService.atualizar(id, cliente);
        return ResponseEntity.ok(cliente);
    }

    // Endpoint para deletar um cliente existente
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCliente(@PathVariable Long id) {
        // Verifica se o cliente com o ID fornecido existe antes de deletar
        if (!clienteService.existe(id)) {
            return ResponseEntity.notFound().build();
        }
        clienteService.deletar(id);
        // Retorna a resposta HTTP 204 (No Content) ao deletar com sucesso
        return ResponseEntity.noContent().build();
    }
}
