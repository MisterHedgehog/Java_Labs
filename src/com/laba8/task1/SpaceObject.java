package com.laba8.task1;

abstract class SpaceObject extends Ball {

    String name;
    private double velocity;

    SpaceObject(double radius, double wight, double velocity, String name) {
        super(radius, wight);
        this.velocity = velocity;
        this.name = name;
    }

    SpaceObject(String name) {
        this.velocity = Double.NaN;
        this.name = name;
    }

    SpaceObject() {
        super();
        this.velocity = Double.NaN;
    }

    double getVelocity() {
        return velocity;
    }

    @Override
    public String toString() {
        return "Объект класса Космическое тело{" + "имя='" + name + '\'' + ", скорость=" + velocity + '}';
    }
}
