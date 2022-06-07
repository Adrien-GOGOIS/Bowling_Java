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

        char firstTry = playerFrame.get(0).getTry();

        String result = "";

        if (playerFrame.size() <= 1 && firstTry == 'X') {
            result = "STRIKE";
        } else if (playerFrame.size() == 2 && playerFrame.get(1).getTry() == '-') {
            result = "SPARE";
        } else if (playerFrame.size() == 2 && playerFrame.get(1).getTry() != '-') {
            int try1 = Character.getNumericValue(playerFrame.get(0).getTry());
            int try2 = Character.getNumericValue(playerFrame.get(1).getTry());
            int intResult = try1 + try2;

            result = Integer.toString(intResult);
        }

        return result;
    }

}
