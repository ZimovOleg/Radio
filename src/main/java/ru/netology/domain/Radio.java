package ru.netology.domain;

public class Radio {
    private int numberOfStations = 10;

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
        this.maxStation = maxStation;
    }

    public Radio() {
    }

    private int minStation = 0;
    private int maxStation = numberOfStations - 1;
    private int currentRadioStation;

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = 25;

    public int getNumberOfStations() {
        return numberOfStations;
    }

    public void setNumberOfStations(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

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