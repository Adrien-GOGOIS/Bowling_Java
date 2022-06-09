package org.example;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class BowlingGameTest {
    Game g = new Game();

    @Test
    public void testGutterGame() throws Exception {

        int n = 20;
        int pins = 0;
        for (int i = 0; i < n; i++) {
            g.roll(pins);
        }
        Assertions.assertThat(g.score()).isEqualTo(0);

    }

    @Test
    public void testAllOnes() throws Exception {

        for (int i = 0; i < 20; i++) {
            g.roll(1);
        }
        Assertions.assertThat(g.score()).isEqualTo(20);

    }

}
