package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void nextUpRadioStation() {
        ru.nelogy.Radio radio = new ru.nelogy.Radio();
        int currentRadioStation = 5;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.nextRadioStation ();
        int expected = 6;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void nextUpRadioStationMax() {
        ru.nelogy.Radio radio = new ru.nelogy.Radio();
        int currentRadioStation = 10;
        radio.setCurrentRadioStation(currentRadioStation);
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void nextUpRadioStationMin() {
        ru.nelogy.Radio radio = new ru.nelogy.Radio();
        int currentRadioStation = -1;
        radio.setCurrentRadioStation(currentRadioStation);
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void nextDawnRadioStation() {
        ru.nelogy.Radio radio = new ru.nelogy.Radio();
        int currentRadioStation = 5;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.prevRadioStation ();
        int expected = 4;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void switchingRadioStationToMaximumValue() {
        ru.nelogy.Radio radio = new ru.nelogy.Radio();
        int currentRadioStation = 9;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.nextRadioStation ();
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void switchingRadioStationToMinimumValue() {
        ru.nelogy.Radio radio = new ru.nelogy.Radio();
        int currentRadioStation = 0;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.prevRadioStation ();
        int expected = 9;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void notСhangeVolumeDownMinValue() {
        ru.nelogy.Radio radio = new ru.nelogy.Radio();
        int currentVolume = 0;
        radio.setVolume(currentVolume);
        radio.volumeDawnOne();
        int expected = 0;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void notСhangeVolumeDownMaxValue() {
        ru.nelogy.Radio radio = new ru.nelogy.Radio();
        int currentVolume = 10;
        radio.setVolume(currentVolume);
        radio.volumeUpOne();
        int expected = 10;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void settingVolumeAboveTheMaximumValue() {
        ru.nelogy.Radio radio = new ru.nelogy.Radio();
        int currentVolume = 11;
        radio.setVolume(currentVolume);
        radio.volumeUpOne();
        int expected = 10;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void settingVolumeAboveTheMinimumValue() {
        ru.nelogy.Radio radio = new ru.nelogy.Radio();
        int currentVolume = -1;
        radio.setVolume(currentVolume);
        radio.volumeDawnOne();
        int expected = 0;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void volumeUpOne() {
        ru.nelogy.Radio radio = new ru.nelogy.Radio();
        int currentVolume = 8;
        radio.setVolume(currentVolume);
        radio.volumeUpOne();
        int expected = 9;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void volumeDawnOne() {
        ru.nelogy.Radio radio = new ru.nelogy.Radio();
        int currentVolume = 5;
        radio.setVolume(currentVolume);
        radio.volumeDawnOne();
        int expected = 4;
        assertEquals(expected, radio.getVolume());
    }

}
