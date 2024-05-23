package ru.netology;

public class Radio {
    private int maxStation = 9;
    private int minStation = 0;
    private int currentRadioStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int volume = minVolume;

    public Radio(int currentRadioStation, int maxStation, int minStation, int volume, int maxVolume, int minVolume) {
        this.currentRadioStation = currentRadioStation;
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.volume = volume;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }

    public Radio() {

    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getVolume() {
        return volume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setInstallingARadioStation(int newCurrentRadioStation) {// Установка радиостанции
        if (newCurrentRadioStation > maxStation) {
            return;
        }
        if (newCurrentRadioStation < minStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }


    public void next() { // увеличение станции на 1
        if (currentRadioStation < maxStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }


    public void prev() { // уменьшение станции на 1
        if (currentRadioStation > minStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
    }

    public void setVolume(int newVolume) {// Установка громкости
        if (newVolume > maxVolume) {
            newVolume = maxVolume;
        }
        if (newVolume < minVolume) {
            newVolume = minVolume;
        }
        volume = newVolume;
    }


    public void increaseVolume() { // увеличение громкости
        if (volume < maxVolume) {
            volume = volume + 1;
        } else {
            volume = maxVolume;
        }
    }


    public void decreaseVolume() { // уменьшение громкости
        if (volume > minVolume) {
            volume = volume - 1;
        } else {
            volume = minVolume;
        }
    }
}

