package com.laba16;

/**              Лабораторная работа №16
 * Вариант: 6
 * Тема:   «Разработка многопоточных приложений»
 *
 * Задача:  Необходимо в задании 1 лабораторной работы № 16 реализовать
 * многопоточную работу приложения (все потоки синхронизировать).
 *
 * Выполнил: Волков Андрей Александрович
 * Проверил: Яковлев Андрей Валерьевич
 */

public class Main {
    public static void main(String[] something) {
        try {
            Coder coder = new Coder("Простая таблица перестановки");
            while (coder.getDecode() == null){
                Thread.sleep(1);
            }
            System.out.println("Исходная строка: " + coder.getText());
            System.out.println("Зашифрованная строка: " + coder.getCode());
            System.out.println("Расшифрованная строка: " + coder.getDecode());
            coder.startCoding("Простая таблица перестановки. Вариант второй");
            coder.startCoding("Простая таблица перестановки. Вариант третий");
            coder.startCoding("Простая таблица перестановки. Вариант четвёртый");
            coder.startCoding("Простая таблица перестановки. Вариант пятый");

        } catch (CryptoException e){
            System.err.println(e.getMessage());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
