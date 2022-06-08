package org.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class FrameTest {

    @Test
    void should_score_2_points() {
        Frame twoPointsFrame = new Frame(1, 1);

        assertThat(twoPointsFrame.score()).isEqualTo(2);
    }

    @Test
    void should_score_4_points() {
        Frame twoPointsFrame = new Frame(2, 2);

        assertThat(twoPointsFrame.score()).isEqualTo(4);
    }
}
