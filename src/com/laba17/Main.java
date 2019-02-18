package com.laba17;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**              Лабораторная работа №17
 * Вариант: 6
 * Тема:   «Разработка программ создания файлов»
 *
 * Задача:  Необходимо в задании 1 лабораторной работы № 16 реализовать запись
 * всех данных в файлы, для каждого объекта создать свой файл (продумайте
 * логическое название файлов и папок где они будут храниться). Каждый файл
 * должен в себе хранить:
 *  имя объекта;
 *  название класс (названия всех классов);
 *  названия и содержимое всех полей.
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
        FileManager.init()
                .addClasses(apple, banana, strawberry, berry)
                .createFolders()
                .saveClasses();
    }
}
