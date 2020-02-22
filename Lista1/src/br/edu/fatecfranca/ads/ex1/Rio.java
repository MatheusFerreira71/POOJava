package br.edu.fatecfranca.ads.ex1;

public class Rio {

    private String nome;
    private float nivel;
    private boolean poluido;

    /**
     *
     * @param nome
     * @param nivel
     * @param poluido
     */
    public Rio(String nome, float nivel, boolean poluido) {
        this.nivel = nivel;
        this.nome = nome;
        this.poluido = poluido;
    }

    public void chover(float x) {
        this.nivel += x;
    }

    public void ensolarar(float x) {
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
