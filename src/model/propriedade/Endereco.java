package model.propriedade;

public class Endereco extends InterfaceEndereco {
    public Endereco(String rua, int numero, String bairro, String cidade, String estado, String pais, String complemento, String cep, String pontoDeReferencia) {
        super(rua, numero, bairro, cidade, estado, pais, complemento, cep, pontoDeReferencia);
    }

    @Override
    public String getEndereco() {
        String endereco = "";
        endereco += this.getRua() + " " + this.getNumero() + " - " + this.getBairro() + ". Cidade: " + this.getCidade() + " - " + this.getEstado() + ". CEP " + this.getCep() + ". País: " + this.getPais();
        return endereco;
    }
}
