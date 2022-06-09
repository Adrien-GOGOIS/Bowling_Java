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


    public int frameScore(int frameNumber) {
        Frame frame = frames.get(frameNumber);
        int nextFrame = frameNumber+1;

        if (frame.isSpare()) {
            return 10 + frames.get(nextFrame).firstRoll;
        }

        if (frame.isStrike()) {
            if (frameNumber >= 10) {
                return 0;
            }
            if (frames.get(nextFrame).isStrike()) {
                return 10 + frames.get(nextFrame).score() + frames.get(nextFrame+1).firstRoll;
            }
            return 10 + frames.get(nextFrame).score();
        }

        if (frameNumber == 10 && frames.get(9).isSpare()) {
            return 0;
        }

        return frame.score();
    }
}
