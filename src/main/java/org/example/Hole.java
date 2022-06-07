package org.example;

import java.util.ArrayList;
import java.util.List;

public class Hole extends Frame {

    int result;
    final public List<Try> holeFrame = new ArrayList<>();

    public Hole(Try firstTry, Try secondTry) {
        super();

        holeFrame.add(firstTry);
        holeFrame.add(secondTry);

        int try1 = Character.getNumericValue(firstTry.getTry());
        int try2 = Character.getNumericValue(secondTry.getTry());

        result = try1 + try2;
    }

    @Override
    public int getResult() {
        return result;
    }

}
