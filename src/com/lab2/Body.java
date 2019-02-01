package com.lab2;
import java.util.Formatter;
import java.util.Scanner;

import static java.lang.Math.*;
import static java.lang.Math.E;

/**             Лабораторная работа №2
 * Варивнт: 6
 * Тема:  Создание линейных программ
 * Задача: Научить создавать линейные программы. Закрепить применение арифметических блоков, и ввода-вывода данных.
 *  y = sin^2(X+3.5)+lgX/3X+e^(X+1.35)
 *
 * Выполнил: Волков Андрей Александрович
 * Проверил: Яковлев Андрей Валерьевич

*/

public class Body {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x, y;
        while (true){
            try {
                System.out.print("\nВведите х: ");
                x = scanner.nextDouble();
                y = (pow(sin(x+3.5), 2) + log10(x))/(3 * 5 + pow(E, 6.35));
                try (Formatter formatter = new Formatter()){
                    formatter.format("Ответ: %.4f", y);
                    System.out.print(formatter);
                }
            } catch (Exception e) {
                System.out.print("Ошибка при определении ответа.");
                return;
            }
        }
    }
}
