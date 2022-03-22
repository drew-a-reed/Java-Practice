package com.techelevator;

public class Elevator {
    //variables
    private int currentFloor;
    private final int numberOfFloors;
    private boolean doorOpen;

    //getters
    public int getCurrentFloor() {
        return this.currentFloor;
    }
    public int getNumberOfFloors() {
        return this.numberOfFloors;
    }
    public boolean isDoorOpen() {
        return this.doorOpen;
    }

    //constructor
    public Elevator(int numberOfLevels){
        this.numberOfFloors = numberOfLevels;
        this.currentFloor = 1;
    }

    //methods
    public void openDoor(){
        this.doorOpen = true;
    }
    public void closeDoor(){
        this.doorOpen = false;
    }
    public void goUp(int desiredFloor){
        if ((!this.doorOpen && (desiredFloor <= numberOfFloors) && (desiredFloor > currentFloor))){
            currentFloor = desiredFloor;
        }
    }
    public void goDown(int desiredFloor){
        if ((!this.doorOpen && (desiredFloor > 0) && (desiredFloor < currentFloor))) {
            currentFloor = desiredFloor;
        }
    }

}
