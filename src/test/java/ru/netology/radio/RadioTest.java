package ru.netology.radio;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @org.junit.jupiter.api.Test
    void increaseVolumeUnderMaximum() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        int expected = 10;

        assertEquals(expected,radio.getCurrentVolume());
    }
    @org.junit.jupiter.api.Test
    void increaseVolumeAfterMaximum() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;

        assertEquals(expected,radio.getCurrentVolume());
    }

    @org.junit.jupiter.api.Test
    void turnDownVolumeUnderMinimum() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.turnDownVolume();
        int expected = 0;

        assertEquals(expected,radio.getCurrentVolume());
    }

    @org.junit.jupiter.api.Test
    void turnDownVolumeAfterMinimum() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.turnDownVolume();
        int expected = 0;

        assertEquals(expected,radio.getCurrentVolume());
    }

    @org.junit.jupiter.api.Test
    void switchToNextStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(3);
        radio.switchToNextStation();
        int expected = 4;

        assertEquals(expected,radio.getCurrentRadioStation());
    }

    @org.junit.jupiter.api.Test
    void switchToNextStationFromLast() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.switchToNextStation();
        int expected = 0;

        assertEquals(expected,radio.getCurrentRadioStation());
    }

    @org.junit.jupiter.api.Test
    void switchToPreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.switchToPreviousStation();
        int expected = 4;

        assertEquals(expected,radio.getCurrentRadioStation());
    }
    @org.junit.jupiter.api.Test
    void switchToPreviousStationFromFirst() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.switchToPreviousStation();
        int expected = 9;

        assertEquals(expected,radio.getCurrentRadioStation());
    }
}