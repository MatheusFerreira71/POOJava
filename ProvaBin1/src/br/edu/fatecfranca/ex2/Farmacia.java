package br.edu.fatecfranca.ex2;

import java.util.ArrayList;

public class Farmacia {
    private String nome, cnpj;
    private ArrayList<Remedio> remedios;

    public Farmacia(String nome, String cnpj, ArrayList<Remedio> remedios) {
        this.setNome(nome);
        this.setCnpj(cnpj);
        this.setRemedios(remedios);
    }

    public Farmacia() {
        this.setRemedios(new ArrayList());
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Remedio> getRemedios() {
        return this.remedios;
    }

    public void setRemedios(ArrayList<Remedio> remedios) {
        this.remedios = remedios;
    }

    @Override
    public String toString() {
        return "Farmacia{" + "nome=" + this.nome + ", cnpj=" + this.cnpj + ", remedios=" + this.remedios + '}';
    }
    
    public void addRemedio (Remedio remedio) {
        this.remedios.add(remedio);
    }
    
    public boolean removeRemedio (Remedio remedio) {
        return this.remedios.remove(remedio);
    }
    
    public int getRemedio (Remedio remedio) {
        return this.remedios.indexOf(remedio);
    }
    
    public boolean updateRemedio (Remedio atual, Remedio novo) {
        int pos = this.getRemedio(atual);
        if (pos != -1) {
            this.remedios.set(pos, novo);
            return true;
        } else return false;
    }
}
