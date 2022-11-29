package model.propriedade;

import model.agenda.Agenda;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class InterfacePropriedade {
    private static final AtomicInteger count = new AtomicInteger(1);
    private int id;
    private Endereco endereco;
    private double area;
    private double valorCondominio;
    private double valorImovel;
    private int quartos;
    private int banheiros;
    private int vagasGaragem;
    private String descricao;
    private Agenda agenda;

    public InterfacePropriedade(Endereco endereco, double area, double valorCondominio, double valorImovel, int quartos, int banheiros, int vagasGaragem, String descricao) {
        this.id = count.incrementAndGet();
        this.endereco = endereco;
        this.area = area;
        this.valorCondominio = valorCondominio;
        this.valorImovel = valorImovel;
        this.quartos = quartos;
        this.banheiros = banheiros;
        this.vagasGaragem = vagasGaragem;
        this.descricao = descricao;
        this.agenda = new Agenda();
    }

    public void setPropriedade(Endereco endereco, double area, double valorCondominio, double valorImovel, int quartos, int banheiros, int vagasGaragem, String descricao) {
        this.endereco = endereco;
        this.area = area;
        this.valorCondominio = valorCondominio;
        this.valorImovel = valorImovel;
        this.quartos = quartos;
        this.banheiros = banheiros;
        this.vagasGaragem = vagasGaragem;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getValorCondominio() {
        return valorCondominio;
    }

    public void setValorCondominio(double valorCondominio) {
        this.valorCondominio = valorCondominio;
    }

    public double getValorImovel() {
        return valorImovel;
    }

    public void setValorImovel(double valorImovel) {
        this.valorImovel = valorImovel;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public int getBanheiros() {
        return banheiros;
    }

    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }

    public int getVagasGaragem() {
        return vagasGaragem;
    }

    public void setVagasGaragem(int vagasGaragem) {
        this.vagasGaragem = vagasGaragem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }
}
