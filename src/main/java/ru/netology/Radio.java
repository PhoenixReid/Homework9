package ru.netology;

public class Radio {
    private int numbersradiostations;

    public void setNumbersradiostations(int numbersradiostations) {
        this.numbersradiostations = numbersradiostations;
    }

    public int getNumbersradiostations() {
        return numbersradiostations;
    }

    private int maxradiostation = numbersradiostations - 1;

    public int getMaxradiostation() {
        return maxradiostation;
    }


    public Radio(int NumbersRadioStations) {
        this.numbersradiostations = NumbersRadioStations;
        maxradiostation = NumbersRadioStations - 1;
    }

    public Radio() {
        numbersradiostations = 10;
        maxradiostation = numbersradiostations - 1;
    }

    public int getNumbersRadioStations() {
        return numbersradiostations;
    }

    private int RadioVolume;

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

    private int minradiostation = 0;

    public int getminradiostation() {
        return minradiostation;
    }

    private int RadioStation;

    public int getRadioStation() {
        return RadioStation;
    }

    public void setRadioStation(int radioStation) {
        if (radioStation < minradiostation) {
            return;
        }
        if (radioStation > maxradiostation) {
            return;
        }
        RadioStation = radioStation;
    }

    public void RadioStationNext() {
        if (RadioStation == maxradiostation) {
            RadioStation = minradiostation;
        } else {
            RadioStation++;
        }
    }

    public void RadioStationPrev() {
        if (RadioStation == minradiostation) {
            RadioStation = maxradiostation;
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
