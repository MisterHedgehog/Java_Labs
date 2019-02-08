package com.laba9;

import java.util.ArrayList;

class Agate extends SemipreciousStone {

    Agate(double weight) {
        super(0.9, weight);
    }

    @Override
    ArrayList<Agate> broke() {
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
