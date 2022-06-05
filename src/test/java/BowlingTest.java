import org.assertj.core.api.Assertions;
import org.example.Frame;
import org.example.Try;
import org.testng.annotations.Test;

public class BowlingTest {

    @Test
    void should_read_tries_in_a_frame() {
        Try firstTry = new Try('9');
        Try secondTry = new Try('-');

        Frame firstFrame = new Frame(firstTry, secondTry);

        Assertions.assertThat(firstFrame.playerFrame.get(0).getTry()).isEqualTo('9');
        Assertions.assertThat(firstFrame.playerFrame.get(1).getTry()).isEqualTo('-');

    }
}
