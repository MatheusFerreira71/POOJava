package br.edu.fatecfranca.ads.ex3;

import java.util.ArrayList;

public class Onibus {
    private int numero;
    private String placa;
    private ArrayList<Passageiro> passageiros;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public ArrayList<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(ArrayList<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }

    public Onibus() {
        this.numero = 0;
        this.placa = "Teste";
        this.passageiros = new ArrayList();
    }

    public Onibus(int numero, String placa, ArrayList<Passageiro> passageiros) {
        this.numero = numero;
        this.placa = placa;
        this.passageiros = passageiros;
    }

    @Override
    public String toString() {
        return "\nOnibus{" + "numero=" + numero + ", placa=" + placa + ", passageiros=" + passageiros + '}';
    }
    
    public void addPassageiro(Passageiro passageiro) {
        this.passageiros.add(passageiro);
    }

    public boolean deletePassageiro(Passageiro passageiro) {
        return this.passageiros.remove(passageiro);
    }

    public int findPassageiro(Passageiro passageiro) {
        return this.passageiros.indexOf(passageiro);
    }

    public boolean editPassageiro(Passageiro atual, Passageiro nova) {
        int pos = this.findPassageiro(atual);
        if (pos != -1) {
            this.passageiros.set(pos, nova);
            return true;
        } else {
            return false;
        }
    }
}
