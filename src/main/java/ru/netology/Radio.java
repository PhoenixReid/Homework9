package ru.netology;

public class Radio {
    public int NumbersRadioStations;
    public int MaxRadioStation = NumbersRadioStations - 1;

    public  Radio(int NumbersRadioStations){
        this.NumbersRadioStations = NumbersRadioStations;
         MaxRadioStation = NumbersRadioStations - 1;
    }

    public Radio(){
        NumbersRadioStations = 10;
        MaxRadioStation = NumbersRadioStations - 1;
    }

    public int getNumbersRadioStations(){
        return NumbersRadioStations;
    }
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
    public int MinRadioStation = 0;

    public int RadioStation;

    public int getRadioStation() {
        return RadioStation;
    }

    public void setRadioStation(int radioStation) {
        if (radioStation < MinRadioStation) {
            return;
        }
        if (radioStation > MaxRadioStation) {
            return;
        }
        RadioStation = radioStation;
    }

    public void RadioStationNext() {
        if (RadioStation == MaxRadioStation) {
            RadioStation = MinRadioStation;
        } else {
            RadioStation++;
        }
    }

    public void RadioStationPrev() {
        if (RadioStation == MinRadioStation) {
            RadioStation = MaxRadioStation;
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
