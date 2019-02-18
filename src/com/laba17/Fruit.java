package com.laba17;

import java.lang.reflect.Field;
import java.util.ArrayList;

public abstract class Fruit implements Savable {

    public int weight;
    public String name, smell, color;

    public Fruit(String name, int weight, String color, String smell) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.smell = smell;
    }

    @Override
    public ArrayList<String> classData() {
        ArrayList<String> data = new ArrayList<>();
        try {
            Class<?> fruitClass = getClass();
            Field[] fields = fruitClass.getFields();

            String name = fruitClass.getSimpleName();
            data.add("class name: " + name + "\r\n");
            data.add("имя объекта: " + fruitClass.getField("name").get(this) + "\r\n");

            for (Field field : fields) {
                name = field.getName();
                Object value = field.get(this);
                if(!name.equals("name"))
                    data.add("Поле " + name + " имеет значение: " + value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}
