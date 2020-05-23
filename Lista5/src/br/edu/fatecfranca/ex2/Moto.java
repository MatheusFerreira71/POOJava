
package br.edu.fatecfranca.ex2;

public class Moto extends Veiculo{
    private String guidao;

    public Moto(String guidao) {
        this.guidao = guidao;
    }

    public Moto(String guidao, String modelo, int ano) {
        super(modelo, ano);
        this.guidao = guidao;
    }

    public Moto() {
        super();
    }

    public String getGuidao() {
        return guidao;
    }

    public void setGuidao(String guidao) {
        this.guidao = guidao;
    }

    @Override
    public String toString() {
        return "\nMoto{" + "guidao=" + guidao + super.toString() +'}';
    }
}
