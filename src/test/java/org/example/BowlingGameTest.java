package org.example;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class BowlingGameTest {
    Game g = new Game();

    @Test
    public void testGutterGame() throws Exception {
        int n = 20;
        int pins = 0;
        rollMany(20, 0);
        Assertions.assertThat(g.score()).isEqualTo(0);

    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++)
            g.roll(pins);
    }

    @Test
    public void testAllOnes() throws Exception {
        rollMany(20, 1);
        Assertions.assertThat(g.score()).isEqualTo(20);

    }

}
