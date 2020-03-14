package br.edu.fatecfranca.ads.ex3;

public class Passageiro {

    private String nome, rg;

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Passageiro() {
        this.rg = "000000000";
        this.nome = "Teste";
    }

    public Passageiro(String rg, String nome) {
        this.rg = rg;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nPassageiro{" + "nome=" + nome + ", rg=" + rg + '}';
    }

}
