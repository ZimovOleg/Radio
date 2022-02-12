package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    // Тесты переключения радиостанции


    @Test //Проверка максимальной станции при установки больше станций
    void shouldMaxStationForRadioStationMax() {
        Radio radio = new Radio(20);
        assertEquals(19, radio.getMaxStation());
    }

    @Test //Установка любого кол-ва станций
    void shouldRadioStationBelowMaxLimit() {
        Radio radio = new Radio(45);
        assertEquals(45, radio.getMaxNumberOfStations());
    }

    @Test //Установка радиостанции выше максимального
    void shouldSetCurrentRadioStationBelowMaxLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test //Установка радиостанции ниже минимального
    void shouldSetCurrentRadioStationBelowMinLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test //Переключение радиостанции вниз
    void nextDawnRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(3);
        radio.prevRadioStation();
        assertEquals(2, radio.getCurrentRadioStation());
    }

    @Test //Переключение радиостанции вверх
    void nextUpRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(3);
        radio.nextRadioStation();
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test //Переключение радиостанции вверх на максимальном значение
    void nextUpRadioStationMaxLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test //Переключение радиостанции вверх на минимальном значение
    void nextDawnRadioStationMinLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test //Установка радиостанции в минимальном значение
    void shouldSetCurrentRadioStationMinLimit () {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test //Установка радиостанции в максимальном значение
    void shouldSetCurrentRadioStationMaxLimit () {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        assertEquals(9, radio.getCurrentRadioStation());
    }

    // Тест увелечения и уменьшения громкости

    @Test //Установка громкости в допустимых пределах
    void shouldSetCurrenVolume () {
        Radio radio = new Radio();
        radio.setVolume(55);
        assertEquals(55, radio.getVolume());
    }

    @Test //Установка громкости в минимальном значение
    void ChangeVolumeDownMinValue () {
        Radio radio = new Radio();
        radio.setVolume(0);
        assertEquals(0, radio.getVolume());
    }

    @Test //Установка громкости в максимальном значение
    void ChangeVolumeDownMaxValue () {
        Radio radio = new Radio();
        radio.setVolume(100);
        assertEquals(100, radio.getVolume());
    }

    @Test //Увелечение громкости на 1
    void volumeUpOne () {
        Radio radio = new Radio();
        radio.setVolume(50);
        radio.volumeUpForOne();
        assertEquals(51, radio.getVolume());
    }

    @Test //Уменьшение громкости на 1
    void volumeDawnOne () {
        Radio radio = new Radio();
        radio.setVolume(45);
        radio.volumeDawnOne();
        assertEquals(44, radio.getVolume());
    }

    @Test //Увелечение громкости на 1 на максимальном значение
    void volumeUpOneMaxLimit () {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.volumeUpForOne();
        assertEquals(100, radio.getVolume());
    }

    @Test //Уменьшение громкости на 1 на минимальном значение
    void volumeDawnOneMinLimit () {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.volumeDawnOne();
        assertEquals(0, radio.getVolume());
    }

    @Test //Установка громкости меньше минимального значения
    void ChangeVolumeDownAboutMinValue () {
        Radio radio = new Radio();
        radio.setVolume(-1);
        radio.volumeDawnOne();
        assertEquals(0, radio.getVolume());
    }

    @Test //Установка громкости выше максимального значения
    void ChangeVolumeDownAboutMaxValue  () {
        Radio radio = new Radio();
        radio.setVolume(101);
        radio.volumeUpForOne();
        assertEquals(100, radio.getVolume());
    }

}