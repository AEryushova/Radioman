package ru.netology;

public class Radio {
    int radioStationNumber;
    int soundVolume;

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber > 9) {
            return;
        }
        if (newRadioStationNumber < 0) {
            return;
        }
        radioStationNumber = newRadioStationNumber;
    }


    public void next() {
        if (radioStationNumber >= 9) {
            radioStationNumber = 0;
        } else {
            radioStationNumber = radioStationNumber + 1;
        }
    }

    public void prev() {
        if (radioStationNumber <= 0) {
            radioStationNumber = 9;
        } else {
            radioStationNumber = radioStationNumber - 1;
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume > 10) {
            return;
        }
        if (newSoundVolume < 0) {
            return;
        }
        soundVolume = newSoundVolume;
    }

    public void setToMaxSoundVolume() {
        soundVolume = 10;
    }

    public void setToMinSoundVolume() {
        soundVolume = 0;
    }

    public void volumeUp() {
        if (soundVolume < 10) {
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