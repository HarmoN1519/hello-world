import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    private TicTacToe ticTacToe;

    @Test
    void isBoardFull() {
        ticTacToe = new TicTacToe();
        boolean isFull = ticTacToe.isBoardFull();
        assertThat(isFull).isFalse();
    }
}