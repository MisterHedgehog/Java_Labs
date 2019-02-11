package com.laba11.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Necklace {
    private TreeSet<Stone> stones;

    public Necklace(Stone... stones) {
        this.stones = new TreeSet<>(Arrays.asList(stones));
    }
    public Necklace(ArrayList<Stone> stones) {
        this.stones = new TreeSet<>(stones);
    }

    public void addStone(Stone stone){
        stones.add(stone);
    }

    public void addAllStones(Stone... stones){
        this.stones.addAll(Arrays.asList(stones));
    }

    public double getTotalWeight(){
        double sum = 0;
        for (Stone stone : stones) {
            sum += stone.weight;
        }
        return sum;
    }

    public double getCost(){
        double sum = 0;
        for (Stone stone : stones) {
            sum += stone.cost;
        }
        return sum;
    }

    public void showStones(){
        System.out.println("Состав ожерелья (Всего камней: " + stones.size() + ")");
        stones.forEach((System.out::println));
        System.out.println();
    }

    public void showWithTransparency(double start, double end){
        System.out.println("Камни ожерелья, у которых прозрачность в диапозоне от " + start + " до " + end + ':');
        stones.stream().filter(stone -> start < stone.transparency && stone.transparency < end).forEach(System.out::println);
        System.out.println();
    }
}
