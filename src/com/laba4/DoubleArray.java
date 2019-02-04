package com.laba4;

import java.util.Random;
import java.util.Scanner;

/**              Лабораторная работа №4
 * Вариант: 6
 * Тема:  «Разработка программ с использованием массивов»
 * Задача: Дана действительная квадратная матрица порядка n. Найдите сумму
 * элементов, расположенных в заштрихованной части матрицы.
 *                                                  _________
 *                                                 |        /|
 *                                                 |      ///|
 *                                                 |    /////|
 *                                                 |_////////|
 *
 * Выполнил: Волков Андрей Александрович
 * Проверил: Яковлев Андрей Валерьевич
 */

public class DoubleArray {
    public static void main(String[] something) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.print("Введите размерность матрицы: ");
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = 1 + random.nextInt(9);
            }
        }
        System.out.println("Исходная матрица:");
        for(int i = 0; i<n; i++){
            for (int j = 0; j < n; j++) {
                System.out.print("|" + array[i][j]);
            }
            System.out.println("|");
        }
        for(int i = 0; i<n; i++){
            for (int j = n - 1; j > n - i - 2; j--) {
                sum+=array[i][j];
            }
        }
        System.out.print("Результат сложения: " + sum);
    }
}
