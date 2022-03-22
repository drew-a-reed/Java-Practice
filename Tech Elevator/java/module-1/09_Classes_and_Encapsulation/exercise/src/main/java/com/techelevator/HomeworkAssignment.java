package com.techelevator;

import javax.swing.text.html.HTMLDocument;

public class HomeworkAssignment {
    //variables
    private int earnedMarks;
    private final int possibleMarks;
    private final String submitterName;

    //getters
    public int getPossibleMarks() {
        return possibleMarks;
    }
    public int getEarnedMarks() {
        return earnedMarks;
    }
    public String getSubmitterName() {
        return submitterName;
    }
    public String getLetterGrade() {
        double percentage = (double) earnedMarks / possibleMarks;
        if (percentage >= 0.9) {
            return "A";
        } else if (percentage >= 0.8) {
            return "B";
        } else if (percentage >= 0.7) {
            return "C";
        } else if (percentage >= 0.6) {
            return "D";
        } else {
            return "F";
        }
    }

    //setters
    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }

    //constructor
    public HomeworkAssignment(int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

}
