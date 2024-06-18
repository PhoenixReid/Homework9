package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void LeastPossibleRadioStation() {
        Radio station = new Radio();
        station.setRadioStation(13);
        int expected = 0;
        int actual = station.getRadioStation();

    }

    @Test
    public void MostPossibleRadioStations() {
        Radio station = new Radio();
        station.setRadioStation(-3);
        int expected = 0;
        int actual = station.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void LeastPossibleRadioVolume() {
        Radio station = new Radio();
        station.setRadioVolume(130);
        int expected = 0;
        int actual = station.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MostPossibleRadioVolumeMax() {
        Radio station = new Radio();
        station.setRadioVolume(-1);
        int expected = 0;
        int actual = station.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioStationNextTest() {
        Radio station = new Radio();
        station.setRadioStation(0);
        station.RadioStationNext();
        int expected = 1;
        int actual = station.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioStationNextMaxTest() {
        Radio station = new Radio();
        station.setRadioStation(9);
        station.RadioStationNext();
        int expected = 0;
        int actual = station.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioStationPrevTest() {
        Radio station = new Radio();
        station.setRadioStation(0);
        station.RadioStationPrev();
        int expected = 9;
        int actual = station.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioStationPrevMinTest() {
        Radio station = new Radio();
        station.setRadioStation(9);
        station.RadioStationPrev();
        int expected = 8;
        int actual = station.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioStationTest() {
        Radio station = new Radio();
        station.setRadioStation(5);
        int expected = 5;
        int actual = station.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioVolumePlusTest() {
        Radio station = new Radio();
        station.setRadioVolume(50);
        station.RadioVolumePlus();
        int expected = 51;
        int actual = station.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioVolumePlusMaxTest() {
        Radio station = new Radio();
        station.setRadioVolume(100);
        station.RadioVolumePlus();
        int expected = 100;
        int actual = station.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void RadioVolumeMinusTest() {
        Radio station = new Radio();
        station.setRadioVolume(50);
        station.RadioVolumeMinus();
        int expected = 49;
        int actual = station.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioVolumeMinusMinTest() {
        Radio station = new Radio();
        station.setRadioVolume(0);
        station.RadioVolumeMinus();
        int expected = 0;
        int actual = station.getRadioVolume();
        Assertions.assertEquals(expected, actual);

    }




}
