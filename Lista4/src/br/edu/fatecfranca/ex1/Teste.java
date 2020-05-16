package br.edu.fatecfranca.ex1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Teste {

    public static void calculaSalarioMostra(Funcionario camaleao) {
        camaleao.calculaSalario();
        JOptionPane.showMessageDialog(null, camaleao.toString());
    }
    public static void main(String[] args) {
        
        Funcionario gerente = new Gerente(500, 48, 100, "Arthur Connors");
        Funcionario diretor = new Diretor(4000, "Gipe Renegate", 48, 130, "Norman Osborn");
        calculaSalarioMostra(gerente);
        calculaSalarioMostra(diretor);
        
        Departamento contabil = new Departamento("Contábil", "Contabilidade", new ArrayList());
        contabil.addFuncionario(diretor);
        contabil.addFuncionario(gerente);
        
        JOptionPane.showMessageDialog(null, contabil.toString());
    }

}
