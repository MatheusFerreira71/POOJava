package br.edu.fatecfranca.lista3.n;

import java.util.ArrayList;

public class State {

    private String name;
    private String initials;
    // Associação
    private ArrayList<City> cities;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    public State(String name, String initials, ArrayList<City> cities) {
        this.name = name;
        this.initials = initials;
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "State{" + "name=" + name + ", initials=" + initials + ", cities=" + cities + '}';
    }
    
    public void addCity(City city) {
        this.cities.add(city);
    }

    public boolean deleteCity(City city) {
        return this.cities.remove(city);
    }

    public int findCity(City city) {
        return this.cities.indexOf(city);
    }

    public boolean editCity(City oldCity, City newCity) {
        int pos = this.findCity(oldCity);
        if (pos != -1) {
            this.cities.set(pos, newCity);
            return true;
        } else {
            return false;
        }
    }
}
