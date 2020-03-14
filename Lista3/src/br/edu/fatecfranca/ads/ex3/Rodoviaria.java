package br.edu.fatecfranca.ads.ex3;

import java.util.ArrayList;

public class Rodoviaria {

    private String nome, cidade;
    private ArrayList<Onibus> busoes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public ArrayList<Onibus> getBusões() {
        return busoes;
    }

    public void setBusões(ArrayList<Onibus> busões) {
        this.busoes = busões;
    }

    public Rodoviaria() {
        this.nome = "Teste";
        this.cidade = "Cidade Testes";
        this.busoes = new ArrayList();
    }

    public Rodoviaria(String nome, String cidade, ArrayList<Onibus> busões) {
        this.nome = nome;
        this.cidade = cidade;
        this.busoes = busões;
    }

    @Override
    public String toString() {
        return "\nRodoviaria{" + "nome=" + nome + ", cidade=" + cidade + ", busões=" + busoes + '}';
    }

    public void addOnibus(Onibus onibus) {
        this.busoes.add(onibus);
    }

    public boolean deleteOnibus(Onibus onibus) {
        return this.busoes.remove(onibus);
    }

    public int findOnibus(Onibus onibus) {
        return this.busoes.indexOf(onibus);
    }

    public boolean editOnibus(Onibus atual, Onibus nova) {
        int pos = this.findOnibus(atual);
        if (pos != -1) {
            this.busoes.set(pos, nova);
            return true;
        } else {
            return false;
        }
    }
}
