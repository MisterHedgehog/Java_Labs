package com.laba11.precious;

import java.util.ArrayList;

public class Brilliant extends Diamond {

    Brilliant(double weight) {
        super(weight);
    }

    @Override
    public ArrayList<Diamond> broke() {
        ArrayList<Diamond> stones = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            stones.add(new Diamond(this.weight/2));
        }
        return stones;
    }

    @Override
    public String toString() {
        return "Бриллиант{" + "прозрачность=" + transparency + ", масса=" + weight + ", стоимость=" + cost + '}';
    }
}
