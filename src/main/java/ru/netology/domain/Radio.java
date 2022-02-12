package ru.netology.domain;

public class Radio {
    private int maxNumberOfStations = 10;

    public Radio(int maxNumberOfStations) {
        this.maxNumberOfStations = maxNumberOfStations;
        this.maxStation = maxNumberOfStations - 1;
    }

    public int getMaxNumberOfStations() {
        return maxNumberOfStations;
    }
    public int getMaxStation() {
        return maxStation;
    }

    public Radio() {
    }

    private int minStation = 0;
    private int maxStation = maxNumberOfStations - 1;
    private int currentRadioStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = 25;

//Управление Радиостанцией

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxStation) {
            return;
        }
        if (currentRadioStation < minStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void prevRadioStation() {
        if (currentRadioStation <= minStation) {
            this.currentRadioStation = maxStation;
            return;
        }
        this.currentRadioStation--;
    }

    public void nextRadioStation() {
        if (currentRadioStation >= maxStation) {
            this.currentRadioStation = minStation;
            return;
        }
        this.currentRadioStation++;
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

    public void volumeUpForOne() {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
        }
        if (currentVolume < maxVolume) {
            this.currentVolume++;
        }
    }

    public void volumeDawnOne() {
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
        }
        if (currentVolume > minVolume) {
            this.currentVolume--;
        }
    }

}