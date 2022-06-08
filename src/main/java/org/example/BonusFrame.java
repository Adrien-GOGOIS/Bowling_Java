package org.example;

import java.util.ArrayList;
import java.util.List;

public class BonusFrame implements Frame{

    Try bonusTry;

    int result;
    final public List<Try> bonusFrame = new ArrayList<>();

    public BonusFrame(Try bonusTry) {
        super();
        this.bonusTry = bonusTry;
        bonusFrame.add(bonusTry);
    }

    @Override
    public int getResult() {
        if (bonusTry.getTry() == 'X') {
            result = 10;
        } else {
            result = Character.getNumericValue(bonusTry.getTry());
        }
        return result;
    }
}
