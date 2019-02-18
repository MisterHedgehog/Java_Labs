package com.laba18;

public class Apple extends Fruit {

    public Apple(String name, int weight, String color, String smell) {
        super(name, weight, color, smell);
    }

    @Override
    public String toString() {
        return "Яблоко{" +
                "имя='" + name + '\'' +
                ", масса=" + weight +
                ", запах='" + smell + '\'' +
                ", цвет='" + color + '\'' +
                '}';
    }
}
