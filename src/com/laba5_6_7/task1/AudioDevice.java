package com.laba5_6_7.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;

public class AudioDevice extends Device {
    private double maxVolume, minVolume;
    private boolean isRadio;
    private ArrayList<String> soundtracks;

    AudioDevice(){
        this(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, false);
    }

    AudioDevice(double maxVolume, double minValue, boolean isRadio, String... soundtracks){
        super();
        this.maxVolume = maxVolume;
        this.minVolume = minValue;
        this.isRadio = isRadio;
        this.soundtracks = new ArrayList<>(Arrays.asList(soundtracks));

    }

    public AudioDevice(String name, String manufacturer, double weight, GregorianCalendar invention, double maxVolume, double minValue, boolean isRadio, ArrayList<String> soundtracks) {
        super(name, manufacturer, weight, invention);
        this.maxVolume = maxVolume;
        this.minVolume = minValue;
        this.isRadio = isRadio;
        this.soundtracks = soundtracks;
    }

    public boolean isRadio() {
        return isRadio;
    }

    public double getMaxVolume() {
        return maxVolume;
    }

    public double getMinVolume() {
        return minVolume;
    }

    public ArrayList<String> getSoundtracks() {
        return soundtracks;
    }
}
