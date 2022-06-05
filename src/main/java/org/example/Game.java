package org.example;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static List<Frame> bowling = new ArrayList<>();
    public void play(char firstTry, char secondTry) {

        Frame frame = new Frame(new Try(firstTry), new Try(secondTry));
        bowling.add(frame);

    }
    public void strike() {
        Frame frame = new Frame(new Try('X'));
        bowling.add(frame);
    }

    public Frame getAFrame(int index) {
        return bowling.get(index);
    }

}
