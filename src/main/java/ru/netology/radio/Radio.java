package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxVolume = 100;
    private int maxStation;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation <= maxStation) {
            this.currentRadioStation = currentRadioStation;
        } else {
            System.out.println("Ошибка! Такой радиостанции нет!");
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }

    public Radio() {
        this.maxStation = 9;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void turnDownVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void switchToNextStation() {
        if (currentRadioStation == maxStation) {
            currentRadioStation = 0;
            return;
        }
        currentRadioStation++;
    }

    public void switchToPreviousStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = maxStation;
            return;
        }
        currentRadioStation--;
    }

}
