package com.example.hackerd.appweather;

public class Thoitiet {
    public String Day;
    public String Status;
    public String Image;
    public String MaxTemp;
    public String MinTemp;

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        Day = day;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public void setImage(String image) {
        Image = image;
    }

    public void setMaxTemp(String maxTemp) {
        MaxTemp = maxTemp;
    }

    public void setMinTemp(String minTemp) {
        MinTemp = minTemp;
    }

    public String getStatus() {
        return Status;
    }

    public String getImage() {
        return Image;
    }

    public String getMaxTemp() {
        return MaxTemp;
    }

    public String getMinTemp() {
        return MinTemp;
    }

    public Thoitiet(String day, String status, String image, String maxTemp, String minTemp) {
        Day = day;
        Status = status;
        Image = image;
        MaxTemp = maxTemp;
        MinTemp = minTemp;
    }

    @Override
    public String toString() {
        return "Thoitiet{" +
                "Day='" + Day + '\'' +
                ", Status='" + Status + '\'' +
                ", Image='" + Image + '\'' +
                ", MaxTemp='" + MaxTemp + '\'' +
                ", MinTemp='" + MinTemp + '\'' +
                '}';
    }
}
