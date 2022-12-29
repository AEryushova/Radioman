package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetRadioStation() {
        Radio rad = new Radio();
        rad.setRadioStationNumber(4);
        int expected = 4;
        int actual = rad.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationOnTheUpperLimit() {
        Radio rad = new Radio();
        rad.setRadioStationNumber(9);
        int expected = 9;
        int actual = rad.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationAtTheBottomLimit() {
        Radio rad = new Radio();
        rad.setRadioStationNumber(0);
        int expected = 0;
        int actual = rad.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationWithinTheUpperBound() {
        Radio rad = new Radio();
        rad.setRadioStationNumber(8);
        int expected = 8;
        int actual = rad.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationWithinTheLowerBound() {
        Radio rad = new Radio();
        rad.setRadioStationNumber(1);
        int expected = 1;
        int actual = rad.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationAboveTheLimit() {
        Radio rad = new Radio();
        rad.setRadioStationNumber(10);
        int expected = 0;
        int actual = rad.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationBelowTheLimit() {
        Radio rad = new Radio();
        rad.setRadioStationNumber(-1);
        int expected = 0;
        int actual = rad.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingRadioStationViaTheNextButton() {
        Radio rad = new Radio();
        rad.setRadioStationNumber(4);
        rad.next();
        int expected = 5;
        int actual = rad.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchRadioStationAboveTheLimitViaTheNextButton() {
        Radio rad = new Radio();
        rad.setRadioStationNumber(9);
        rad.next();
        int expected = 0;
        int actual = rad.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchTheRadioStationToTheLastOneInTheBorderViaTheNextButton() {
        Radio rad = new Radio();
        rad.setRadioStationNumber(8);
        rad.next();
        int expected = 9;
        int actual = rad.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchRadioStationFromTheFirstOneViaTheNextButton() {
        Radio rad = new Radio();
        rad.setRadioStationNumber(0);
        rad.next();
        int expected = 1;
        int actual = rad.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSwitchRadioStationViaThePrevButton() {
        Radio rad = new Radio();
        rad.setRadioStationNumber(5);
        rad.prev();
        int expected = 4;
        int actual = rad.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchRadioStationLowerTheLimitViaThePrevButton() {
        Radio rad = new Radio();
        rad.setRadioStationNumber(0);
        rad.prev();
        int expected = 9;
        int actual = rad.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingRadioStationAboveTheLimitViaThePrevButton() {
        Radio rad = new Radio();
        rad.setRadioStationNumber(9);
        rad.prev();
        int expected = 8;
        int actual = rad.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitcRadioStationtTheLowerLimitViaThePrevButton() {
        Radio rad = new Radio();
        rad.setRadioStationNumber(1);
        rad.prev();
        int expected = 0;
        int actual = rad.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToVolumeAboveTheLimit() {
        Radio rad = new Radio();
        rad.setSoundVolume(11);
        int expected = 0;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToVolumeBelowTheLimit() {
        Radio rad = new Radio();
        rad.setSoundVolume(-1);
        int expected = 0;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio rad = new Radio();
        rad.setToMaxSoundVolume();
        int expected = 10;
        int actual = rad.soundVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() {
        Radio rad = new Radio();
        rad.setToMinSoundVolume();
        int expected = 0;
        int actual = rad.soundVolume;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseTheVolumeFromTheMaximumValue() {
        Radio rad = new Radio();
        rad.setToMaxSoundVolume();
        rad.volumeUp();
        int expected = 10;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseTheVolumeFromTheMinimumValue() {
        Radio rad = new Radio();
        rad.setToMinSoundVolume();
        rad.volumeUp();
        int expected = 1;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnUpTheVolumeToMaximum() {
        Radio rad = new Radio();
        rad.setSoundVolume(9);
        rad.volumeUp();
        int expected = 10;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseTheVolumeFromTheMaximumValue() {
        Radio rad = new Radio();
        rad.setToMaxSoundVolume();
        rad.volumeDown();
        int expected = 9;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseTheVolumeFromTheMinimumValue() {
        Radio rad = new Radio();
        rad.setToMinSoundVolume();
        rad.volumeDown();
        int expected = 0;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseTheVolumeToMinimum() {
        Radio rad = new Radio();
        rad.setSoundVolume(1);
        rad.volumeDown();
        int expected = 0;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

}