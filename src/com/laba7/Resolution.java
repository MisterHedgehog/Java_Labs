package com.laba7;

enum Type { IPS, TN, OLED }

enum Kind { GLOSSY, MATT }

class Resolution {
    private int x, y;
    Type type;
    Kind kind;

    Resolution() {
        type = Type.TN;
        kind = Kind.MATT;
    }

    Resolution(int x, int y) {
        this();
        this.x = x;
        this.y = y;
    }

    Resolution(int x, int y, Type type, Kind kind) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.kind = kind;
    }

    int getPixelsCount(){
        return x * y;
    }

    void changeX(int count) {
        x += count;
    }

    void changeY(int count) {
        y += count;
    }

    @Override
    public String toString() {
        return  "{" + x + "x" + y + '}';
    }
}
