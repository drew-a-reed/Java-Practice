package com.techelevator;

public class FruitTree {
    //variables
    private final String typeOfFruit;
    private int piecesOfFruitLeft;

    //getters
    public String getTypeOfFruit() {
        return typeOfFruit;
    }
    public int getPiecesOfFruitLeft() {
        return piecesOfFruitLeft;
    }

    //constructor
    public FruitTree(String typeOfFruit, int startingPiecesOfFruit){
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = startingPiecesOfFruit;
    }

    //method
    public boolean pickFruit(int numberOfPiecesToRemove){
        if (piecesOfFruitLeft - numberOfPiecesToRemove >= 0){
            piecesOfFruitLeft -= numberOfPiecesToRemove;
            return true;
        } else {
            return false;
        }
    }

}
