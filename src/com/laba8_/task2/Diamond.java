package com.laba8_.task2;

class Diamond extends PreciousStone {
    Diamond(double weight) {
        super(0.1, weight);
    }

    @Override
    public String toString() {
        return "Алмаз{" + "прозрачность=" + transparency + ", масса=" + weight + " карат, стоимость=" + cost + '}';
    }
}
