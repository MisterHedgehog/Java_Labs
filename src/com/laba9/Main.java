package com.laba9;

import java.util.ArrayList;

/**              Лабораторная работа №9
 * Вариант: 6
 * Тема:  «Разработка программ с использованием наследования и переопределение методов»
 *
 * Задача:  Необходимо реализовать в задания 2 лабораторной работы №8 логически
 * продуманное наследование, при этом реализовать:
 *  цепочку не менее чем из 3 классов;
 *  в классах патоках переопределить необходимые методы супер
 * классов;
 *  организовать наследование конструкторов супер классов
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
