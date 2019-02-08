package com.laba8.task2;

class Agate extends SemipreciousStone {
    Agate(double weight) {
        super(0.9, weight);
    }
    @Override
    public String toString() {
        return "Агат{" + "прозрачность=" + transparency + ", масса=" + weight + " карат, стоимость=" + cost + '}';
    }
}
