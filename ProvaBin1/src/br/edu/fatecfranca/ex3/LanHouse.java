package br.edu.fatecfranca.ex3;

import java.util.ArrayList;

public class LanHouse {
    private ArrayList<Computador> computadores;

    public LanHouse(ArrayList<Computador> computadores) {
        this.computadores = computadores;
    }

    public LanHouse() {
        this.computadores = new ArrayList();
    }
    
    public void addComputador(Computador computador) {
        this.computadores.add(computador);
    }

    @Override
    public String toString() {
        return "\nLanHouse{" + "computadores=" + computadores + '}';
    }
}
