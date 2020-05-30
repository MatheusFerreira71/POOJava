package br.edu.fatecfranca.ex2;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class Testa {

    public static void main(String[] args) {
        Remedio rem1 = new Remedio("Lozartana", "Bayer", new Date());
        Remedio rem2 = new Remedio("Predinizona", "Bayer", new Date());

        Farmacia far = new Farmacia("Droga Farma", "1234568654", new ArrayList());
        
        far.addRemedio(rem1);
        JOptionPane.showMessageDialog(null, far.toString());
        far.updateRemedio(rem1, rem2);
        JOptionPane.showMessageDialog(null, far.toString());
        far.addRemedio(rem1);
        JOptionPane.showMessageDialog(null, far.toString());
        JOptionPane.showMessageDialog(null, far.getRemedio(rem1));
        far.removeRemedio(rem2);
        JOptionPane.showMessageDialog(null, far.toString());
    }

}
