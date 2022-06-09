package org.example;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class BowlingGameTest {
    Game g = new Game();

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++)
            g.roll(pins);
    }
    @Test
    public void testGutterGame() throws Exception {
        rollMany(20, 0);
        Assertions.assertThat(g.score()).isEqualTo(0);

    }

    @Test
    public void testAllOnes() throws Exception {
        rollMany(20, 1);
        Assertions.assertThat(g.score()).isEqualTo(20);

    }

    @Test
    public void testOneSpare() throws Exception {
        rollSpare(); // spare
        g.roll(3);
        rollMany(17,0);
        Assertions.assertThat(g.score()).isEqualTo(16);
    }

    private void rollSpare() {
        g.roll(5);
        g.roll(5);
    }

}
