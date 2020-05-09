package br.edu.fatecfranca.lista3.n;

import java.util.ArrayList;

public class Country {
    private String continent;
    private String name;
    private String initials;
    private ArrayList<State> states;

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

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

    public ArrayList<State> getStates() {
        return states;
    }

    public void setStates(ArrayList<State> states) {
        this.states = states;
    }

    public Country(String continent, String name, String initials, ArrayList<State> states) {
        this.continent = continent;
        this.name = name;
        this.initials = initials;
        this.states = states;
    }

    @Override
    public String toString() {
        return "Country{" + "continent=" + continent + ", name=" + name + ", initials=" + initials + ", states=" + states + '}';
    }
    
    public void addState(State state) {
        this.states.add(state);
    }

    public boolean deleteState(State state) {
        return this.states.remove(state);
    }

    public int findState(State state) {
        return this.states.indexOf(state);
    }

    public boolean editState(State oldState, State newState) {
        int pos = this.findState(oldState);
        if (pos != -1) {
            this.states.set(pos, newState);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean addCityState (State state, City city) {
        int pos = this.findState(state);
        if(pos != -1) {
            state.addCity(city);
            return true;
        } else return false;
    }
}
