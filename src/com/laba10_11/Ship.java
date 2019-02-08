package com.laba10_11;

interface Ship {

    void swim();

    void turnLeft();

    void turnRight();

    default void sink(){
     System.out.println("SOS");
    }

}
