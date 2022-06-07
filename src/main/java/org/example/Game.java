package org.example;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static List<Frame> bowling = new ArrayList<>();
    public void play(char... tries) {

        if (tries.length == 1) {
            Frame strike = new Strike(new Try(tries[0]));
            bowling.add(strike);
        } else if (tries[1] == '-') {
            Frame spare = new Spare(new Try(tries[1]));
            bowling.add(spare);
        } else {
            Frame hole = new Hole(new Try(tries[0]), new Try(tries[1]));
            bowling.add(hole);
        }

    }

    public Frame getAFrame(int index) {
        return bowling.get(index);
    }

    public int finalResult() {
        int finalResult = 0;
        for (int index = 0; index < bowling.size(); index++) {
            if (getAFrame(index) instanceof Strike) {
                finalResult += 10
                    + getAFrame(index+1).getResult()
                    + getAFrame(index+2).getResult();
            } else if (getAFrame(index) instanceof Spare) {
                finalResult += 10
                    + getAFrame(index+1).getResult();
            } else {
                finalResult += getAFrame(index).getResult();
            }
        }

        return finalResult;
    }

}
