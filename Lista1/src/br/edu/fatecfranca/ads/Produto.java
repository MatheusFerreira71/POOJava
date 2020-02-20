package br.edu.fatecfranca.ads;

public class Produto {

    public int id = 0, qtde = 0;
    public String descricao = "";
    public float preco = 0;

    public Produto() {

    }

    public Produto(int id, int qtde, String descricao, float peso) {
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
