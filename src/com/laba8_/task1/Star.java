package com.laba8_.task1;

class Star extends SpaceObject {

    private double brightness;

    Star(double radius, double wight, double velocity, double brightness, String name) {
        super(radius, wight, velocity, name);
        this.brightness = brightness;
    }

    double getBrightness() {
        return brightness;
    }

    void showName(){
        System.out.println("Имя звезды: " + name);
    }

    @Override
    public String toString() {
        return "Объект класса Звезда{" + "яркость=" + brightness + ", имя='" + name + '\'' + '}';
    }
}
