package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxVolume = 10;
    private int maxStation = 9;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
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

    public void switchToNextStation(){
        if (currentRadioStation == maxStation){
            currentRadioStation = 0;
            return;
        } currentRadioStation++;
    }

    public void switchToPreviousStation(){
        if (currentRadioStation == 0){
            currentRadioStation = maxStation;
            return;
        } currentRadioStation--;
    }

}
