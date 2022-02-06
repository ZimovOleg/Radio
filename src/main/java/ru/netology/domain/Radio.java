package ru.netology.domain;

public class Radio {
    private int minNumberRadioStation;
    private int maxNumberRadioStation = 9;
    private int currentRadioStation;
    private int minVolume;
    private int maxVolume = 100;
    private int currentVolume;

    public Radio() {
    }

    public Radio(int minNumberRadioStation, int maxNumberRadioStation, int currentRadioStation,int minVolume, int maxVolume, int currentVolume) {
        this.minNumberRadioStation = minNumberRadioStation;
        this.maxNumberRadioStation = maxNumberRadioStation;
        this.currentRadioStation = currentRadioStation;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = currentVolume;
    }


    //Управление Радиостанцией

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation (int currentRadioStation) {
        if (currentRadioStation > maxNumberRadioStation) {
            return;
        }
        if (currentRadioStation < minNumberRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void prevRadioStation() {
        if (currentRadioStation <= minNumberRadioStation) {
            this.currentRadioStation = maxNumberRadioStation;
            return;
        }
        this.currentRadioStation --;
    }

    public void nextRadioStation() {
        if (currentRadioStation >= maxNumberRadioStation) {
            this.currentRadioStation = minNumberRadioStation;
            return;
        }
        this.currentRadioStation ++;
    }

    //Управление громкостью

    public int getVolume() {
        return currentVolume;
    }

    public void setVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;

        }
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;

        }
        this.currentVolume = currentVolume;
    }

    public void volumeUpForOne () {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
        }
        if (currentVolume < maxVolume) {
            //currentVolume = currentVolume + 1;
            this.currentVolume++;
        }
    }

    public void volumeDawnOne () {
        if (currentVolume < minVolume) {
          this.currentVolume = minVolume;
        }
        if (currentVolume > minVolume) {
           this.currentVolume --;
        }
    }

}