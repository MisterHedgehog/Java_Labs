package com.laba7;

class Date {
    static final int DAY = 0, MONTH = 1, YEAR = 2;
    private int day, month, year;
    private String format;


    Date() {
    }

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

    void setFormat(String format, int times){
        if (times > 0){
            setFormat(format.repeat(times));
        }
        else {
            System.err.println("Установлено неверное количество повторений.");
        }
    }

    void resetDate(){
        for(int i = 0; i < 3; i++){
            resetDate(i);
        }
    }

    void resetDate(int type){
        if (type >= 0 && type < 3)
        resetDate(type, 0);
        else
            System.err.println("Неверно указан тип даты.");
    }

    void resetDate(int type, int value){
        if (value < 0){
            System.err.println("Указано отрицательное значение даты.");
        }
        else {
            resetDate(type, value, "Изменение значения поля.");
        }
    }

    void resetDate(int type, int value, String message){
            if (message.isEmpty()){
                System.err.println("Указано пустое сообщение.");
        }
        else {
                switch (type){
                    case DAY:
                        if(day > 31 || day < 0){
                            day = value;
                            System.out.println(message);
                        } break;
                    case MONTH:
                        if(month > 12 || month < 0){
                            month = value;
                            System.out.println(message);
                        }
                    case YEAR:
                        if(year < 0){
                            year = value;
                            System.out.println(message);
                        }

                }
        }
    }

    void resetDate(int type, String message, int... values) {
        int sum = 0;
        for (int val : values) {
            sum += val;
        }
        resetDate(type, sum, message);
    }

    void changeDateByType(int type, int value){
        switch (type){
            case DAY: day = value; break;
            case MONTH: month = value; break;
            case YEAR: year = value; break;
        }
    }

    void changeDateByType(int type, int... values){
        int sum = 0;
        for (int val : values) {
            sum += val;
        }
        changeDateByType(type, sum);
    }

    void changeDateByType(int type){
        if (type >= 0 && type < 3)
            changeDateByType(type, 0);
        else
            System.err.println("Неверно указан тип даты.");
    }

    int dateByType(int type){
        switch (type){
            case DAY: return day;
            case MONTH: return month;
            case YEAR: return year;
        }
        return 0;
    }

    int dateByType(int... types){
        int sum = 0;
        for (int val : types) {
            sum += val;
        }
        return dateByType(sum);
    }

    @Override
    public String toString() {
        return format.replace("Y", String.valueOf(year))
                .replace("M", String.valueOf(month))
                .replace("D", String.valueOf(day));
    }
}
