package com.laba4;

import java.util.Scanner;

import static com.support.Manager.fact;

/**              Лабораторная работа №4
 * Вариант: 6
 * Тема:  «Разработка программ с использованием массивов»
 * Задача: Вычислите (-1)^n*A[n]/n!
 *
 * Выполнил: Волков Андрей Александрович
 * Проверил: Яковлев Андрей Валерьевич
 */

public class SimpleArray {
    public static void main(String[] something) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0, znak = 1;
        System.out.print("Введите размерность массива: ");
        int fact = 1, n = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0; i<n; i++){
            System.out.print(">> Введите элемент массива [" + i + "]: ");
            array[i] = scanner.nextInt();
        }
        sum = array[0];
        for (int i = 1; i < n; i++) {
            fact *= i;
            sum += znak * array[i] / fact;
            znak = -znak;
        }
        System.out.print("Результат сложения: " + sum);
    }
}