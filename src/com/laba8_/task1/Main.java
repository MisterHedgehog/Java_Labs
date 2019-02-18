package com.laba8_.task1;

/**              Лабораторная работа №8
 * Вариант: 6
 * Тема:  «Разработка программ, реализующих механизм наследования»
 *
 * Задача: Создать объект класса Звездная система, используя классы Планета,
 * Звезда, Луна. Методы: вывести на консоль количество планет в звездной
 * системе, название звезды, добавление планеты в систему.
 *
 * Выполнил: Волков Андрей Александрович
 * Проверил: Яковлев Андрей Валерьевич
 */

public class Main {
    public static void main(String[] something) {
        Star sun = new Star(500000,100000,120,5, "Солнце");
        StarSystem sunSystem = new StarSystem(sun);
        sunSystem.addPlanet(new Planet("Марс"));
        Planet earth = new Planet(120, 13, 5.8, true, "Земля");
        earth.setMoon(new Moon(500,100,90.6,false, "Луна"));
        sunSystem.addPlanet(earth);
        sunSystem.showPlanetCount();
        sunSystem.showStarName();
    }
}
