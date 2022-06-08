package org.example;

import java.util.ArrayList;
import java.util.List;

public class Strike implements Frame {
    final public List<Try> strikeFrame = new ArrayList<>();
    int result = 10;

    public Strike(Try strike) {
        super();
        strikeFrame.add(strike);
    }

    @Override
    public int getResult() {
        return result;
    }

}
