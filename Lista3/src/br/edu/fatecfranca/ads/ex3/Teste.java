package br.edu.fatecfranca.ads.ex3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {
        Passageiro p1 = new Passageiro("378641979", "Matheus");
        Passageiro p2 = new Passageiro("985624571", "Alberto");
        Passageiro p3 = new Passageiro("654123568", "Ana");
        Passageiro p4 = new Passageiro("987456581", "Mário");
        Passageiro p5 = new Passageiro("124578659", "Mateus");
        Passageiro p6 = new Passageiro("986532452", "Yago");
        
        Onibus o1 = new Onibus();
        Onibus o2 = new Onibus();
        Onibus o3 = new Onibus();
        
        o1.setNumero(1);
        o1.setPlaca("abc1234");
        o2.setNumero(2);
        o2.setPlaca("def5678");
        o1.addPassageiro(p1);
        o1.addPassageiro(p2);
        o2.addPassageiro(p3);
        o2.addPassageiro(p4);
        o3.setNumero(o2.getNumero());
        o3.setPlaca("ghi9123");
        o3.addPassageiro(p5);
        o3.addPassageiro(p6);
        
        Rodoviaria r1 = new Rodoviaria();
        
        r1.setNome("Libâno Sampaio");
        r1.setCidade("Franca");
        
        r1.addOnibus(o1);
        r1.addOnibus(o2);
        
        JOptionPane.showMessageDialog(null, r1.toString());
        
        r1.deleteOnibus(o1);
        
        JOptionPane.showMessageDialog(null, r1.toString());
        
        r1.editOnibus(o2, o3);
        
        JOptionPane.showMessageDialog(null, r1.toString());
    }

}
