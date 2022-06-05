package org.example;

import java.util.*;

public class Frame {
    final public List<Try> playerFrame = new ArrayList<>();

    public Frame(Try firstTry, Try secondTry) {
        playerFrame.add(firstTry);
        playerFrame.add(secondTry);
    }

}
