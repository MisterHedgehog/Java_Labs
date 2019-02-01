package com.lab3;

/*              Лабораторная работа №3
Тема:  Создание линейных программ
Задача: Даны в градусах величины двух углов треугольника. Определите, является ли данный треугольник разносторонним.

Выполнил: Волков Андрей Александрович
Проверил: Яковлев Андрей Валерьевич
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExampleIf {
    public static void main(String[] something){
        double firstEdge, secondEdge, thirdEdge;
        Scanner scanner = new Scanner(System.in);
        // В цикле производится ввод данных с клавиатуры, пока значения не будут введены верно.
        while (true) {
            try {
                System.out.print("Введите значение первого угла: ");
                firstEdge = scanner.nextDouble();
                System.out.print("Введите значение второго угла: ");
                secondEdge = scanner.nextDouble();
                // обработка исключения, возникающего при вводе букв.
            } catch (InputMismatchException e){
                System.out.print("Были введены символы, где ожидались числа, повторите попытку.\n");
                continue;
            }
            thirdEdge = 180 - firstEdge - secondEdge;
            // Все углы должны быть в диапозоне от 0 до 180 градусов.
            if(firstEdge > 0 && firstEdge < 180 && secondEdge > 0 && secondEdge < 180 && thirdEdge > 0 && thirdEdge < 180){
                // Если условие выполняется, то происходит завершение цикла.
                break;
            }
            else {
                System.out.print("Введены неверные значения.\n");
            }
        }
        // После ввода значений углов треугольника определяется, является ли данный треугольник разносторонним.
        if(firstEdge == secondEdge || firstEdge == thirdEdge || secondEdge == thirdEdge){
            System.out.print("Треугольник имеет одинаковые стороны");
        }
        else {
            System.out.print("Треугольник не имеет одинаковых сторон");
        }
    }
}
