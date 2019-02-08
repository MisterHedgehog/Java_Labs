package com.laba8.task1;

class Planet extends SpaceObject {

    private boolean isInhabited;
    private Moon moon;

    Planet(double radius, double wight, double velocity, boolean isInhabited, String name) {
        super(radius, wight, velocity, name);
        this.isInhabited = isInhabited;
    }

    Planet(String name) {
        super(name);
    }

    boolean isInhabited() {
        return isInhabited;
    }

    Moon getMoon() {
        return moon;
    }

    void setMoon(Moon moon) {
        this.moon = moon;
    }

    @Override
    public String toString() {
        return "Объект класса Планета{" + "имя='" + name + '\'' + '}';
    }
}
