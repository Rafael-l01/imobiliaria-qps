package model.usuario;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Usuario {
    private static final AtomicInteger count = new AtomicInteger(1);
    private int id;
    private String nome;
    private String email;
    private String numeroTelefone;
    private String cpf;
    private Date dataNascimento;
    private String senha;

    public Usuario(String nome, String email, String numeroTelefone, String cpf, Date dataNascimento, String senha) {
        this.id = count.incrementAndGet();
        this.nome = nome;
        this.email = email;
        this.numeroTelefone = numeroTelefone;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
