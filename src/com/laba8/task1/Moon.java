package com.laba8.task1;

class Moon extends SpaceObject {

    private boolean isAtmosphere;

    Moon(double radius, double wight, double velocity, boolean isAtmosphere, String name) {
        super(radius, wight, velocity, name);
        this.isAtmosphere = isAtmosphere;
    }

    Moon(String name) {
        super(name);
    }

    boolean isAtmosphere() {
        return isAtmosphere;
    }

    @Override
    public String toString() {
        return "Объект класса Луна{" + "имя='" + name + '\'' + '}';
    }
}
