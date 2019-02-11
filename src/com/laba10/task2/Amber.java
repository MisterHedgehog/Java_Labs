package com.laba10.task2;

import java.util.ArrayList;

class Amber extends SemipreciousStone {
    public Amber(double weight) {
        super(0.5, weight);
    }

    @Override
    public ArrayList<Amber> broke() {
        ArrayList<Amber> stones = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            stones.add(new Amber(this.weight/4));
        }
        return stones;
    }

    @Override
    public String toString() {
        return "Янтарь{" + "прозрачность=" + transparency + ", масса=" + weight + " карат, стоимость=" + cost + '}';
    }
}
