package com.laba6;

import java.util.ArrayList;
import java.util.Arrays;

class VideoDevice {
    String model;
    double weight;
    Date invention;
    Resolution resolution;
    ArrayList<String> films;

    VideoDevice() { }

    VideoDevice(String model, double weight, Date invention, Resolution resolution, ArrayList<String> films) {
        this.model = model;
        this.weight = weight;
        this.invention = invention;
        this.resolution = resolution;
        this.films = films;
    }

    String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }

    boolean checkSpace(){
       for(char c : model.toCharArray()){
           if (c == ' '){
               return false;
           }
       }
       return model.isBlank();
    }

    double doSomethingWithWieght(){
       double w = weight * 2;
       w = Math.pow(w, 32);
       w /= 30;
       return w;
    }

    boolean hasFilm(String film){
       return films.contains(film);
    }

    void addAllFilms(String... films){
       this.films.addAll(Arrays.asList(films));
    }

    void showFilms(){
       System.out.println("Список фильмов на устройстве '" + model + "':");
       films.forEach(System.out::println);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Видеоустройство{" + "модель='" + model + '\'' + ", масса=" + weight + ", Дата изготовления=" + invention + ", разрешение=" + resolution + '}';
    }
}
