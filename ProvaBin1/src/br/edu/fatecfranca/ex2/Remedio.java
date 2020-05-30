package br.edu.fatecfranca.ex2;

import java.util.Date;

public class Remedio {
    private String nome, marca;
    private Date validade;

    public Remedio(String nome, String marca, Date validade) {
        this.setNome(nome);
        this.setMarca(marca);
        this.setValidade(validade);
    }

    public Remedio() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getValidade() {
        return this.validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    @Override
    public String toString() {
        return "\nRemedio{" + "nome=" + this.nome + ", marca=" + this.marca + ", validade=" + this.validade + '}';
    }
}
