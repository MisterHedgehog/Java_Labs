package com.laba11;

import com.laba11.base.Necklace;
import com.laba11.base.Stone;
import com.laba11.precious.Brilliant;
import com.laba11.precious.Diamond;
import com.laba11.semiprecious.Agate;
import com.laba11.semiprecious.Amber;

import java.util.ArrayList;

/**              Лабораторная работа №11
 * Вариант: 6
 * Тема:  «Разработка программ с использованием пакетов»
 *
 * Задача:  Необходимо в задании 2 лабораторной работы № 10 создать несколько
 * пакетов, и классы по логике разнести па пакетом. Продумать видимость
 * классов и их компонентов, внутри пакетов и за их пределами.
 *
 * Выполнил: Волков Андрей Александрович
 * Проверил: Яковлев Андрей Валерьевич
 */

public class Main {
    public static void main(String[] something) {
        Amber amber = new Amber(1);
        ArrayList<Amber> ambers = amber.broke();
        ambers.forEach(System.out::println);
        Diamond diamond = new Diamond(5);
        Brilliant brilliant = diamond.update();
        System.out.println(brilliant);
        Agate agate = new Agate(12);
        ArrayList<Stone> stones = new ArrayList<>(ambers);
        stones.add(diamond);
        stones.add(brilliant);
        stones.add(agate);
        Necklace necklace = new Necklace(stones);
        necklace.showStones();

    }
}
