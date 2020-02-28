package br.edu.fatecfranca.ads.ex1;

import javax.swing.JOptionPane;

public class Rio {

    private String nome;
    private float nivel;
    private boolean poluido;

    public Rio() {
        this.nome = "";
        this.nivel = 0;
        this.poluido = false;
    }

    public Rio(String nome, float nivel, boolean poluido) {
        this.setNivel(nivel);
        this.nome = nome;
        this.poluido = poluido;
    }

    public String getNome() {
        return this.nome;
    }

    public float getNivel() {
        return this.nivel;
    }

    public boolean getEstado() {
        return this.poluido;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNivel(float nivel) {
        if (nivel >= 0) {
            this.nivel = nivel;
        } else {
            JOptionPane.showMessageDialog(null, "O nível deve ser positivo!");
        }
    }

    public void setEstado(boolean estado) {
        this.poluido = estado;
    }

    public void chover(float x) {
        this.nivel += x;
    }

    public void ensolarar(float x) {
        this.setNivel(this.nivel - x);
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
