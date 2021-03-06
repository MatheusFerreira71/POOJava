package br.edu.fatecfranca.ads.ex2;

import java.util.ArrayList;

public class Curso {

    private int id;
    private String nome;
    private ArrayList<Disciplina> disciplinas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Curso() {
        this.id = 0;
        this.nome = "Teste";
        this.disciplinas = new ArrayList();
    }

    public Curso(int id, String nome, ArrayList<Disciplina> disciplinas) {
        this.id = id;
        this.nome = nome;
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Curso{" + "id=" + id + ", nome=" + nome + ", disciplinas=" + disciplinas + '}';
    }

    public void addDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public boolean deleteDisciplina(Disciplina disciplina) {
        return this.disciplinas.remove(disciplina);
    }

    public int findDisciplina(Disciplina disciplina) {
        return this.disciplinas.indexOf(disciplina);
    }

    public boolean editDisciplina(Disciplina atual, Disciplina nova) {
        int pos = this.findDisciplina(atual);
        if (pos != -1) {
            this.disciplinas.set(pos, nova);
            return true;
        } else {
            return false;
        }
    }
}
