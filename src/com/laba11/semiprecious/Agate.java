package com.laba11.semiprecious;

import java.util.ArrayList;

public class Agate extends SemipreciousStone {

    public Agate(double weight) {
        super(0.9, weight);
    }

    @Override
    public ArrayList<Agate> broke() {
        ArrayList<Agate> stones = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            stones.add(new Agate(this.weight/3));
        }
        return stones;
    }

    @Override
    public String toString() {
        return "Агат{" + "прозрачность=" + transparency + ", масса=" + weight + " карат, стоимость=" + cost + '}';
    }
}
