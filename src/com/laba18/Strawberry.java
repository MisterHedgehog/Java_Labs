package com.laba18;

public class Strawberry extends Fruit {

    public Strawberry(String name, int weight, String color, String smell) {
        super(name, weight, color, smell);
    }
    @Override
    public String toString() {
        return "Клубника{" +
                "имя='" + name + '\'' +
                ", масса=" + weight +
                ", запах='" + smell + '\'' +
                ", цвет='" + color + '\'' +
                '}';
    }
}
