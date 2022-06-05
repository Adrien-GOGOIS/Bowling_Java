import org.assertj.core.api.Assertions;
import org.example.Frame;
import org.example.Game;
import org.example.Try;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

    Game myGame = new Game();
    Try firstTry = new Try('9');
    Try secondTry = new Try('-');
    Frame firstFrame = new Frame(firstTry, secondTry);

    Try thirdTry = new Try('X');
    Frame secondFrame = new Frame(thirdTry);

    @Test
    void should_read_tries_in_a_frame() {
        Assertions.assertThat(firstFrame.playerFrame.get(0).getTry()).isEqualTo('9');
        Assertions.assertThat(firstFrame.playerFrame.get(1).getTry()).isEqualTo('-');

    }
    @Test
    void should_get_a_spare_or_a_strike() {
       Assertions.assertThat(firstFrame.frameResult()).isEqualTo("SPARE");
       Assertions.assertThat(secondFrame.frameResult()).isEqualTo("STRIKE");
    }

    @Test
    void should_get_score_of_a_frame_in_the_game() {
        myGame.setBowling(firstFrame);
        myGame.setBowling(secondFrame);
        Assertions.assertThat(myGame.getAFrame(0).frameResult()).isEqualTo("SPARE");
        Assertions.assertThat(myGame.getAFrame(1).frameResult()).isEqualTo("STRIKE");
    }
}
