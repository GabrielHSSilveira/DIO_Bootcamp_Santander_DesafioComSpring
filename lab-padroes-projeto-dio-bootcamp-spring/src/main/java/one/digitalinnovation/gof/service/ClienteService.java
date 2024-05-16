package one.digitalinnovation.gof.service;


import one.digitalinnovation.gof.servico.cliente.Cliente;

public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

    boolean existe(Long id);
}