package br.edu.fatecfranca.ads;

import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto(2, 50, "Carro Teste A", 10000);

        Rio rio1 = new Rio();
        Rio rio2 = new Rio("Rio Negro", 500000, true);

        produto1.id = 1;
        produto1.qtde = 30;
        produto1.descricao = "Carro Teste B";
        produto1.preco = 20000;

        rio1.nome = "Solimões";
        rio1.nivel = 100000;
        rio1.poluido = false;

        produto1.comprar(4);
        produto1.vender(10);
        produto2.comprar(9);
        produto2.vender(5);

        produto1.subir(200);
        produto2.subir(300);
        produto1.descer(150);
        produto2.descer(500);

        produto1.mostrar();
        produto2.mostrar();

        rio1.chover(10237);
        rio2.chover(1234);
        rio1.ensolar(213);
        rio2.ensolar(5123);

        rio1.sujar();
        rio2.limpar();

        JOptionPane.showMessageDialog(null, produto1.mostrar());
        JOptionPane.showMessageDialog(null, produto2.mostrar());

        JOptionPane.showMessageDialog(null, rio1.mostra());
        JOptionPane.showMessageDialog(null, rio2.mostra());

    }
}
