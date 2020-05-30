package br.edu.fatecfranca.ex3;

public class Notebook extends Computador{
    private float capBat;

    public float getCapBat() {
        return this.capBat;
    }

    public void setCapBat(float capBat) {
        this.capBat = capBat;
    }

    public Notebook(float capBat, String descricao) {
        super(descricao);
        this.setCapBat(capBat);
    }

    public Notebook(float capBat) {
        this.setCapBat(capBat);
    }

    public Notebook() {
        super();
    }

    @Override
    public String toString() {
        return "\nNotebook{" + "capBat=" + this.capBat + super.toString() + '}';
    }
    
    
}
