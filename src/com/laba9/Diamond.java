package com.laba9;

import java.util.ArrayList;

class Diamond extends PreciousStone {
    Diamond(double weight) {
        super(0.1, weight);
    }

    @Override
    ArrayList<Diamond> broke() {
        ArrayList<Diamond> stones = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            stones.add(new Diamond(this.weight/2));
        }
        return stones;
    }

    @Override
    public String toString() {
        return "Алмаз{" + "прозрачность=" + transparency + ", масса=" + weight + " карат, стоимость=" + cost + '}';
    }
}
