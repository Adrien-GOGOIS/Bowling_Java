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

        int firstRoll = 9;
        int secondRoll = 0;
        Frame ninePointsFrame = new Frame(firstRoll, secondRoll);

        BowlingGame party = new BowlingGame();

        party.add(ninePointsFrame);
        party.add(ninePointsFrame);
        party.add(ninePointsFrame);
        party.add(ninePointsFrame);
        party.add(ninePointsFrame);
        party.add(ninePointsFrame);
        party.add(ninePointsFrame);
        party.add(ninePointsFrame);
        party.add(ninePointsFrame);
        party.add(ninePointsFrame);

        int actual = party.score(party.getFrame());

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
        Frame secondFrame = new Frame(5, 5);

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

        BowlingGame party = new BowlingGame();

        party.add(firstFrame);
        party.add(secondFrame);
        party.add(thirdFrame);
        party.add(fourthFrame);
        party.add(fifthFrame);
        party.add(sixthFrame);
        party.add(seventhFrame);
        party.add(eighthFrame);
        party.add(ninthFrame);
        party.add(tenthFrame);

        int actual = party.score(party.getFrame());

        assertThat(actual).isEqualTo(20);
    }

    @Test
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

        int actual = party.score(party.getFrame());

        assertThat(actual).isEqualTo(150);
    }

    @Test
    void final_score_should_be_300_points_when_perfect_score() {

        Frame strikeFrame = new Frame (10, 0);

        BowlingGame party = new BowlingGame();
        party.add(strikeFrame);
        party.add(strikeFrame);
        party.add(strikeFrame);
        party.add(strikeFrame);
        party.add(strikeFrame);
        party.add(strikeFrame);
        party.add(strikeFrame);
        party.add(strikeFrame);
        party.add(strikeFrame);
        party.add(strikeFrame);
        party.add(strikeFrame);
        party.add(strikeFrame);

        int actual = party.score(party.getFrame());

        assertThat(actual).isEqualTo(300);
    }


}
