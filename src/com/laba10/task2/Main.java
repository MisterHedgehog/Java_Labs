package com.laba10.task2;

import java.util.ArrayList;

/**              Лабораторная работа №10
 * Вариант: 6
 * Тема:  «Разработка программ, реализующих и использующих интерфейсы»
 *
 * Задача:  Необходимо в задания 1 лабораторной работы №9: для всех цепочек
 * классов связных наследованием, добавить абстрактные классы и интерфейсы,
 * необходимые по логике.
 *
 * Выполнил: Волков Андрей Александрович
 * Проверил: Яковлев Андрей Валерьевич
 */

public class Main {
    public static void main(String[] something) {
        Amber amber = new Amber(1);
        ArrayList<Amber> agates = amber.broke();
        agates.forEach(System.out::println);
        Diamond diamond = new Diamond(5);
        Brilliant brilliant = Brilliant.update(diamond);
        System.out.println(diamond);
    }
}
