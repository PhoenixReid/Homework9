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

    private int radiovolume;

    public int getRadioVolume() {
        return radiovolume;
    }

    public void setRadioVolume(int radioVolume) {
        if (radioVolume < 0) {
            return;
        }
        if (radioVolume > 100) {
            return;
        }
        radiovolume = radioVolume;
    }

    private int minradiostation = 0;

    public int getminradiostation() {
        return minradiostation;
    }

    private int radiostation;

    public int getRadioStation() {
        return radiostation;
    }

    public void setRadioStation(int radioStation) {
        if (radioStation < minradiostation) {
            return;
        }
        if (radioStation > maxradiostation) {
            return;
        }
        radiostation = radioStation;
    }

    public void RadioStationNext() {
        if (radiostation == maxradiostation) {
            radiostation = minradiostation;
        } else {
            radiostation++;
        }
    }

    public void RadioStationPrev() {
        if (radiostation == minradiostation) {
            radiostation = maxradiostation;
        } else {
            radiostation--;
        }
    }

    public void RadioVolumePlus() {
        if (radiovolume < 100) {
            radiovolume++;
        }
    }

    public void RadioVolumeMinus() {
        if (radiovolume > 0) {
            radiovolume--;
        }
    }


}
