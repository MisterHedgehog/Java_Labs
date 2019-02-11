package com.laba10.task2;

import java.util.ArrayList;

class Ruby extends PreciousStone {
    Ruby(double weight) {
        super(0.2, weight);
    }

    @Override
    public ArrayList<Ruby> broke() {
        ArrayList<Ruby> stones = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            stones.add(new Ruby(this.weight/5));
        }
        return stones;
    }

    @Override
    public String toString() {
        return "Рубин{" + "прозрачность=" + transparency + ", масса=" + weight + " карат, стоимость=" + cost + '}';
    }
}
