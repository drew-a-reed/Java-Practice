package com.techelevator;

public class Television {
    //variables
    private boolean isOn = false;
    private int currentChannel = 3;
    private int currentVolume = 2;
    //setters
    public boolean isOn() {
        return this.isOn;
    }
    public int getCurrentChannel() {
        return this.currentChannel;
    }
    public int getCurrentVolume() {
        return this.currentVolume;
    }
    //methods
    public void turnOff(){
        this.isOn = false;
    }
    public void turnOn(){
        this.isOn = true;
        this.currentChannel = 3;
        this.currentVolume = 2;
    }
    public void changeChannel(int newChannel){
        if ((newChannel > 2 && newChannel < 19) && this.isOn) {
            this.currentChannel = newChannel;
        }
    }
    public void channelUp(){
        if (this.isOn){
            if (this.currentChannel < 18){
                currentChannel++;
            } else {
                currentChannel = 3;
            }
        }
    }
    public void channelDown(){
        if (this.isOn){
            if (this.currentChannel > 3){
                currentChannel--;
            } else {
                currentChannel = 18;
            }
        }
    }
    public void raiseVolume() {
        if (this.isOn) {
            if (this.currentVolume < 11) {
                currentVolume++;
            } else {
                currentVolume = 10;
            }
        }
    }
    public void lowerVolume(){
        if (this.isOn) {
            if (this.currentVolume > 0){
                currentVolume--;
            } else {
                currentVolume = 0;
            }}
    }

}
