package org.example;

import java.util.ArrayList;
import java.util.List;

public class Spare extends Frame {
    final public List<Try> spareFrame = new ArrayList<>();

    public Spare(Try spare) {
        super();
        spareFrame.add(spare);
    }

    @Override
    public int getResult() {
        return result = 10;
    }
}
