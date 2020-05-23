package br.edu.fatecfranca.ex2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Testa {

    public static void main(String[] args) {
        Montadora monta1 = new Montadora("Hyundai", "12345678925", new ArrayList());
        
        Carro car1 = new Carro(1000, "SUV Creta", 2020);
        Moto moto1 = new Moto("Torto", "CB300", 2020);
        
        monta1.addVeiculo(car1);
        monta1.addVeiculo(moto1);
        JOptionPane.showMessageDialog(null, monta1.toString());
    }

}
