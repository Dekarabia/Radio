package ru.netology;

public class Radio {
    private int currentRadioStation;
    private int volume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getVolume() {
        return volume;
    }


    public void setInstallingARadioStation(int newCurrentRadioStation) {// Установка радиостанции
        if (newCurrentRadioStation > 9) {
            return;
        }
        if (newCurrentRadioStation < 0) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }


    public void next() { // увеличение станции на 1
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }


    public void prev() { // уменьшение станции на 1
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
    }

    public void setVolume(int newVolume) {// Установка громкости
        if (newVolume > 100) {
            newVolume = 100;
        }
        if (newVolume < 0) {
            newVolume = 0;
        }
        volume = newVolume;
    }


    public void increaseVolume() { // увеличение громкости
        if (volume < 100) {
            volume = volume + 1;
        } else {
            volume = 100;
        }
    }


    public void decreaseVolume() { // уменьшение громкости
        if (volume > 0) {
            volume = volume - 1;
        } else {
            volume = 0;
        }
    }
}


