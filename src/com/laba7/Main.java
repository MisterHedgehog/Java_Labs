package com.laba7;

import java.util.ArrayList;

/**              Лабораторная работа №7
 * Вариант: 6
 * Тема:  «Разработка классов и использование их в программах»
 *
 * Задача: Необходимо к классам из задания 1 лабораторной работы №6, добавить:
 *  не менее 5 перегруженных методов (для тех методов, где
 * позволяет логика);
 *  не менее 3 методов с изменяемым числом входных
 * параметров.
 *
 * Выполнил: Волков Андрей Александрович
 * Проверил: Яковлев Андрей Валерьевич
 *
 * Вариант 6. Телекоммуникации. Аудио- и видеотехника.
 */

public class Main {
    public static void main(String[] something) {
        Date now = new Date();
        Resolution resolution = new Resolution();
        VideoDevice device = new VideoDevice("Sony Max Function", 25, now, resolution, new ArrayList<>());
    }
}
