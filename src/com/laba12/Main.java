package com.laba12;

/**              Лабораторная работа №12
 * Вариант: 6
 * Тема:   «Разработка программ обработки символов»
 *
 * Задача:  Необходимо в задании 1 лабораторной работы № 11 создать методы для
 * шифровки и дешифровки важной и секретной информации. Нужно реализовать
 * один из методов шифрования (по варианту).
 *
 * Простая таблица перестановки.
 *
 * Выполнил: Волков Андрей Александрович
 * Проверил: Яковлев Андрей Валерьевич
 */

public class Main {
    public static void main(String[] something) {
        String code = Crypto.code("Простая таблица перестановки");
        System.out.println("Зашифрованная строка: " + code);
        try {
            String decode = Crypto.decode(code);
            System.out.println("Разшифрованная строка: " + decode);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
