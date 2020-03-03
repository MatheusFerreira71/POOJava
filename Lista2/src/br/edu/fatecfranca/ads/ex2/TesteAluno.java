package br.edu.fatecfranca.ads.ex2;

import javax.swing.JOptionPane;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno Pedro = new Aluno(123456, "Pedro Santana", 18, 7, 10);
        
        JOptionPane.showMessageDialog(null, Pedro.toString());
        JOptionPane.showMessageDialog(null, "A média é: " + Pedro.notaFinal());
        
//        Pedro.nome = "Carlos";
//        JOptionPane.showMessageDialog(null, Pedro.nome)); Os dois casos dão 
//        erro de privilégios;

        
    }
}
