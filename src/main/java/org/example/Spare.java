package org.example;

import java.util.ArrayList;
import java.util.List;

public class Spare implements Frame {
    final public List<Try> spareFrame = new ArrayList<>();
    int result = 10;

    public Spare(Try spare) {
        super();
        spareFrame.add(spare);
    }

    @Override
    public int getResult() {
        return result;
    }
}
