package br.edu.fatecfranca.ex2;

import java.util.ArrayList;

public class Montadora {
    private String nome, cnpj;
    private ArrayList<Veiculo> veiculos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public Montadora(String nome, String cnpj, ArrayList<Veiculo> veiculos) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.veiculos = veiculos;
    }

    public Montadora() {
        this.veiculos = new ArrayList();
    }
    
    public void addVeiculo (Veiculo veiculo) {
        this.veiculos.add(veiculo);
    }
    
    public boolean removeVeiculo (Veiculo veiculo) {
        return this.veiculos.remove(veiculo);
    }
    
    public int getVeiculo (Veiculo veiculo) {
        return this.veiculos.indexOf(veiculo);
    }
    
    public boolean updateVeiculo (Veiculo atual, Veiculo novo) {
        int pos = this.getVeiculo(atual);
        if (pos != -1) {
            this.veiculos.set(pos, novo);
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return "\nMontadora{" + "nome=" + nome + ", cnpj=" + cnpj + ", veiculos=" + veiculos + '}';
    }
}
