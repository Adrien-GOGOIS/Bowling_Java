package org.example;

import java.util.*;

public class Frame {
    final public List<Try> playerFrame = new ArrayList<>();
    public Frame(Try firstTry) {
        playerFrame.add(firstTry);
    }

    public Frame(Try firstTry, Try secondTry) {
        playerFrame.add(firstTry);
        playerFrame.add(secondTry);
    }

    String result = "";

    public String frameResult() {

        char firstTry = playerFrame.get(0).getTry();

        if (playerFrame.size() <= 1 && firstTry == 'X') {
            return result = "STRIKE";
        } else if (playerFrame.size() == 2 && playerFrame.get(1).getTry() == '-') {
            return result = "SPARE";
        }

        return result;
    }

}
