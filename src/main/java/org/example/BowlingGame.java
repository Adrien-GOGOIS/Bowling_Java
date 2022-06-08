package org.example;


import java.util.ArrayList;
import java.util.List;

public class BowlingGame {

    private final List<Frame> frames = new ArrayList<>();

    public static int score(List<Frame> frames) {
        return frames.stream().map(Frame::score).reduce(0, Integer::sum);
    }

    public void play(Frame frame) {
        this.frames.add(frame);
    }

    public int frameScore(int i) {
        Frame frame = frames.get(i);

        if (frame.isSpare()) {
            return 10 + frames.get(i+1).firstRoll;
        }

        return frame.score();
    }

}
