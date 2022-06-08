package org.example;

public class Frame {

    final int firstRoll;
    final int secondRoll;

    public Frame(int firstRoll, int secondRoll) {
        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;
    }

    public int score() {
        return firstRoll + secondRoll;
    }

    public boolean isSpare() {
        return firstRoll < 10 && score() == 10;
    }

    public boolean isStrike() {
        return firstRoll == 10;
    }
}
