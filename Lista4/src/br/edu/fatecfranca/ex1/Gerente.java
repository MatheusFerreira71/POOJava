
package br.edu.fatecfranca.ex1;

public class Gerente extends Funcionario{
    private float comissao;

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public Gerente() {
        super();
    }

    public Gerente(float comissao, float horasTrabalho, float valorHora, String nome) {
        super(horasTrabalho, valorHora, nome);
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return "\nGerente{" + "comissao=" + this.comissao + super.toString() + '}';
    }
    
    @Override
    public void calculaSalario() {
        super.calculaSalario();
        this.salario += this.getComissao();
    }
}
