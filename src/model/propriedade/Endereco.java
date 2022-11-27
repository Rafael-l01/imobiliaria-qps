package model.propriedade;

public class Endereco extends InterfaceEndereco {
    public Endereco(String rua, int numero, String bairro, String cidade, String estado, String pais, String complemento, String cep, String pontoDeReferencia) {
        super(rua, numero, bairro, cidade, estado, pais, complemento, cep, pontoDeReferencia);
    }

    @Override
    public String getEndereco() {
        String endereco = "";
        endereco += "Rua " + this.getRua() + " " + this.getNumero() + "\n" + this.getBairro() + "\n" + this.getCidade() + " - " + this.getEstado() + "\n" + "CEP " + this.getCep() + "\n" + this.getPais();
        return endereco;
    }
}
