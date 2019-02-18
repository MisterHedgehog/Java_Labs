package com.laba7;

enum Type { IPS, TN, OLED }

enum Kind { GLOSSY, MATT }

class Resolution {
    private int x, y;
    Type type;
    Kind kind;

    Resolution() {
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

    int pixelsCount(){
        return pixelsCount(1);
    }
    int pixelsCount(int value){
        if(x > 0 && y > 0) {
            return x * y * value;
        }
        else{
            System.out.println("У матрицы отрицательное значение количества пикселей.");
            x = 1920;
            y = 1080;
            return x * y * value;
        }
    }
    int pixelsCount(int... values){
        int sum = 0;
        for (int val : values) {
            sum += val;
        }
        if(x > 0 && y > 0) {
            return x * y * sum;
        }
        else{
            System.out.println("У матрицы отрицательное значение количества пикселей.");
            x = 1920;
            y = 1080;
            return x * y * sum;
        }
    }

    void changeX(int count) {
        if(count > 0)
            x += count;
    }
    void changeX(int... counts) {
        int sum = 0;
        for (int val : counts) {
            sum += val;
        }
        changeX(sum);
    }

    void changeY(int count) {
        if(count > 0)
            y += count;
    }
    void changeY(int... counts) {
        int sum = 0;
        for (int val : counts) {
            sum += val;
        }
        changeY(sum);
    }

    String qaulity(Type type){
        switch (type){
            case IPS: return "матрица качества IPS не самая лучшая";
            case TN: return "матрица качества TN самая худшая";
            case OLED: return "матрица качества OLED самая лучшая";
        }
        return "качество не определено";
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
