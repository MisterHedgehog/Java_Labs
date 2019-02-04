package abbasov.laba3;

import java.util.Scanner;
import static java.lang.Math.pow;

/* Лабараторная #3
тема: создать линейную программу
выполнил: Аббасов Рамазан
 задание: Значение функции sin2(x) можно вычислить с помощью разложения ее в ряд Маклорена с точностью е = 0.001;
 */
class MainWhile {
    public static void main(String[] args) {
        Scanner roma = new Scanner(System.in);
        double a , b = 1 , sum = 0 ;
        int znak = 1, i=1;
        a = roma.nextFloat();
        while (b > 0.001) {
            double f = 1;
            for (int x = 1; x <= i * 2; x++) {
                f *= x;
            }
            //Вычисляем синус
            b = pow(2, 2 * i - 1) * pow(a, 2 * i) / f;
            sum += znak * b;
            // Смена знака
            znak = -znak;
            i++;
        }
        System.out.println("Результат вычисления: " + sum);
    }
}

