package ru.netology.radio;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxVolume = 100;
    private int maxStation;

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation <= maxStation) {
            this.currentRadioStation = currentRadioStation;
        } else {
            System.out.println("Ошибка! Такой радиостанции нет!");
        }
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
