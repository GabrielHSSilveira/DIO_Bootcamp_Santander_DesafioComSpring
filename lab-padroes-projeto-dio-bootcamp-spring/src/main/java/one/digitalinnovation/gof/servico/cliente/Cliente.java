package one.digitalinnovation.gof.servico.cliente;

import one.digitalinnovation.gof.servico.cliente.infocliente.Endereco;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

// Entidade JPA que representa um cliente
@Entity
public class Cliente {

    // Identificador único do cliente
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // Nome do cliente
    @NotEmpty
    private String nome;
    // Relacionamento muitos para um com a entidade Endereco
    @ManyToOne
    private Endereco endereco;

    @NotNull
    private Integer idade;

    // Método para obter o ID do cliente
    public Long getId() {
        return id;
    }

    // Método para obter o endereço do cliente
    public Endereco getEndereco() {
        return endereco;
    }

    // Método para definir o endereço do cliente
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // Método para definir o ID do cliente
    public void setId(Long id) {
        this.id = id;
    }

    // Método para obter o nome do cliente
    public String getNome() {
        return nome;
    }

    // Método para definir o nome do cliente
    public void setNome(String nome) {
        this.nome = nome;
    }


}
