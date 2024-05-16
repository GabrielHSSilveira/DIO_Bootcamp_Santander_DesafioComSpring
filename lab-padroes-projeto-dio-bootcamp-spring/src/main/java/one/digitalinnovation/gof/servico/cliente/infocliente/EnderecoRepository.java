package one.digitalinnovation.gof.servico.cliente.infocliente;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Interface de repositório para operações CRUD relacionadas à entidade Endereco
@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}
