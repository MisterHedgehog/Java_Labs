package com.lab3;

/**              Лабораторная работа №3
 * Вариант: 6
 * Тема:  Создание линейных программ.
 * Задача: Вычислите сумму ряда с заданной степенью точности а = 0,001.
 *
 * Выполнил: Волков Андрей Александрович
 * Проверил: Яковлев Андрей Валерьевич
*/

public class ExampleWhile {
    final private static float ACCURACY = 0.001f;

    public static void main(String[] something) {
        int n = 0, znak = 1;
        float sum = 0, step = 1;
        while (step > ACCURACY) {
            ++n;
            step = n / (float) Math.pow((1 + Math.pow(n, 3)), 2);
            sum += znak * step;
            znak = -znak;
        }
        System.out.print(sum);
    }
}
