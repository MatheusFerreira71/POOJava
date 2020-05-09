package br.edu.fatecfranca.lista3.n;
import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {
       City city1 = new City(400000, "Franca");
       City city2 = new City(900000, "Ribeirão Preto");
       City city3 = new City(17000, "Ibiraci");
       
       State state1 = new State("São Paulo", "SP", new ArrayList());
       
       state1.addCity(city1);
       state1.addCity(city2);
       
       System.out.println(state1.toString());
       
       state1.deleteCity(city1);
       System.out.println(state1.toString());
       
       Country country1 = new Country("América do Sul", "Brasil", "BR", new ArrayList());
       
       State state2 = new State("Minas Gerais", "MG", new ArrayList());
       
       country1.addState(state2);
       country1.addState(state1);
       country1.addCityState(state2, city3);
       
       System.out.println(country1.toString());
    }
    
}
