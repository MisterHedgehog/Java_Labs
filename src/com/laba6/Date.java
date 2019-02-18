package com.laba6;

import java.time.LocalDate;
import java.util.GregorianCalendar;

class Date {

    static final int DAY = 0, MONTH = 1, YEAR = 2;


    private int day, month, year;
    private String format;

    Date() { }

    Date(int day, int month, int year, String format) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.format = format;
    }

    void setFormat(String format){
        for(char c : format.toCharArray()){
            if (c == ' '){
                return;
            }
        }
        this.format = format;
    }

    void remakeDate(){
        if(day > 31 || day < 0){
            day = 0;
            System.out.println("Изменение значения поля day.");
        }
        if(month > 12 || month < 0){
            month = 0;
            System.out.println("Изменение значения поля month.");
        }
        if(year < 0){
            year = 0;
            System.out.println("Изменение значения поля year.");
        }
    }

    void changeDateByType(int type, int value){
        switch (type){
            case DAY: day = value; break;
            case MONTH: month = value; break;
            case YEAR: year = value; break;
        }
    }
    int dateByType(int type){
        switch (type){
            case DAY: return day;
            case MONTH: return month;
            case YEAR: return year;
        }
        return 0;
    }

    @Override
    public String toString() {
        return format.replace("Y", String.valueOf(year))
                .replace("M", String.valueOf(month))
                .replace("D", String.valueOf(day));
    }
}
