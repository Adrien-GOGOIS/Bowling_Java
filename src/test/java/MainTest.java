import org.assertj.core.api.Assertions;
import org.example.Game;
import org.testng.annotations.Test;

public class MainTest {

    Game bowling = new Game();

   /* @Test
    void should_read_tries_in_a_frame() {
        Assertions.assertThat(firstFrame.playerFrame.get(0).getTry()).isEqualTo('9');
        Assertions.assertThat(firstFrame.playerFrame.get(1).getTry()).isEqualTo('-');

    }
    @Test
    void should_get_a_spare_or_a_strike() {
       Assertions.assertThat(firstFrame.frameResult()).isEqualTo("SPARE");
       Assertions.assertThat(secondFrame.frameResult()).isEqualTo("STRIKE");
    }*/

    @Test
    void should_get_score_of_a_frame_in_the_game() {
        bowling.play('9', '-');
        bowling.strike();
        Assertions.assertThat(bowling.getAFrame(0).frameResult()).isEqualTo("SPARE");
        Assertions.assertThat(bowling.getAFrame(1).frameResult()).isEqualTo("STRIKE");
    }
}
