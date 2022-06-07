package org.example;

import java.util.ArrayList;
import java.util.List;

public class Hole extends Frame {

    String result;
    final public List<Try> holeFrame = new ArrayList<>();

    public Hole(Try firstTry, Try secondTry) {
        super();

        holeFrame.add(firstTry);
        holeFrame.add(secondTry);

        int try1 = Character.getNumericValue(firstTry.getTry());
        int try2 = Character.getNumericValue(secondTry.getTry());

        result = Integer.toString(try1 + try2);
    }

    @Override
    public String getResult() {
        return result;
    }

}
