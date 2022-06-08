package org.example;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.LinkedList;
import org.junit.jupiter.api.Test;

public class BowlingGameTest {

    @Test
    void frame_score_should_be_9_points() {

        int firstRoll = 9;
        int secondRoll = 0;
        Frame ninePointsFrame = new Frame(firstRoll, secondRoll);

        BowlingGame party = new BowlingGame();
        party.play(ninePointsFrame);

        int actual = party.frameScore(0);

        assertThat(actual).isEqualTo(9);
    }

    @Test
    void game_score_should_be_90_points_on_10_frames_of_9_points() {

        LinkedList<Frame> frames = new LinkedList<>();
        int firstRoll = 9;
        int secondRoll = 0;
        Frame ninePointsFrame = new Frame(firstRoll, secondRoll);

        frames.add(ninePointsFrame);
        frames.add(ninePointsFrame);
        frames.add(ninePointsFrame);
        frames.add(ninePointsFrame);
        frames.add(ninePointsFrame);
        frames.add(ninePointsFrame);
        frames.add(ninePointsFrame);
        frames.add(ninePointsFrame);
        frames.add(ninePointsFrame);
        frames.add(ninePointsFrame);

        int actual = BowlingGame.score(frames);

        assertThat(actual).isEqualTo(90);
    }

    @Test
    void frame_score_should_be_15_points_when_spare_and_5_points_next_roll() {

        Frame spareFrame = new Frame(5, 5);
        Frame secondFrame = new Frame(5, 5);

        BowlingGame party = new BowlingGame();
        party.play(spareFrame);
        party.play(secondFrame);

        int actual = party.frameScore(0);

        assertThat(actual).isEqualTo(15);
    }

    @Test
    void frame_score_should_be_15_points_when_spare_and_5_points_next_roll() {

        Frame spareFrame = new Frame(5, 5);
        Frame secondFrame = new Frame(5, 5);

        BowlingGame party = new BowlingGame();
        party.play(spareFrame);
        party.play(secondFrame);

        int actual = party.frameScore(0);

        assertThat(actual).isEqualTo(15);
    }


}
