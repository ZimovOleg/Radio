package ru.nelogy;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > 9) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void prevRadioStation() {
        if (currentRadioStation == 0) {
            this.currentRadioStation = 9;
            return;
        }
        this.currentRadioStation = currentRadioStation - 1;
    }

    public void nextRadioStation() {
        if (currentRadioStation == 9) {
            this.currentRadioStation = 0;
            return;
        }
        this.currentRadioStation = currentRadioStation + 1;
    }

    public int getVolume() {
        return currentVolume;
    }

    public void setVolume(int currentVolume) {
        if (currentVolume < 0) {
            this.currentVolume = 0;
        }
        if (currentVolume > 10) {
            this.currentVolume = 10;
        }
        this.currentVolume = currentVolume;
    }

    public void volumeUpOne () {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume > 10) {
            this.currentVolume = 10;
        }
    }

    public void volumeDawnOne () {

        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume < 0) {
            this.currentVolume = 0;
        }
    }

}