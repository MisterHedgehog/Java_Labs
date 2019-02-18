package com.laba14;

/**              Лабораторная работа №14
 * Вариант: 6
 * Тема:   «Обработка исключительных ситуаций»
 *
 * Задача:  Необходимо в задании 1 лабораторной работы № 12 реализовать
 * обработку исключительных ситуаций, при этом организовать:
 *  завершение работы программы, с выводом сообщения об ошибке;
 *  вывода сообщения об ошибке, и организовать безопасное
 * продолжение работы программ;
 *  генерирование собственного исключения.
 *
 * Выполнил: Волков Андрей Александрович
 * Проверил: Яковлев Андрей Валерьевич
 */

public class Main {
    public static void main(String[] something) {
        String code = null, decode;
        try {
            code = Crypto.code("Простая таблица перестановки");
            System.out.println("Зашифрованная строка: " + code);
        } catch (CryptoException e){
            System.out.println(e.getMessage());
            System.exit(1);
        }
        try {
            decode = Crypto.decode(code);
            System.out.println("Разшифрованная строка: " + decode);
        } catch (CryptoException | NullPointerException e){
            System.err.println(e.getMessage());
        }
    }
}
