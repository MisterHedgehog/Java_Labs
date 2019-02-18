package com.laba6;

enum Type { IPS(0), TN(1), OLED(2);
    int index;
    Type(int index){
    this.index = index;
    }
}

enum Kind { GLOSSY(0), MATT(1);
    int index;
    Kind(int index){
        this.index = index;
    }}

class Resolution {
    private int x, y;
    Type type;
    Kind kind;

    Resolution() { }

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

    int pixelsCount(){
        if(x > 0 && y > 0) {
            return x * y;
        }
        else{
            System.out.println("У матрицы отрицательное значение количества пикселей.");
            x = 1920;
            y = 1080;
            return x * y;
        }
    }

    void changeX(int count) {
        if(count > 0)
        x += count;
    }

    void changeY(int count) {
        if(count > 0)
        y += count;
    }

    String qaulity(){
        switch (type){
            case IPS: return "матрица качества IPS не самая лучшая";
            case TN: return "матрица качества TN самая худшая";
            case OLED: return "матрица качества OLED самая лучшая";
        }
        return "качество не определено";
    }

    @Override
    public String toString() {
        return  "{" + x + "x" + y + '}';
    }
}
