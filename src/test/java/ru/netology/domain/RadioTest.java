package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio(9,5,100,25);

    // Тесты переключения радиостанции

    @Test //Установка радиостанции в допустимых пределах (от 0 до 9 - всего 10 радиостанций)
    void shouldSetCurrentRadioStation() {
        radio.setCurrentRadioStation(6);
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test //Установка радиостанции выше максимального
    void shouldSetCurrentRadioStationBelowMaxLimit() {
        radio.setCurrentRadioStation(10);
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test //Установка радиостанции ниже минимального
    void shouldSetCurrentRadioStationBelowMinLimit() {
        radio.setCurrentRadioStation(-1);
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test //Переключение радиостанции вниз
    void nextDawnRadioStation() {
        radio.setCurrentRadioStation(3);
        radio.prevRadioStation();
        assertEquals(2, radio.getCurrentRadioStation());
    }

    @Test //Переключение радиостанции вверх
    void nextUpRadioStation() {
        radio.setCurrentRadioStation(3);
        radio.nextRadioStation();
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test //Переключение радиостанции вверх на максимальном значение
    void nextUpRadioStationMaxLimit() {
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test //Переключение радиостанции вверх на минимальном значение
    void nextDawnRadioStationMinLimit() {
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test //Установка радиостанции в минимальном значение
    void shouldSetCurrentRadioStationMinLimit () {
        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test //Установка радиостанции в максимальном значение
    void shouldSetCurrentRadioStationMaxLimit () {
        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    // Тест увелечения и уменьшения громкости

    @Test //Установка громкости в допустимых пределах
    void shouldSetCurrenVolume () {
        radio.setVolume(55);
        assertEquals(55, radio.getVolume());
    }

    @Test //Установка громкости в минимальном значение
    void ChangeVolumeDownMinValue () {
        radio.setVolume(0);
        assertEquals(0, radio.getVolume());
    }

    @Test //Установка громкости в максимальном значение
    void ChangeVolumeDownMaxValue () {
        radio.setVolume(100);
        assertEquals(100, radio.getVolume());
    }

    @Test //Увелечение громкости на 1
    void volumeUpOne () {
        radio.setVolume(50);
        radio.volumeUpForOne();
        assertEquals(51, radio.getVolume());
    }

    @Test //Уменьшение громкости на 1
    void volumeDawnOne () {
        radio.setVolume(45);
        radio.volumeDawnOne();
        assertEquals(44, radio.getVolume());
    }

    @Test //Увелечение громкости на 1 на максимальном значение
    void volumeUpOneMaxLimit () {
        radio.setVolume(100);
        radio.volumeUpForOne();
        assertEquals(100, radio.getVolume());
    }

    @Test //Уменьшение громкости на 1 на минимальном значение
    void volumeDawnOneMinLimit () {
        radio.setVolume(0);
        radio.volumeDawnOne();
        assertEquals(0, radio.getVolume());
    }

    @Test //Установка громкости меньше минимального значения
    void ChangeVolumeDownAboutMinValue () {
        radio.setVolume(-1);
        radio.volumeDawnOne();
        assertEquals(0, radio.getVolume());
    }

    @Test //Установка громкости выше максимального значения
    void ChangeVolumeDownAboutMaxValue  () {
        radio.setVolume(101);
        radio.volumeUpForOne();
        assertEquals(100, radio.getVolume());
    }

}