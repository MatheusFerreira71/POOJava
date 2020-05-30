package br.edu.fatecfranca.ex1;

import javax.swing.JOptionPane;

public class Computador {

    private String state;
    private int RAM;

    public Computador(String state, int RAM) {
        this.setState(state);
        this.setRAM(RAM);
    }

    public Computador() {
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        if (state != "em repouso" && state != "ligado" && state != "desligado") {
            JOptionPane.showMessageDialog(null, "Os estados só pode ser, 'em repouso', 'desligado' e 'ligado'");
        } else this.state = state;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        if (RAM != 4 && RAM != 8 && RAM != 16 && RAM != 32) {
            JOptionPane.showMessageDialog(null, "A capacidade de memória só poder ser 4, 8, 16, 32");
        } else this.RAM = RAM;
    }

    public void RAMUpgrade(int x) {
        this.setRAM(this.getRAM() + x);
    }
}
