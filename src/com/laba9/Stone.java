package com.laba9;

import java.util.ArrayList;

abstract class Stone implements Comparable<Stone> {
    double transparency, weight, cost;

    Stone(double transparency, double weight) {
        this.transparency = transparency;
        this.weight = weight;
        countCost();
    }
    private void countCost(){
     cost = weight / transparency;
    }

    /**
     * Функция, сравнивающая стоимость камней
     * @param stone камень, с которым будет сравниваться экземпляр класса
     * @return
     * возвращает 1, если стоимость stone больше,
     * возвращает -1 в обратном случае.
     */
    @Override
    public int compareTo(Stone stone) {
        return this.cost > stone.cost ? -1 : 1;
    }

    abstract <T extends Stone> ArrayList<T> broke();

    @Override
    public String toString() {
        return "Камень {" + "прозрачность=" + transparency + ", масса=" + weight + ", стоимость=" + cost + '}';
    }
}
