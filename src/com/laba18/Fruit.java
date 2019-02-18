package com.laba18;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;

public abstract class Fruit implements Serializable {

    public int weight;
    public String name, smell, color;

    public Fruit(String name, int weight, String color, String smell) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.smell = smell;
    }
}
