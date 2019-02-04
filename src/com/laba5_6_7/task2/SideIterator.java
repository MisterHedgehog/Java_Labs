package com.laba5_6_7.task2;

import java.util.Iterator;


public class SideIterator implements Iterator<Double> {

    private int index;
    private double[] sides;

    SideIterator(double... sides){
        this.sides = sides;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < sides.length;
    }

    @Override
    public Double next() {
        return sides[index++];
    }
}
