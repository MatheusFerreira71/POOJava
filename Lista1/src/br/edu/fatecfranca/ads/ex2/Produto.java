package br.edu.fatecfranca.ads.ex2;

public class Produto {

    private int id = 0, qtde = 0;
    private String descricao = "";
    private float preco = 0;

    public Produto(int id, int qtde, String descricao, float preco) {
        this.id = id;
        this.qtde = qtde;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    public void comprar(int x) {
        this.qtde += x;
    }
    
    public void vender(int x) {
        this.qtde -= x;
    }
    
    public void subir(float x) {
        this.preco += x;
    }
    
    public void descer(float x) {
        this.preco -= x;
    }
    
    public String mostrar() {
        return "Id: " + this.id + "\nQuantidade: " + this.qtde + 
                "\nDescrição: " + this.descricao + "\nPreço: " + this.preco;
    }
}
