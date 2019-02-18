package com.laba8_.task1;

public class Sphere {
    private double radius;
    private double weight;

    Sphere(double radius, double wight) {
        this.radius = radius;
        this.weight = wight;
    }

    Sphere() {
        this.radius = Double.NaN;
        this.weight = Double.NaN;
    }

    public double getRadius() {
        return radius;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Объект класса Шар{" + "радиус=" + radius + ", масса=" + weight + '}';
    }
}
