package br.edu.fatecfranca.ads.ex1;

import javax.swing.JOptionPane;

public class TesteRio {

    public static void main(String[] args) {

        Rio rio1 = new Rio("Solimões", 65874, false);
        Rio rio2 = new Rio("Rio Negro", 500000, true);

        rio1.chover(10237);
        rio2.chover(1234);
        rio1.ensolarar(213);
        rio2.ensolarar(5123);

        rio1.sujar();
        rio2.limpar();

        JOptionPane.showMessageDialog(null, rio1.mostra(), "Rio 1", 1);
        JOptionPane.showMessageDialog(null, rio2.mostra(), "Rio 2", 1);

    }
} 
