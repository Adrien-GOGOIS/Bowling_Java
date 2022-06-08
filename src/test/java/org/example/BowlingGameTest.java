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
        party.add(ninePointsFrame);

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
        Frame secondFrame = new Frame(5, 0);

        BowlingGame party = new BowlingGame();
        party.add(spareFrame);
        party.add(secondFrame);

        int actual = party.frameScore(0);

        assertThat(actual).isEqualTo(15);
    }

    @Test
    void frame_score_should_be_20_points_when_strike_and_5_points_next_roll() {

        Frame strikeFrame = new Frame(10, 0);
        Frame secondFrame = new Frame(5, 0);

        BowlingGame party = new BowlingGame();
        party.add(strikeFrame);
        party.add(secondFrame);

        int actual = party.frameScore(0);

        assertThat(actual).isEqualTo(20);
    }

    @Test
    void frame_score_should_be_30_points_when_strike_and_2_strike_next_rolls() {

        Frame firstFrame = new Frame(10, 0);
        Frame secondFrame = new Frame(10, 0);
        Frame thirdFrame = new Frame (10, 0);

        BowlingGame party = new BowlingGame();
        party.add(firstFrame);
        party.add(secondFrame);
        party.add(thirdFrame);

        int actual = party.frameScore(0);

        assertThat(actual).isEqualTo(30);
    }

    @Test
    void final_score_should_be_20_points_when_10_frames_of_2_points() {

        LinkedList<Frame> frames = new LinkedList<>();

        Frame firstFrame = new Frame(2, 0);
        Frame secondFrame = new Frame(2, 0);
        Frame thirdFrame = new Frame (2, 0);
        Frame fourthFrame = new Frame (2, 0);
        Frame fifthFrame = new Frame (2, 0);
        Frame sixthFrame = new Frame (2, 0);
        Frame seventhFrame = new Frame (2, 0);
        Frame eighthFrame = new Frame (2, 0);
        Frame ninthFrame = new Frame (2, 0);
        Frame tenthFrame = new Frame (2, 0);

        frames.add(firstFrame);
        frames.add(secondFrame);
        frames.add(thirdFrame);
        frames.add(fourthFrame);
        frames.add(fifthFrame);
        frames.add(sixthFrame);
        frames.add(seventhFrame);
        frames.add(eighthFrame);
        frames.add(ninthFrame);
        frames.add(tenthFrame);

        int actual = BowlingGame.score(frames);

        assertThat(actual).isEqualTo(20);
    }

    /*@Test
    void final_score_should_be_150_points_when_only_spare_and_final_roll_of_5_points() {

        Frame spareFrame = new Frame (5, 5);
        Frame secondFrame = new Frame (5, 5);
        Frame thirdFrame = new Frame (5, 5);
        Frame fourthFrame = new Frame (5, 5);
        Frame fifthFrame = new Frame (5, 5);
        Frame sixthFrame = new Frame (5, 5);
        Frame seventhFrame = new Frame (5, 5);
        Frame eighthFrame = new Frame (5, 5);
        Frame ninthFrame = new Frame (5, 5);
        Frame tenthFrame = new Frame (5, 5);
        Frame eleventhFrame = new Frame (5, 0);

        BowlingGame party = new BowlingGame();
        party.add(spareFrame);
        party.add(secondFrame);
        party.add(thirdFrame);
        party.add(fourthFrame);
        party.add(fifthFrame);
        party.add(sixthFrame);
        party.add(seventhFrame);
        party.add(eighthFrame);
        party.add(ninthFrame);
        party.add(tenthFrame);
        party.add(eleventhFrame);

        int actual = 0;
        for (int i = 0; i < party.getFrames().size(); i++) {
            actual += party.frameScore(i);
        }

        assertThat(actual).isEqualTo(150);
    }*/




}
