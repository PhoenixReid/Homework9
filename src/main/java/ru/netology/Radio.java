package ru.netology;

public class Radio {

    public int RadioVolume;

    public int getRadioVolume() {
        return RadioVolume;
    }

    public void setRadioVolume(int radioVolume) {
        if (radioVolume < 0) {
            return;
        }
        if (radioVolume > 100) {
            return;
        }
        RadioVolume = radioVolume;
    }

    public int RadioStation;

    public int getRadioStation() {
        return RadioStation;
    }

    public void setRadioStation(int radioStation) {
        if (radioStation < 0) {
            return;
        }
        if (radioStation > 9) {
            return;
        }
        RadioStation = radioStation;
    }

    public void RadioStationNext() {
        if (RadioStation == 9) {
            RadioStation = 0;
        } else {
            RadioStation++;
        }
    }

    public void RadioStationPrev() {
        if (RadioStation == 0) {
            RadioStation = 9;
        } else {
            RadioStation--;
        }
    }

    public void RadioVolumePlus() {
        if (RadioVolume < 100) {
            RadioVolume++;
        }
    }

    public void RadioVolumeMinus() {
        if (RadioVolume > 0) {
            RadioVolume--;
        }
    }


}
