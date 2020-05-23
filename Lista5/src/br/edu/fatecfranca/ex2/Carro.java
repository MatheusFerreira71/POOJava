package br.edu.fatecfranca.ex2;

public class Carro extends Veiculo{
    private float capPortaMalas;

    public float getCapPortaMalas() {
        return capPortaMalas;
    }

    public void setCapPortaMalas(float capPortaMalas) {
        this.capPortaMalas = capPortaMalas;
    }

    public Carro(float capPortaMalas) {
        super();
        this.capPortaMalas = capPortaMalas;
    }

    public Carro(float capPortaMalas, String modelo, int ano) {
        super(modelo, ano);
        this.capPortaMalas = capPortaMalas;
    }

    public Carro() {
        super();
    }

    @Override
    public String toString() {
        return "\nCarro{" + "capPortaMalas=" + capPortaMalas + super.toString() +'}';
    }
}
