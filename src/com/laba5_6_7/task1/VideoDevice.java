package com.laba5_6_7.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;

enum Technology{ TN, IPS, OLED }

public class VideoDevice extends Device {

    private double resolutionX;
    private double resolutionY;
    private Technology technology;
    private ArrayList<String> videos;


    VideoDevice(){
        this(1920,1080, Technology.TN);
    }

    VideoDevice(double resolutionX, double resolutionY, Technology technology, String... soundtracks){
        super();
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
        this.technology = technology;
        this.videos = new ArrayList<>(Arrays.asList(soundtracks));

    }

    public VideoDevice(String name, String manufacturer, double weight, GregorianCalendar invention, double resolutionX, double resolutionY, Technology technology, ArrayList<String> soundtracks) {
        super(name, manufacturer, weight, invention);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
        this.technology = technology;
        this.videos = soundtracks;
    }

    public double getResolutionX() {
        return resolutionX;
    }

    public double getResolutionY() {
        return resolutionY;
    }

    public Technology getTechnology() {
        return technology;
    }

    public ArrayList<String> getVideos() {
        return videos;
    }

    /** Функция, добавляющая видеозапись в список
     *
     * @param video название новой видеозаписи
     */
    public boolean addVideo(String video){
        videos.add(video);
        return true;
    }

    /** Функция, добавляющая видеозаписи в список
     *
     * @param videos массив названий новых видеозаписей
     */
    public boolean addVideo(String... videos){
        this.videos.addAll(Arrays.asList(videos));
        return true;
    }
}