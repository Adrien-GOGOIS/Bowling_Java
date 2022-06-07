package org.example;

import java.util.ArrayList;
import java.util.List;

public class Strike extends Frame{
    final public List<Try> strikeFrame = new ArrayList<>();

    public Strike(Try strike) {
        super();
        strikeFrame.add(strike);
    }

    @Override
    public int getResult() {
        return result = 10;
    }

}
