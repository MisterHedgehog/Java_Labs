package abbasov.lab2;

import java.util.Scanner;

/* Лабараторная #2
тема: создать линейную программу
выполнил: Аббасов Рамазан
 задание: у = ( 5x + sin x^2 ) / ( 2x + tg x ) + |sin x^2|
 */
class Main {
    public static void main(String[] args) {
        Scanner roma = new Scanner(System.in);
        float x = roma.nextFloat();
        double y = (5 * x + Math.sin(Math.pow(x, 2))) / (2 * x + Math.tan(x)) + Math.abs(Math.sin(Math.pow(x, 2)));
        System.out.print("Ответ:"+ y);
    }
}
