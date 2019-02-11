package com.laba10.task1;

interface Ship {

    void swim();

    void turnLeft();

    void turnRight();

    default void sink(){
     System.out.println("SOS");
    }

}
