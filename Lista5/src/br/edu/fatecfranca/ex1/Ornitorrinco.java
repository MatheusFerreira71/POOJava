package br.edu.fatecfranca.ex1;

public class Ornitorrinco implements Ave, Mamifero {

    @Override
    public String porOvos() {
        return "Ornitorrinco pondo ovos";
    }

    @Override
    public String darMama() {
        return "Ornitorrinco dando de mama";
    }

}
