package com.laba5.task2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Stream;

public class Triangle implements Iterable<Double> {

    private double side, leftAngle, rightAngle;

    /** Конструктор класса
     * @param side известная сторона
     * @param leftAngle левый прилежащий к известной стороне угол
     * @param rightAngle правый прилежащий к известной стороне угол
     */
    Triangle(double side, double leftAngle, double rightAngle) throws IllegalArgumentException {
        if (leftAngle <= 0 || rightAngle <= 0)
            throw new IllegalArgumentException("Ошибка при создании треугольника.\nУгол не может быть отрицательным.");
        if (leftAngle + rightAngle >= 180)
            throw new IllegalArgumentException("Ошибка при создании треугольника.\nСумма углов треугольника должна быть меньше 180 градусов.");
        if (side < 0)
            throw new IllegalArgumentException("Ошибка при создании треугольника.\nЗначение стороны треугольника не может быть меньше нуля.");
        this.side = side;
        this.leftAngle = leftAngle;
        this.rightAngle = rightAngle;
    }

    /** Функция, изменяющая значение левого угла на количество процентов
     * @param percentage количество процентов, на которое будет изменён левый угол в диапозоне ( -100; +Infinity)
     */
    public void modifyLeftAngle(double percentage) throws IllegalArgumentException {
        if(percentage <= -100)
            throw new IllegalArgumentException("Ошибка при изменении левого угла.\nЗначение угла должно быть больше нуля.");
        if(leftAngle * (1 + percentage / 100) + rightAngle >= 180)
            throw new IllegalArgumentException("Ошибка при изменении левого угла.\nСумма углов треугольника должна быть меньше 180 градусов.");
        leftAngle *= 1 + percentage / 100;
    }

    /** Функция, изменяющая значение правого угла на количество процентов
     * @param percentage количество процентов, на которое будет изменён правый угол в диапозоне ( -100; +Infinity)
     */
    public void modifyRightAngle(double percentage) throws IllegalArgumentException {
        if(percentage <= -100)
            throw new IllegalArgumentException("Ошибка при изменении правого угла.\nЗначение угла должно быть больше нуля.");
        if(rightAngle * (1 + percentage / 100) + leftAngle >= 180)
            throw new IllegalArgumentException("Ошибка при изменении правого угла.\nСумма углов треугольника должна быть меньше 180 градусов.");
        rightAngle *= 1 + percentage / 100;
    }

    /** Функция, возвращающая высоты к трём сторонам треугольника
     *  1. Нахождение сторон треугольника
     *  2. Определение площади фигуры
     *  3. Вычисление трёх высот по формуле h = 2S / a, где a - сторона треуольника
     */
    public double[] getHeights(){
/* 1. */double leftSide = getLeftSide();
        double rightSide = getRightSide();
/* 2. */double area = findArea(side, leftSide, rightSide);
/* 3. */return Stream.of(side, leftSide, rightSide).mapToDouble(i -> 2 * area / i).toArray();
    }

    /** Функция, находящая по теореме Герона и возвращающая значение площади треугольника
     * @param firstSide любая сторона треугольника
     * @param secondSide ещё одна сторона треугольника
     * @param thirdSide последняя сторона треугольника
     */
    static private double findArea(double firstSide, double secondSide, double thirdSide) {
        double p = (firstSide + secondSide + thirdSide) / 2;
        return Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide));
    }

    // Функция, возвращающая значение левой стороны по отношению к известной стороне
    private double getLeftSide(){
        double otherAngle = 180 - rightAngle - leftAngle;
        return side * Math.sin(Math.toRadians(rightAngle))/Math.sin(Math.toRadians(otherAngle));
    }

    // Функция, возвращающая значение правой стороны по отношению к известной стороне
    private double getRightSide(){
        double otherAngle = 180 - rightAngle - leftAngle;
        return side * Math.sin(Math.toRadians(leftAngle))/Math.sin(Math.toRadians(otherAngle));
    }

    @Override
    public String toString() {
        return "Класс: Треугольник\n" + "сторона=" + side + ", левый угол=" + leftAngle + ", правый угол=" + rightAngle;
    }

    // Функция, возвращающий итератор, проходящий по сторонам треугольника.
    @Override
    public Iterator<Double> iterator() {
        return new SideIterator(side, getLeftSide(), getRightSide());
    }

    // Функция, определяющая равенство треугольников по трём сторонам.
    @Override
    public boolean equals(Object obj) {
        try {
            Triangle other = (Triangle) obj;
            HashSet<Double> sides = new HashSet<>(3,1);
            sides.add(side);
            sides.add(getLeftSide());
            sides.add(getRightSide());
            return !(sides.add(other.side) || sides.add(other.getRightSide()) || sides.add(other.getLeftSide()));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }
}
