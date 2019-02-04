package abbasov.laba3;

import java.util.Scanner;

/* Лабараторная #3
тема: создать линейную программу
выполнил: Аббасов Рамазан
 задание: Введите два положительных числа и покажите, что среднее
 арифметическое этих чисел не меньше их среднего геометрического.
 */
class Main {
    public static void main(String[] args) {
        Scanner roma = new Scanner(System.in);
        double x = roma.nextFloat();
        double y = roma.nextFloat();
        if(x > 0 && y > 0){
            double a = (x + y) / 2;
            double g = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
            System.out.println("средне-арефметическое:" + a + "\nсредне-геометрическое:" + g);
            if(a > g){
                System.out.println("Средне-арефметическое больше средне-геометрического.");
            }
            else {
                System.out.println("Средне-арефметическое меньше средне-геометрического.");
            }
        }
    }
}
