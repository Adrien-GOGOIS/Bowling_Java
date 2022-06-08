package org.example;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public List<Frame> bowling = new ArrayList<>();

    public void play(char firstTry) {
        if (firstTry == 'X') {
            Frame strike = new Strike(new Try(firstTry));
            bowling.add(strike);
        } else {
            Frame bonusFrame = new BonusFrame(new Try(firstTry));
            bowling.add(bonusFrame);
        }
    }
    public void play(char firstTry, char secondTry) {

        if (secondTry == '-') {
            Frame spare = new Spare(new Try(secondTry));
            bowling.add(spare);
        } else {
            Frame hole = new Hole(new Try(firstTry), new Try(secondTry));
            bowling.add(hole);
        }

    }

    public Frame getAFrame(int index) {
        return bowling.get(index);
    }

    public int finalResult() {
        int finalResult = 0;

        for (int index = 0; index < bowling.size(); index++) {

            if (index >= 10) {
                break;

            } else {

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
        }

        return finalResult;
    }

}
