package com.company;



public class Date {

    public int day;
    public int month;
    public int year;



    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;


    }

    public Date() {

    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {

        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;


    }

    public String toString() {
        if (day<1 || day>31) {
            System.out.printf("Invalid day type.");
        }
        if (month<1 || month>12) {
            System.out.printf("Invalid month type.");
        }
        if (year<1900 || year>9999) {
            System.out.printf("Invalid year type.");
        }

        if (day <= 9 && month <= 9) {
            return "0" + day + "/" + "0" + month + "/" + year;
        }
        else if (month <= 9 && day>9) {
            return day+"/"+"0"+month+"/"+year;
        } else if (day<=9 && month>9) {
            return "0"+day+"/"+month+"/"+year;
        }

        else return day + "/" + month + "/" + year;


    }

}
