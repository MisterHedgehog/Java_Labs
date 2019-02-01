package com.lab3;

import java.util.Formatter;
import java.util.Scanner;

/*              Лабораторная работа №3
Тема:  Создание линейных программ.
Задача: Вычислить сумму.

Выполнил: Волков Андрей Александрович
Проверил: Яковлев Андрей Валерьевич
*/

public class ExampleFor {
    // Функция для определения факториала числа
    static private int fact(int x) {
        if (x != 1)
            return x * fact(x - 1);
        else return 1;
    }

    public static void main(String[] something) {
        Scanner scanner = new Scanner(System.in);
        int count;
        float result = 0;
        // Ожидание ввода данных для вычисления результата.
        while (true) {
            System.out.print("Введите положительное число: ");
            count = scanner.nextInt();
            if(count > 0)
                break;
            System.out.print("Введено отрицательное число, повторите попытку.\n");
        }
        // Вычисление результата.
        for (; count > 0; count--) {
            result += 1 / (float) fact(count);
        }
        try (Formatter formatter = new Formatter()){
            formatter.format("Результат сложения: %.2f", result);
            System.out.print(formatter);
        }
    }
}
