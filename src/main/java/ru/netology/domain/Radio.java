package ru.netology.domain;

public class Radio {
    private String name;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;
    private boolean on;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume;
    private boolean next = true;
    private boolean prev = true;
    private boolean plus = true;
    private boolean minus = true;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public void changeNextStation(){
        currentStation ++;
        if (currentStation > 9) {
            currentStation = 0;
        }
    }
    public void changePrevStation(){
        currentStation --;
        if (currentStation < 0){
            currentStation = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void volumeUp(){
        if (currentVolume >= maxVolume){
            return;
        }
        currentVolume ++;
    }
    public void volumeDown(){
        if (currentVolume <= minVolume){
            return;
        }
        currentVolume --;
    }

}
