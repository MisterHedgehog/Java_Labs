package com.laba5.task1;

import java.util.ArrayList;
import java.util.Arrays;

class VideoDevice {
    String model;
    double weight;
    Date invention;
    Resolution resolution;
    ArrayList<String> films;

   VideoDevice(String model, double weight, Date invention, Resolution resolution, ArrayList<String> films) {
        this.model = model;
        this.weight = weight;
        this.invention = invention;
        this.resolution = resolution;
        this.films = films;
    }

    VideoDevice() {
        this.model = "не указано";
        this.weight = Double.NaN;
        this.films = new ArrayList<>();
        this.resolution = new Resolution(1920,1080);
        this.invention = new Date(0,0,0,"D.M.Y");
    }

    String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }

    boolean hasFilm(String film){
       return films.contains(film);
    }

    void addAllFilms(String... films){
       this.films.addAll(Arrays.asList(films));
    }

    void showFilms(){
        if(films.isEmpty()) {
            System.out.println("Список фильмов пуст.");
            return;
        }
       System.out.println("Список фильмов на устройстве '" + model + "':");
       films.forEach(System.out::println);
       System.out.println();
    }

    @Override
    public String toString() {
        return "Видеоустройство{" + "модель='" + model + '\'' + ", масса=" + weight + ", Дата изготовления=" + invention + ", разрешение=" + resolution + '}';
    }
}
