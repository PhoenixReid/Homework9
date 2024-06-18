package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void Constructor1Test(){
        Radio station = new Radio(30);
        int expected = 30;
        int actual = station.getNumbersRadioStations();
        Assertions.assertEquals(expected, actual);
        int expectedMAx = 29;
        int actualdMax = station.MaxRadioStation;
        Assertions.assertEquals(expectedMAx, actualdMax);
    }

    @Test
    public void Constructor2Test(){
        Radio station = new Radio();
        int expected = 10;
        int actual = station.getNumbersRadioStations();
        Assertions.assertEquals(expected, actual);
        int expectedMAx = 9;
        int actualdMax = station.MaxRadioStation;
        Assertions.assertEquals(expectedMAx, actualdMax);
    }

    @Test
    public void Constructor1SetRadioStationTest(){
        Radio station = new Radio(30);
        station.setRadioStation(14);
        int expected = 14;
        int actual = station.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Constructor2SetRadioStationTest(){
        Radio station = new Radio();
        station.setRadioStation(4);
        int expected = 4;
        int actual = station.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Constructor1SetRadioStationMinTest(){
        Radio station = new Radio(30);
        station.setRadioStation(-4);
        int expected = 0;
        int actual = station.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Constructor2SetRadioStationMinTest(){
        Radio station = new Radio();
        station.setRadioStation(-4);
        int expected = 0;
        int actual = station.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Constructor1SetRadioStationMaxTest(){
        Radio station = new Radio(30);
        station.setRadioStation(44);
        int expected = 0;
        int actual = station.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Constructor2SetRadioStationMaxTest(){
        Radio station = new Radio();
        station.setRadioStation(44);
        int expected = 0;
        int actual = station.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Constructor1RadioStationNextTest(){
        Radio station = new Radio(30);
        int expected = 1;
        station.RadioStationNext();
        int actual = station.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Constructor2RadioStationNextTest(){
        Radio station = new Radio();
        int expected = 1;
        station.RadioStationNext();
        int actual = station.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Constructor1RadioStationNextMAXTest(){
        Radio station = new Radio(30);
        station.setRadioStation(station.MaxRadioStation);
        station.RadioStationNext();
        int expected = 0;
        int actual = station.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Constructor2RadioStationNextMAXTest(){
        Radio station = new Radio();
        station.setRadioStation(station.MaxRadioStation);
        station.RadioStationNext();
        int expected = 0;
        int actual = station.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Constructor1RadioStationPrevTest(){
        Radio station = new Radio(30);
        station.setRadioStation(10);
        station.RadioStationPrev();
        int expected = 9;
        int actual = station.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Constructor2RadioStationPrevTest(){
        Radio station = new Radio();
        station.setRadioStation(5);
        station.RadioStationPrev();
        int expected = 4;
        int actual = station.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Constructor1RadioStationPrevMinTest(){
        Radio station = new Radio(30);
        station.setRadioStation(0);
        station.RadioStationPrev();
        int expected = 29;
        int actual = station.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Constructor2RadioStationPrevMinTest(){
        Radio station = new Radio();
        station.setRadioStation(0);
        station.RadioStationPrev();
        int expected = 9;
        int actual = station.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Constructor1SetRadioVolumeMaxTest(){
        Radio station = new Radio(30);
        station.setRadioVolume(143);
        int expected = 0;
        int actual = station.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Constructor2SetRadioVolumeMaxTest(){
        Radio station = new Radio();
        station.setRadioVolume(144);
        int expected = 0;
        int actual = station.getRadioVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void Constructor1SetRadioVolumeMinTest(){
        Radio station = new Radio(30);
        station.setRadioVolume(-134);
        int expected = 0;
        int actual = station.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Constructor2SetRadioVolumeMinTest(){
        Radio station = new Radio();
        station.setRadioVolume(-134);
        int expected = 0;
        int actual = station.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Constructor1RadioVolumePlusTest(){
        Radio station = new Radio(30);
        station.setRadioVolume(10);
        station.RadioVolumePlus();
        int expected = 11;
        int actual = station.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Constructor2RadioVolumePlusTest(){
        Radio station = new Radio();
        station.setRadioVolume(5);
        station.RadioVolumePlus();
        int expected = 6;
        int actual = station.getRadioVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void Constructor1RadioVolumePlusMAxTest(){
        Radio station = new Radio(30);
        station.setRadioVolume(100);
        station.RadioVolumePlus();
        int expected = 100;
        int actual = station.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Constructor2RadioVolumePlusMaxTest(){
        Radio station = new Radio();
        station.setRadioVolume(100);
        station.RadioVolumePlus();
        int expected = 100;
        int actual = station.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Constructor1RadioVolumeMinusTest(){
        Radio station = new Radio(30);
        station.setRadioVolume(10);
        station.RadioVolumeMinus();
        int expected = 9;
        int actual = station.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Constructor2RadioVolumeMinusTest(){
        Radio station = new Radio();
        station.setRadioVolume(5);
        station.RadioVolumeMinus();
        int expected = 4;
        int actual = station.getRadioVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void Constructor1RadioVolumeMinusMinTest(){
        Radio station = new Radio(30);
        station.setRadioVolume(0);
        station.RadioVolumeMinus();
        int expected = 0;
        int actual = station.getRadioVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void Constructor2RadioVolumeMinusMinTest(){
        Radio station = new Radio();
        station.setRadioVolume(0);
        station.RadioVolumeMinus();
        int expected = 0;
        int actual = station.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
}
