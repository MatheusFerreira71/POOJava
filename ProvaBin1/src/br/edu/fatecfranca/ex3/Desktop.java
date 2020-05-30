
package br.edu.fatecfranca.ex3;

public class Desktop extends Computador{
    private float tamGab;

    public Desktop(float tamGab, String descricao) {
        super(descricao);
        this.setTamGab(tamGab);
    }

    public Desktop(float tamGab) {
        this.tamGab = tamGab;
    }

    public Desktop() {
        super();
    }

    public float getTamGab() {
        return tamGab;
    }

    public void setTamGab(float tamGab) {
        this.tamGab = tamGab;
    }

    @Override
    public String toString() {
        return "\nDesktop{" + "tamGab=" + this.tamGab + super.toString() +'}';
    }
}
