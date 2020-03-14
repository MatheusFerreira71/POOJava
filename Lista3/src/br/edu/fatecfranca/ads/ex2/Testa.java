package br.edu.fatecfranca.ads.ex2;

import javax.swing.JOptionPane;

public class Testa {

    public static void main(String[] args) {
        Disciplina d1 = new Disciplina(1, "POO");
        Disciplina d2 = new Disciplina(2, "Cálculo");
        Disciplina d3 = new Disciplina(3, "ED");
        Disciplina d4 = new Disciplina(4, "IHC");
        
        Curso cr = new Curso();
        cr.setId(1);
        cr.setNome("ADS");
        cr.addDisciplina(d1);
        cr.addDisciplina(d2);
        cr.addDisciplina(d3);
        cr.addDisciplina(d4);
        
        JOptionPane.showMessageDialog(null, cr.toString());
        
        cr.deleteDisciplina(d2);
        
        JOptionPane.showMessageDialog(null, cr.toString());
        
        Disciplina d5 = new Disciplina(d3.getId(), "Estrutura de dados");
        
        cr.editDisciplina(d3, d5);
        
        JOptionPane.showMessageDialog(null, cr.toString());
    }

}
