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
            String nConta = Character.toString(numeroConta.charAt(7));
            if (numeroConta.indexOf("-") == 6 && !"-".equals(nConta)) {
                this.numeroConta = numeroConta;
            } else {
                JOptionPane.showMessageDialog(null, "Número de conta inválido, "
                        + "coloque o - no penúltimo digito");
                this.numeroConta = "000000-0";  
            }
        } else {
            JOptionPane.showMessageDialog(null, "O número da conta deve ter 8 digitos!");
        }
    }

    public void setNumeroAgencia(String numeroAgencia) {
        if (numeroAgencia.length() == 6) {
            String nAgencia = Character.toString(numeroAgencia.charAt(7));
            if (numeroAgencia.indexOf("-") == 4 && !"-".equals(nAgencia)) {
                this.numeroAgencia = numeroAgencia;
            } else {
                JOptionPane.showMessageDialog(null, "Número de agência inválido,"
                        + " coloque o - no penúltimo digito!");
                this.numeroAgencia = "0000-0";
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
            this.nome = "Teste";
        }
    }

    public void setSaldo(float saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            JOptionPane.showMessageDialog(null, "O saldo não pode ser negativo");
            this.saldo = 0;
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
