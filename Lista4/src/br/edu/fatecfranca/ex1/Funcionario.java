package br.edu.fatecfranca.ex1;

public abstract class Funcionario {
    protected float salario, horasTrabalho, valorHora;
    protected String nome;

    public float getSalario() {
        return salario;
    }

    private void setSalario(float salario) {
        this.salario = salario;
    }

    public float getHorasTrabalho() {
        return horasTrabalho;
    }

    public void setHorasTrabalho(float horasTrabalho) {
        this.horasTrabalho = horasTrabalho;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario() {
    }

    public Funcionario(float horasTrabalho, float valorHora, String nome) {
        this.horasTrabalho = horasTrabalho;
        this.valorHora = valorHora;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nInformações{" + "salario=" + salario + ", horasTrabalho=" + horasTrabalho + ", valorHora=" + valorHora + ", nome=" + nome + '}';
    }
    
    public void calculaSalario() {
        this.setSalario(this.getHorasTrabalho() * this.valorHora);
    }
}
