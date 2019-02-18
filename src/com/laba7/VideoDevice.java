package com.laba7;

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

    void setModel(char... chars){
        model = String.valueOf(chars);
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

    void addWeight(){
       weight++;
    }

    void addWeight(int value) {
        weight += value;
    }

    boolean hasFilm(String film){
       return films.contains(film);
    }

    boolean hasFilm(String... films){
        for (int i = 0; i < films.length; i++) {
            if(this.films.contains(films[0]))
                return true;
        }
        return false;
    }

    void addFilm(String... films){
       this.films.addAll(Arrays.asList(films));
    }

    void addFilm(String film){
        this.films.add(film);
    }

    // Функция, выводящая все фильмы
    void showFilms(){
       System.out.println("Список фильмов на устройстве '" + model + "':");
       films.forEach(System.out::println);
        System.out.println();
    }

    // Функция, выводящая первые howMach фильмов
    void showFilms(int howMach){
        // Если howMach в диапозоне [0; films.size]
       if(0 <= howMach && howMach <= films.size()){
           howMach = films.size();
       }
        System.out.println("Список фильмов на устройстве '" + model + "':");
        for (int i = 0; i < howMach; i++) {
            System.out.println(films.get(i));
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Видеоустройство{" + "модель='" + model + '\'' + ", масса=" + weight + ", Дата изготовления=" + invention + ", разрешение=" + resolution + '}';
    }
}
