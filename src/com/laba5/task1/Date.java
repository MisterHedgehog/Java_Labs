package com.laba5.task1;

class Date {
    static final int DAY = 0, MONTH = 1, YEAR = 2;
    int day, month, year;
    String format;

    Date(int day, int month, int year, String format) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.format = format;
    }

    public Date() {
        this.format = "Y-M-D";
    }

    @Override
    public String toString() {
        return format.replace("Y", String.valueOf(year))
                .replace("M", String.valueOf(month))
                .replace("D", String.valueOf(day));
    }
    void set(int type, int value){
        switch (type){
            case DAY: day = value; break;
            case MONTH: month = value; break;
            case YEAR: year = value; break;
        }
    }
    int get(int type){
        switch (type){
            case DAY: return day;
            case MONTH: return month;
            case YEAR: return year;
        }
        return 0;
    }
}
