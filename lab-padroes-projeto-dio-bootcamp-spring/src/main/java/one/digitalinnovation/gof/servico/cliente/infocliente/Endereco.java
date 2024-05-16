package one.digitalinnovation.gof.servico.cliente.infocliente;

import javax.persistence.Entity;
import javax.persistence.Id;

// Entidade JPA que representa as informações de endereço do cliente
@Entity
public class Endereco {

    // Identificador único do endereço (CEP)
    @Id
    private String cep;
    // Logradouro do endereço
    private String logradouro;
    // Complemento do endereço
    private String complemento;
    // Bairro do endereço
    private String bairro;
    // Localidade (cidade) do endereço
    private String localidade;
    // Unidade federativa (estado) do endereço
    private String uf;
    // Código IBGE do endereço
    private String ibge;
    // Código GIA do endereço
    private String gia;
    // Código DDD do endereço
    private String ddd;
    // Código SIAFI do endereço
    private String siafi;

    // Método para obter o CEP do endereço
    public String getCep() {
        return cep;
    }

    // Método para definir o CEP do endereço
    public void setCep(String cep) {
        this.cep = cep;
    }

    // Método para obter o logradouro do endereço
    public String getLogradouro() {
        return logradouro;
    }

    // Método para definir o logradouro do endereço
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    // Método para obter o complemento do endereço
    public String getComplemento() {
        return complemento;
    }

    // Método para definir o complemento do endereço
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    // Método para obter o bairro do endereço
    public String getBairro() {
        return bairro;
    }

    // Método para definir o bairro do endereço
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    // Método para obter a localidade (cidade) do endereço
    public String getLocalidade() {
        return localidade;
    }

    // Método para definir a localidade (cidade) do endereço
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    // Método para obter a unidade federativa (estado) do endereço
    public String getUf() {
        return uf;
    }

    // Método para definir a unidade federativa (estado) do endereço
    public void setUf(String uf) {
        this.uf = uf;
    }

    // Método para obter o código IBGE do endereço
    public String getIbge() {
        return ibge;
    }

    // Método para definir o código IBGE do endereço
    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    // Método para obter o código GIA do endereço
    public String getGia() {
        return gia;
    }

    // Método para definir o código GIA do endereço
    public void setGia(String gia) {
        this.gia = gia;
    }

    // Método para obter o código DDD do endereço
    public String getDdd() {
        return ddd;
    }

    // Método para definir o código DDD do endereço
    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    // Método para obter o código SIAFI do endereço
    public String getSiafi() {
        return siafi;
    }

    // Método para definir o código SIAFI do endereço
    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }
}

