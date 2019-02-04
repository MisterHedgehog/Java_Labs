package com.laba5_6_7.task2;

import java.util.ArrayList;

/**              Лабораторная работа №5
 * Вариант: 6
 * Тема:  «Разработка классов и использование их в программах»
 *
 * Задача: Во втором задании необходимо реализовать класс по условию варианта,
 * заготовить несколько контрольных примеров. Организовать проверку
 * существования необходимой фигуры.
 *
 * Вариант 6.
 * Класс Треугольник
 * Поля: сторона и два прилежащих к ней угла
 * Операции:
 * 1. Увеличение и уменьшение значений любого угла (из полей) на заданное
 * количество процентов
 * 2. Вычисление длины высот, принадлежащей любой стороне;
 * 3. Определение значений сторон.
 *
 * Выполнил: Волков Андрей Александрович
 * Проверил: Яковлев Андрей Валерьевич
 */

public class Main {
    public static void main(String[] something) {
        try {
            ArrayList<Triangle> triangles = new ArrayList<>();
            Triangle triangle1 = new Triangle(12,60,90);
            Triangle triangle2 = new Triangle(8.5,90,60);
            Triangle triangle3 = new Triangle(9,30.99,20);
            Triangle triangle4 = new Triangle(8.5,60,90);
//            triangles.add(triangle1);
//            triangles.add(triangle2);
//            triangles.add(triangle3);
//            triangles.forEach((i) -> System.out.println(i.equals(triangle4)));
//            System.out.println();
//            triangle1.modifyLeftAngle(50);
//            triangle1.modifyRightAngle(-99);
//            System.out.print(Arrays.toString(triangle1.getHeights()));
//            System.out.println(triangle1);
//            for(Double side : triangle1){
//                System.out.println("сторона треугольника:" + side);
//            }
//            for(double height : triangle1.getHeights()){
//                System.out.println("высота треугольника:" + height);
//            }
        } catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
        }
    }
}
