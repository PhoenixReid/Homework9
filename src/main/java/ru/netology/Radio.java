package ru.netology;

public class Radio {
    private int numbersradiostations;

    private int maxradiostation = numbersradiostations - 1;

    private int radiostation;

    private int radiovolume;

    private int minradiostation = 0;


    public Radio(int numbersRadioStations) {
        this.numbersradiostations = numbersRadioStations;
        maxradiostation = numbersRadioStations - 1;
    }

    public Radio() {
        numbersradiostations = 10;
        maxradiostation = numbersradiostations - 1;
    }


    public int getNumbersradiostations() {
        return numbersradiostations;
    }

    public int getMaxradiostation() {
        return maxradiostation;
    }

    public int getNumbersRadioStations() {
        return numbersradiostations;
    }

    public int getRadioVolume() {
        return radiovolume;
    }

    public int getminradiostation() {
        return minradiostation;
    }

    public int getRadioStation() {
        return radiostation;
    }


    public void setNumbersradiostations(int numbersradiostations) {
        this.numbersradiostations = numbersradiostations;
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

    public void setRadioStation(int radioStation) {
        if (radioStation < minradiostation) {
            return;
        }
        if (radioStation > maxradiostation) {
            return;
        }
        radiostation = radioStation;
    }


    public void radioStationNext() {
        if (radiostation == maxradiostation) {
            radiostation = minradiostation;
        } else {
            radiostation++;
        }
    }

    public void radioStationPrev() {
        if (radiostation == minradiostation) {
            radiostation = maxradiostation;
        } else {
            radiostation--;
        }
    }

    public void radioVolumePlus() {
        if (radiovolume < 100) {
            radiovolume++;
        }
    }

    public void radioVolumeMinus() {
        if (radiovolume > 0) {
            radiovolume--;
        }
    }


}
