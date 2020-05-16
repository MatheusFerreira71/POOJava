
package br.edu.fatecfranca.ex1;

public class Diretor extends Funcionario{
    private float bonus;
    private String carro;

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public Diretor() {
        super();
    }

    public Diretor(float bonus, String carro, float horasTrabalho, float valorHora, String nome) {
        super(horasTrabalho, valorHora, nome);
        this.bonus = bonus;
        this.carro = carro;
    }

    @Override
    public String toString() {
        return "\nDiretor{" + "bonus=" + this.bonus + ", carro=" + this.carro + 
                super.toString() + '}';
    }
    
    @Override
    public void calculaSalario() {
        super.calculaSalario();
        this.salario += this.bonus;
    }
}
