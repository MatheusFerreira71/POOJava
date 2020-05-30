package br.edu.fatecfranca.ex3;

import javax.swing.JOptionPane;

public class Testa {

    public static void main(String[] args) {
        Notebook not = new Notebook(1000, "Notebook bom");
        Desktop desk = new Desktop(400, "Desktop Bom");
        LanHouse lan = new LanHouse();

        lan.addComputador(not);
        lan.addComputador(desk);

        JOptionPane.showMessageDialog(null, lan.toString());
    }
    
    // A lanhouse aceita os dois tipos de computador pois notebook e desktop são computadores, eles
    // herdam da classe pai computador, isso ocorre devido ao polimorfismo.
}
