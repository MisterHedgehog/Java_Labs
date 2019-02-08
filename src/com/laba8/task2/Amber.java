package com.laba8.task2;

class Amber extends SemipreciousStone {
    public Amber(double weight) {
        super(0.5, weight);
    }

    @Override
    public String toString() {
        return "Янтарь{" + "прозрачность=" + transparency + ", масса=" + weight + " карат, стоимость=" + cost + '}';
    }
}
