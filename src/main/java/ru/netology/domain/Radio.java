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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getMaxVolume() {
        return maxVolume;
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

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public boolean isNext() {
        return next;
    }


    public void setNext(boolean next) {
        this.next = next;
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

    public boolean isPrev() {
        return prev;
    }

    public void setPrev(boolean prev) {
        this.prev = prev;
    }

    public boolean isPlus() {
        return plus;
    }

    public void setPlus(boolean plus) {
        this.plus = plus;
    }

    public boolean isMinus() {
        return minus;
    }

    public void setMinus(boolean minus) {
        this.minus = minus;
    }
}
