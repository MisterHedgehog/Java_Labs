package com.laba18;

import java.util.ArrayList;

/**              Лабораторная работа №17
 * Вариант: 6
 * Тема:   «Разработка программ обработки файлов»
 *
 * Задача:  Необходимо в задании 1 лабораторной работы № 17 реализовать чтение
 * данных из файлов при:
 *  создании объектов, конкретных классов;
 *  обработке определѐнной информации в методах.
 *
 * Выполнил: Волков Андрей Александрович
 * Проверил: Яковлев Андрей Валерьевич
 */

public class Main {
    public static void main(String[] something) {
        Apple apple = new Apple("apple", 10, "red", "sweet");
        Banana banana = new Banana("banana", 8, "yellow", "sweet");
        Strawberry strawberry = new Strawberry("strawberry", 12, "pink", "sour");
        Strawberry berry = new Strawberry("berry", 6, "red", "sweet");
        ArrayList<Fruit> fruits =
                FileManager.init()
                .addClasses(apple, banana, strawberry, berry)
                .createFolders()
                .saveClasses()
                .loadClasses();
        fruits.forEach(System.out::println);
        State state = FileManager.init()
                .saveState(new State(25,100, 100000,"Vasya", "password123"))
                .loadState();
        System.out.println(state);
    }
}
