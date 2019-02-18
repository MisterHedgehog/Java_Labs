package com.laba18;

import java.io.Serializable;

public class State implements Serializable {
    int level, hp, exp;
    String name, password;

    public State(int level, int hp, int exp, String name, String password) {
        this.level = level;
        this.hp = hp;
        this.exp = exp;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "\n**Состояние**" +
                "\nуровень:" + level +
                "\nздоровье:" + hp +
                "\nопыт:" + exp +
                "\nимя:'" + name + '\'' +
                "\nпароль:'" + password + '\'' +
                "\n************";
    }
}
