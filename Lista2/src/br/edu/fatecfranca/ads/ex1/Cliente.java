package br.edu.fatecfranca.ads.ex1;

import javax.swing.JOptionPane;

public class Cliente {

    //Atributos
    private String numeroConta, numeroAgencia, nome;
    private float saldo;

    //Getters and Setters
    public String getNumeroConta() {
        return this.numeroConta;
    }

    public String getNumeroAgencia() {
        return this.numeroAgencia;
    }

    public String getNome() {
        return this.nome;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setNumeroConta(String numeroConta) {
        if (numeroConta.length() == 8) {
            if (numeroConta.indexOf("-") == 6) {
                this.numeroConta = numeroConta;
            } else {
                JOptionPane.showMessageDialog(null, "Número de conta inválido, coloque o - no penúltimo digito");
            }
        } else {
            JOptionPane.showMessageDialog(null, "O número da conta deve ter 8 digitos!");
        }
    }

    public void setNumeroAgencia(String numeroAgencia) {
        if (numeroAgencia.length() == 6) {
            if (numeroAgencia.indexOf("-") == 4) {
                this.numeroAgencia = numeroAgencia;
            } else {
                JOptionPane.showMessageDialog(null, "Número de agência inválido, coloque o - no penúltimo digito!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "O número da conta deve ter 8 digitos!");
        }
    }

    public void setNome(String nome) {
        if (nome.length() <= 30) {
            this.nome = nome;
        } else {
            JOptionPane.showMessageDialog(null, "O nome não pode ser maior que 30 caracteres!");
        }
    }

    public void setSaldo(float saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            JOptionPane.showMessageDialog(null, "O saldo não pode ser negativo");
        }
    }

    //Contrutores
    public Cliente() {
        this.numeroAgencia = "";
        this.numeroConta = "";
        this.nome = "";
        this.saldo = 0;
    }

    public Cliente(String numAgencia, String numConta, String nome, float saldo) {
        this.setNumeroAgencia(numAgencia);
        this.setNumeroConta(numConta);
        this.setNome(nome);
        this.setSaldo(saldo);
    }

    //Métodos
    public void realiazarDeposito(float x) {
        this.setSaldo(this.saldo + x);
    }

    public void realiazarSaque(float x) {
        this.setSaldo(this.saldo - x);
    }

    public String toString() {
        return "Cliente: " + this.nome + "\nN° da Conta: " + this.numeroConta
                + "\nN° da Agência: " + this.numeroAgencia + "\nSaldo R$: "
                + this.saldo;
    }
}
