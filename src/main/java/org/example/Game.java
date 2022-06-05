package org.example;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public List<Frame> bowling = new ArrayList<>();
    public void play() {

        Try firstTry = new Try('9');
        Try secondTry = new Try('-');
        Frame firstFrame = new Frame(firstTry, secondTry);
        bowling.add(firstFrame);

    }

    public Frame getAFrame(int index) {
        return bowling.get(index);
    }

    public void setBowling(Frame newFrame) {
        bowling.add(newFrame);
    }

}
