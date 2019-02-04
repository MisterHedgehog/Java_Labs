package com.support;

public class Manager {
    // Функция для определения факториала числа
    static public int fact(int x) {
        if (x != 1)
            return x * fact(x - 1);
        else return 1;
    }
}
