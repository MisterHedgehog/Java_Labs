package com.laba13;

import org.apache.pdfbox.debugger.streampane.Stream;

/**              Лабораторная работа №13
 * Вариант: 6
 * Тема:   «Разработка программ разработки строк»
 *
 * Задача:  Из небольшого текста удалить все символы, кроме пробелов, не
 * являющиеся буквами. Между последовательностями подряд идущих букв
 * оставить хотя бы один пробел.
 *
 * Выполнил: Волков Андрей Александрович
 * Проверил: Яковлев Андрей Валерьевич
 */

public class Main {
    public static void main(String[] something) {
        //String regex = "[^\\pL\\s]";
        StringBuilder stringBuilder = new StringBuilder("1234*fdss ?_32ASD dавы вв");
        String symbols = "~`!@#$%^&?№*()_+-=\\\".,{}[]|/;:1234567890";
        StringBuilder result = new StringBuilder();
        stringBuilder.chars().forEach(c ->
         {
             block: {
                 {
                     for (char ch : symbols.toCharArray())
                         if (ch == (char) c) {
                             break block;
                         }
                     result.append((char) c);
                 }
             }});
        System.out.println(result);
    }
}
