package com.laba18;

public class Banana extends Fruit {

    public Banana(String name, int weight, String color, String smell) {
        super(name, weight, color, smell);
    }
    @Override
    public String toString() {
        return "Банан{" +
                "имя='" + name + '\'' +
                ", масса=" + weight +
                ", запах='" + smell + '\'' +
                ", цвет='" + color + '\'' +
                '}';
    }
}
