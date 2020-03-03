package br.edu.fatecfranca.ads.ex2;

import javax.swing.JOptionPane;

public class Aluno {

    //Atributos
    private int numeroAluno, idade;
    private String nome;
    private float p1, p2;

    //Getters
    public int getNumeroAluno() {
        return this.numeroAluno;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getNome() {
        return this.nome;
    }

    public float getP1() {
        return this.p1;
    }

    public float getP2() {
        return this.p2;
    }

    //Setters
    public void setNumeroAluno(int numeroAluno) {
        if (Integer.toString(numeroAluno).length() == 6) {
            this.numeroAluno = numeroAluno;
        } else {
            JOptionPane.showMessageDialog(null, "O número do aluno deve conter exatamente 6 digitos!");
            this.numeroAluno = 000000;
        }
    }

    public void setNome(String nome) {
        if (nome.length() >= 30) {
            this.nome = nome;
        } else {
            JOptionPane.showMessageDialog(null, "O nome do aluno pode ter no máximo 30 caracteres!");
            this.nome = "Teste";
        }
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            JOptionPane.showMessageDialog(null, "A idade não pode ser negativa!");
            this.idade = 0;
        }
    }

    public void setP1(float p1) {
        if (p1 >= 0) {
            this.p1 = p1;
        } else {
            JOptionPane.showMessageDialog(null, "A prova 1 não pode ser negativa!");
            this.p1 = 0;
        }
    }

    public void setP2(float p2) {
        if (p2 >= 0) {
            this.p2 = p2;
        } else {
            JOptionPane.showMessageDialog(null, "A prova 2 não pode ser negativa!");
            this.p2 = 0;
        }
    }

    //Construrores
    public Aluno() {
        this.numeroAluno = 0;
        this.nome = "Teste";
        this.idade = 0;
        this.p1 = 0;
        this.p2 = 0;
    }

    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        this.setNumeroAluno(numeroAluno);
        this.setNome(nome);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }
    
    //Métodos operacionais
    public float notaFinal() {
        return (this.p1 + this.p2) / 2;
    }
    
    public String toString() {
        return "N° do Aluno: " + this.numeroAluno + "\nNome: " + this.nome + ""
                + "\nIdade: " + this.idade;
    }
}
