package br.edu.fatecfranca.ads.ex1;

import javax.swing.JOptionPane;

public class TesteCliente {
    public static void main(String[] args) {
        Cliente Fulano = new Cliente("1234-2", "234123-4", "Fulano", 45);
    
        Fulano.realiazarDeposito(100);
        Fulano.realiazarSaque(80);
        
        // Fulano.saldo == Erro, não tem permissão de acesso.
        
        Cliente Beltrano = new Cliente("1224-6", "234112-4", "Beltrano", 56000);
    
        Beltrano.realiazarDeposito(100);
        Beltrano.realiazarSaque(80);
        
        JOptionPane.showMessageDialog(null, Fulano.toString());
        JOptionPane.showMessageDialog(null, Beltrano.toString());
    }
}
