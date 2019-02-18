package com.laba15;

/**              Лабораторная работа №15
 * Вариант: 6
 * Тема:   «Поточная модель»
 *
 * Задача:  Необходимо в задании 1 лабораторной работы № 14 реализовать
 * многопоточную работу приложения (потоки не синхронизированные).
 *
 * Выполнил: Волков Андрей Александрович
 * Проверил: Яковлев Андрей Валерьевич
 */

public class Main {
    public static void main(String[] something) {
        try {
            Coder coder = new Coder("Простая таблица перестановки");
            System.out.println("Исходная строка: " + coder.getText());
            System.out.println("Зашифрованная строка: " + coder.getCode());
            System.out.println("Расшифрованная строка: " + coder.getDecode());

            coder.startCoding("Простая таблица перестановки. Вариант второй");
            System.out.println("Исходная строка: " + coder.getText());
            System.out.println("Зашифрованная строка: " + coder.getCode());
            System.out.println("Расшифрованная строка: " + coder.getDecode());

        } catch (CryptoException e){
            System.out.println(e.getMessage());
        }
    }
}
