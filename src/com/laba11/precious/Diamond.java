package com.laba11.precious;

import java.util.ArrayList;

public class Diamond extends PreciousStone {
    public Diamond(double weight) {
        super(0.1, weight);
    }

    @Override
    public ArrayList<Diamond> broke() {
        ArrayList<Diamond> stones = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            stones.add(new Diamond(this.weight/2));
        }
        return stones;
    }

    public Brilliant update(){
        return new Brilliant(this.weight);
    }

    @Override
    public String toString() {
        return "Алмаз{" + "прозрачность=" + transparency + ", масса=" + weight + " карат, стоимость=" + cost + '}';
    }
}
