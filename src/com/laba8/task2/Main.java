package com.laba8.task2;

import java.text.DecimalFormat;

/**              Лабораторная работа №8
 * Вариант: 6
 * Тема:  «Разработка программ, реализующих механизм наследования»
 *
 * Задача:  Камни. Определить иерархию драгоценных и полудрагоценных камней.
 * Отобрать камни для ожерелья. Подсчитать общий вес (в каратах) и
 * стоимость. Провести сортировку камней ожерелья на основе ценности.
 * Найти камни в ожерелье, соответствующие заданному диапазону
 * параметров прозрачности.
 *
 * Выполнил: Волков Андрей Александрович
 * Проверил: Яковлев Андрей Валерьевич
 */

public class Main {
    public static void main(String[] something) {
        Amber amber = new Amber(1);
        Necklace necklace = new Necklace(amber);
        necklace.addStone(new Agate(1));
        necklace.addAllStones(new Ruby(1), new Diamond(1), new Ruby(3));
        necklace.addAllStones(new Diamond(1), new Amber(2), new Ruby(2));
        necklace.showStones();
        necklace.showWithTransparency(0.1, 0.9);
        System.out.println("Общий вес ожерелья: " + necklace.getTotalWeight() + " карат");
        System.out.println("Стоимость ожерелья: " + new DecimalFormat(".00").format(necklace.getCost()));
    }
}
