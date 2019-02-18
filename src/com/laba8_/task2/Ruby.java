package com.laba8_.task2;

class Ruby extends PreciousStone{
    Ruby(double weight) {
        super(0.2, weight);
    }
    @Override
    public String toString() {
        return "Рубин{" + "прозрачность=" + transparency + ", масса=" + weight + " карат, стоимость=" + cost + '}';
    }
}
