package com.laba8.task2;

import java.util.Arrays;
import java.util.TreeSet;

class Necklace {
    private TreeSet<Stone> stones;

    Necklace(Stone... stones) {
        this.stones = new TreeSet<>(Arrays.asList(stones));
    }

    void addStone(Stone stone){
        stones.add(stone);
    }

    void addAllStones(Stone... stones){
        this.stones.addAll(Arrays.asList(stones));
    }

    double getTotalWeight(){
        double sum = 0;
        for (Stone stone : stones) {
            sum += stone.weight;
        }
        return sum;
    }

    double getCost(){
        double sum = 0;
        for (Stone stone : stones) {
            sum += stone.cost;
        }
        return sum;
    }

    void showStones(){
        System.out.println("Состав ожерелья (Всего камней: " + stones.size() + ")");
        stones.forEach((System.out::println));
        System.out.println();
    }

    void showWithTransparency(double start, double end){
        System.out.println("Камни ожерелья, у которых прозрачность в диапозоне от " + start + " до " + end + ':');
        stones.stream().filter(stone -> start < stone.transparency && stone.transparency < end).forEach(System.out::println);
        System.out.println();
    }
}
