package ru.netology;

public class Radio {
    private int radioStationNumber;
    private int soundVolume;
    private int amountRadioStation;

    public Radio(int amountRadioStation) {
        this.amountRadioStation = amountRadioStation;
    }

    public Radio() {
        amountRadioStation = 10;
    }

    public int getAmountRadioStation() {
        return amountRadioStation;
    }

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        int lastStation = amountRadioStation - 1;
        ;
        if (newRadioStationNumber > lastStation) {
            return;
        }
        if (newRadioStationNumber <= 0) {
            return;
        }
        radioStationNumber = newRadioStationNumber;
    }


    public void next() {
        int lastStation = amountRadioStation - 1;
        if (radioStationNumber >= lastStation) {
            radioStationNumber = 0;
        } else {
            radioStationNumber = radioStationNumber + 1;
        }
    }

    public void prev() {
        int lastStation = amountRadioStation - 1;
        if (radioStationNumber <= 0) {
            radioStationNumber = lastStation;
        } else {
            radioStationNumber = radioStationNumber - 1;
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume > 100) {
            return;
        }
        if (newSoundVolume < 0) {
            return;
        }
        soundVolume = newSoundVolume;
    }

    public void setToMaxSoundVolume() {
        soundVolume = 100;
    }

    public void setToMinSoundVolume() {
        soundVolume = 0;
    }

    public void volumeUp() {
        if (soundVolume < 100) {
            soundVolume = soundVolume + 1;
        } else {
            setToMaxSoundVolume();
        }
    }

    public void volumeDown() {
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        } else {
            setToMinSoundVolume();
        }
    }
}