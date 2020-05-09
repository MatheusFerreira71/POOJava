package br.edu.fatecfranca.lista3.n;

public class City {

    private int population;
    private String name;

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City(int population, String name) {
        this.population = population;
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" + "population=" + population + ", name=" + name + '}';
    }

}
