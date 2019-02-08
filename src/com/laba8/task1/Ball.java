package com.laba8.task1;

public class Ball {
    private double radius;
    private double weight;

    Ball(double radius, double wight) {
        this.radius = radius;
        this.weight = wight;
    }

    Ball() {
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
