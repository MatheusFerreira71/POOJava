package br.edu.fatecfranca.ads.ex2;

import javax.swing.JOptionPane;

public class Produto {

    private int id, qtde;
    private String descricao;
    private float preco;

    public Produto() {
        this.id = 0;
        this.qtde = 0;
        this.descricao = "";
        this.preco = 0;
    }

    public Produto(int id, int qtde, String descricao, float preco) {
        this.setId(id);
        this.setQtde(qtde);
        this.descricao = descricao;
        this.setPreco(preco);
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            JOptionPane.showMessageDialog(null, "O id não pode ser 0 nem negativo!");
        }
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(float preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            JOptionPane.showMessageDialog(null, "O preço não pode ser negativo!");
        }
    }

    public int getId() {
        return this.id;
    }
    
    public int getQtde() {
        return this.qtde;
    }
    
    public float getPreco() {
        return this.preco;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    

    public void comprar(int x) {
        this.setQtde(this.qtde + x);
    }

    public void vender(int x) {
        this.setQtde(this.qtde - x);
    }

    public void subir(float x) {
        this.setPreco(this.preco + x);
    }

    public void descer(float x) {
        this.setPreco(this.preco - x);
    }

    public String mostrar() {
        return "Id: " + this.id + "\nQuantidade: " + this.qtde
                + "\nDescrição: " + this.descricao + "\nPreço: " + this.preco;
    }
}
