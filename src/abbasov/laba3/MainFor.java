package abbasov.laba3;

import java.util.Formatter;

/* Лабараторная #3
тема: создать линейную программу
выполнил: Аббасов Рамазан
 задание: Напечатайте таблицу стоимости порций сыра весом 50, 100, 150, ..., 1000 г (цена 1 кг 280 грн.)

 */
class MainFor {
    public static void main(String[] args) {
        for (int i = 50; i <= 1000; i+=50) {
            System.out.println("Сыр весом " + i + " стоит: " + 280 * i / 1000 + " грн.");
        }
    }
}