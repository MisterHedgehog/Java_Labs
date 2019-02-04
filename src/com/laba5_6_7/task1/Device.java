package com.laba5_6_7.task1;

import java.util.GregorianCalendar;

public class Device {
    private String name, manufacturer;
    private double weight;
    private GregorianCalendar invention;

    Device(){
        this("не указано");
    }

    Device(String name){
        this(name, "не указано", Float.NaN, new GregorianCalendar(2000, 4,27));
    }

    Device(String name, String manufacturer, double weight, GregorianCalendar invention) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.weight = weight;
        this.invention = invention;
    }

    public String getName() {
        return name;
    }

    // Функция, устанавливающая имя по умолчанию
    public void setName(){
        name = "не указано";
    }

    /** Функция, устанавливающая имя
     * @param n новое имя
     */
    public void setName(String n){
        name = n;
    }

    /** Функция, устанавливающая имя
     * @param n новое имя
     * @param isToUpperCase при значении true - устанавливает имя, все символы которого в верхнем регистре
     */
    public void setName(String n, boolean isToUpperCase){
        name = isToUpperCase ? n.toUpperCase() : n.toLowerCase();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getWeight() {
        return weight;
    }

    public GregorianCalendar getInvention() {
        return invention;
    }
}
