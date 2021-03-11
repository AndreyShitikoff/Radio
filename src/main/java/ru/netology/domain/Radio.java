package ru.netology.domain;

public class Radio {
    private String name;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;
    private boolean on;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;




    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public void changeNextStation(){
        currentStation ++;
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
    }
    public void changePrevStation(){
        currentStation --;
        if (currentStation < minStation){
            currentStation = maxStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void volumeUp(){
        currentVolume ++;
        if (currentVolume >= maxVolume){
            currentVolume = maxVolume;
        }
    }
    public void volumeDown() {
        currentVolume--;
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        }
    }
}
