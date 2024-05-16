package one.digitalinnovation.gof.servico.cliente;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Interface de repositório para operações CRUD relacionadas à entidade Cliente
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
