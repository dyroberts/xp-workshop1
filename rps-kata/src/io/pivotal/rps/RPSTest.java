package io.pivotal.rps;

import org.junit.Test;

import static io.pivotal.rps.Results.P1;
import static io.pivotal.rps.Results.TIE;
import static io.pivotal.rps.Throw.ROCK;
import static io.pivotal.rps.Throw.SCISSORS;
import static org.junit.Assert.assertEquals;

public class RPSTest {

    @Test
    public void whenP1ThrowsRockAndP2ThrowsScissors_P1ShouldWin() {
        assertEquals(P1, RPS.play(ROCK, SCISSORS));
    }

    @Test
    public void whenP1ThrowsScissorsAndP2ThrowsScissors_ShouldBeATie() {
        assertEquals(TIE, RPS.play(SCISSORS, SCISSORS));
    }

}
