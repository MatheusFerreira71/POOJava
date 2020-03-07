package br.edu.fatecfranca.ads.ex1;

import java.util.Date;
import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {
        Passageiro peter = new Passageiro("Peter Parker", "45658978945");
        Voo voo370 = new Voo("370", "Atlântida");
        Reserva reserva = new Reserva(1, new Date(), peter, voo370);
        
        JOptionPane.showMessageDialog(null, reserva.toString());
        
        reserva.setDate(new Date());
        reserva.setCodigo(2);
        (reserva.getPassageiro()).setNome("Matheus");
        (reserva.getPassageiro()).setCpf("45223293851");
        (reserva.getVoo()).setDestino("França");
        (reserva.getVoo()).setNumero("54");
        
        JOptionPane.showMessageDialog(null, reserva.toString());
        
    }

}
