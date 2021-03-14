package ru.netology.domain.constructor;

public class Radio {
    private String name;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;
    private boolean on;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;



    public Radio(String name, int maxStation, int minStation, int currentStation, boolean on, int maxVolume, int minVolume, int currentVolume) {
        this.name = name;
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.currentStation = currentStation;
        this.on = on;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation () {
            return currentStation;
        }

        public void setCurrentStation ( int currentStation){
            this.currentStation = currentStation;
        }

        public void changeNextStation () {
            currentStation++;
            if (currentStation >= maxStation) {
                currentStation = minStation;
            }
        }
        public void changePrevStation () {
            currentStation--;
            if (currentStation <= minStation) {
                currentStation = maxStation;
            }
        }

        public int getCurrentVolume () {
            return currentVolume;
        }

        public void setCurrentVolume ( int currentVolume){
            this.currentVolume = currentVolume;
        }

        public void volumeUp () {
            currentVolume++;
            if (currentVolume >= maxVolume) {
                currentVolume = maxVolume;
            }
        }
        public void volumeDown () {
            currentVolume--;
            if (currentVolume <= minVolume) {
                currentVolume = minVolume;
            }
        }
}
