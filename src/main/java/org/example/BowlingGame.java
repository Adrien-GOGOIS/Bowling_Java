package org.example;


import java.util.ArrayList;
import java.util.List;

public class BowlingGame {

    private final List<Frame> frames = new ArrayList<>();

    private int totalScore;

    public int score(List<Frame> frames) {
        // return frames.stream().map(Frame::score).reduce(0, Integer::sum);
        for (int i = 0; i < frames.size(); i++) {
            totalScore += frameScore(i);
        }
        return totalScore;
    }

    public List<Frame> getFrame() {
        return frames;
    }

    public void add(Frame frame) {
        this.frames.add(frame);
    }


    public int frameScore(int i) {
        Frame frame = frames.get(i);

        if (frame.isSpare()) {
            return 10 + frames.get(i+1).firstRoll;
        }

        if (frame.isStrike()) {
            if (frames.get(i+1).firstRoll == 10) {
                return 10 + frames.get(i+1).score() + frames.get(i+2).firstRoll;
            }
            return 10 + frames.get(i+1).score();
        }

        return frame.score();
    }
}
