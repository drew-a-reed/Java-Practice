package com.techelevator;

public class Airplane {
    //variables
    private final String planeNumber;
    private final int totalFirstClassSeats;
    private int bookedFirstClassSeats;
    private final int totalCoachSeats;
    private int bookedCoachSeats;

    //getters
    public String getPlaneNumber() {
        return planeNumber;
    }
    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;
    }
    public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;
    }
    public int getAvailableFirstClassSeats() {
        return  (getTotalFirstClassSeats() - getBookedFirstClassSeats());
    }
    public int getTotalCoachSeats() {
        return totalCoachSeats;
    }
    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }
    public int getAvailableCoachSeats() {
        return (getTotalCoachSeats() - getBookedCoachSeats());
    }

    //constructor
    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats){
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
    }

    //method
    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats){

        if(forFirstClass){
            if ((totalNumberOfSeats + getBookedFirstClassSeats()) <= getAvailableFirstClassSeats()){
                this.bookedFirstClassSeats += totalNumberOfSeats;
                return true;
            } else {
                return false;
            }
        } else {
            if ((totalNumberOfSeats + getBookedCoachSeats()) <= getAvailableCoachSeats()) {
                this.bookedCoachSeats += totalNumberOfSeats;
                return true;
            } else {
                return false;
            }
        }

    }

}
