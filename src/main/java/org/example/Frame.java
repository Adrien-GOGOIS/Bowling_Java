package org.example;

public class Frame {

    final int firstRoll;
    final int secondRoll;
    final FrameType type;

    public Frame(int firstRoll, int secondRoll) {
        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;

        this.type =
    }

    public int score() {
        return firstRoll + secondRoll;
    }
}
