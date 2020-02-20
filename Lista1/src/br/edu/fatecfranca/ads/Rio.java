package br.edu.fatecfranca.ads;

public class Rio {

    public String nome;
    public float nivel;
    public boolean poluido;

    public Rio() {

    }

    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public void chover(float x) {
        this.nivel += x;
    }

    public void ensolar(float x) {
        this.nivel -= x;
    }

    public void limpar() {
        this.poluido = false;
    }

    public void sujar() {
        this.poluido = true;
    }

    public String mostra() {
        return "Nome: " + this.nome + "\nNível: " + this.nivel
                + ((this.poluido) ? "\nPoluído" : "\nLimpo");
    }
}
