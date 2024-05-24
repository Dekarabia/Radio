package ru.netology;

public class Radio {
    private int maxStation = 9;
    private int minStation = 0;
    private int currentRadioStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int volume;

    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }

    public Radio(int volume, int minVolume, int maxVolume, int currentRadioStation, int minStation, int maxStation) {
        this.volume = volume;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentRadioStation = currentRadioStation;
        this.minStation = minStation;
        this.maxStation = maxStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getVolume() {
        return volume;
    }


    public void setCurrentRadioStation(int newCurrentRadioStation) {// Установка радиостанции
        if (newCurrentRadioStation > maxStation) {
            return;
        }
        if (newCurrentRadioStation < minStation) {
            return;
        }
        this.currentRadioStation = newCurrentRadioStation;
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


