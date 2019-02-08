package com.laba9;

import java.util.ArrayList;

class Brilliant extends Diamond {

    private Brilliant(double weight) {
        super(weight);
    }
    static Brilliant update(Diamond diamond){
        return new Brilliant(diamond.weight);
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
        return "Бриллиант{" + "прозрачность=" + transparency + ", масса=" + weight + ", стоимость=" + cost + '}';
    }
}
