package br.edu.fatecfranca.ads.ex2;

import javax.swing.JOptionPane;

public class TesteProduto {

    public static void main(String[] args) {
        Produto produto1 = new Produto(1, 40, "Carro Teste B", 15000);
        Produto produto2 = new Produto(2, 50, "Carro Teste A", 10000);

        produto1.comprar(4);
        produto1.vender(10);
        produto2.comprar(9);
        produto2.vender(5);

        produto1.subir(200);
        produto2.subir(300);
        produto1.descer(150);
        produto2.descer(500);

        JOptionPane.showMessageDialog(null, produto1.mostrar(), "Produto 1", 1);
        JOptionPane.showMessageDialog(null, produto2.mostrar(), "Produto 2", 1);
    }
}
