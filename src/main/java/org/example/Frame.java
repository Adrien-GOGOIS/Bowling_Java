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

    public String frameResult() {

        String result = "";

        if (playerFrame.size() <= 1) {
            result = "STRIKE";
        } else if (playerFrame.get(1).getTry() == '-') {
            result = "SPARE";
        } else if (playerFrame.get(1).getTry() != '-') {
            int firstTry = Character.getNumericValue(playerFrame.get(0).getTry());
            int secondTry = Character.getNumericValue(playerFrame.get(1).getTry());

            result = Integer.toString(firstTry + secondTry);
        }

        return result;
    }

}
