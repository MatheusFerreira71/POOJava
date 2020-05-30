package br.edu.fatecfranca.ex3;

public abstract class Computador {
    protected String descricao;

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Computador(String descricao) {
        this.setDescricao(descricao);
    }

    public Computador() {
    }

    @Override
    public String toString() {
        return "\nComputador{" + "descricao=" + this.descricao + '}';
    }
}
