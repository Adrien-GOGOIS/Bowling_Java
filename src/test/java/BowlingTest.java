import org.assertj.core.api.Assertions;
import org.example.Frame;
import org.example.Try;
import org.testng.annotations.Test;

public class BowlingTest {

    Try firstTry = new Try('9');
    Try secondTry = new Try('-');
    Try thirdTry = new Try('X');

    Frame firstFrame = new Frame(firstTry, secondTry);
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
}
