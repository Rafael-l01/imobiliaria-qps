package model.propostaCompra;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class InterfacePropostaCompra {
    private static final AtomicInteger count = new AtomicInteger(1);
    private int id;
    private int idComprador;
    private int idImovel;
    private double valor;

    public InterfacePropostaCompra(int idComprador, int idImovel, double valor) {
        this.id = count.incrementAndGet();
        this.idComprador = idComprador;
        this.idImovel = idImovel;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdComprador() {
        return idComprador;
    }

    public void setIdComprador(int idComprador) {
        this.idComprador = idComprador;
    }

    public int getIdImovel() {
        return idImovel;
    }

    public void setIdImovel(int idImovel) {
        this.idImovel = idImovel;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
