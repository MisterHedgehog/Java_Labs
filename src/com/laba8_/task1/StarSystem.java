package com.laba8_.task1;

import java.util.ArrayList;

class StarSystem {

    private Star star;
    private ArrayList<Planet> planets;

    StarSystem(Star star) {
        this.star = star;
        this.planets = new ArrayList<>();
    }

    ArrayList<Planet> getPlanets() {
        return planets;
    }

    void setPlanets(ArrayList<Planet> planets) {
        this.planets = planets;
    }

    void addPlanet(Planet planet){
        planets.add(planet);
    }

    void showPlanetCount(){
        System.out.println("Количество планет в звёздной системе: " + planets.size());
    }

    void showStarName(){
        star.showName();
    }

    @Override
    public String toString() {
        return "Объект класса Звёздная система{" + "star=" + star + '}';
    }
}
