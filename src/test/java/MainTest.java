import org.assertj.core.api.Assertions;
import org.example.Game;
import org.junit.jupiter.api.Test;

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

    /*@Test
    void should_get_score_of_a_frame_in_the_game() {
        bowling.play('X');
        bowling.play('6', '1');
        Assertions.assertThat(bowling.getAFrame(0).getResult()).isEqualTo("STRIKE");
        Assertions.assertThat(bowling.getAFrame(1).getResult()).isEqualTo("7");
    }*/


    @Test
    void should_calculate_final_result_with_many_strike() {
        bowling.play('X');
        bowling.play('X');
        bowling.play('X');
        bowling.play('X');
        bowling.play('X');
        bowling.play('X');
        bowling.play('X');
        bowling.play('X');
        bowling.play('9', '0');
        bowling.play('8', '1');
        Assertions
            .assertThat(bowling.finalResult())
            .isEqualTo(30 + 30 + 30 + 30 + 30 + 30 + 29 + 28 + 9 + 9);
    }

    @Test
    void should_calculate_almost_perfect_score() {
        bowling.play('X');
        bowling.play('X');
        bowling.play('X');
        bowling.play('X');
        bowling.play('X');
        bowling.play('X');
        bowling.play('X');
        bowling.play('X');
        bowling.play('X');
        bowling.play('X');
        bowling.play('X');
        bowling.play('9');
        Assertions
            .assertThat(bowling.finalResult())
            .isEqualTo(299);
    }

    @Test
    void should_calculate_another_final_result_with_final_spare() {
        bowling.play('5', '-');
        bowling.play('4', '-');
        bowling.play('5', '3');
        bowling.play('9', '-');
        bowling.play('2', '7');
        bowling.play('X');
        bowling.play('5', '0');
        bowling.play('5', '2');
        bowling.play('8', '1');
        bowling.play('5', '-');
        bowling.play('4');
        Assertions
            .assertThat(bowling.finalResult())
            .isEqualTo(10 + 10 + 10 + 8 + 8 + 10 + 9 + 9 + 10 + 5 + 7 + 5 + 7 + 9 + 10 + 4);
    }

}
