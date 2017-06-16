package io.pivotal.rpskata;

import org.junit.Test;

import static io.pivotal.rpskata.RPS.Result.P1;
import static io.pivotal.rpskata.RPS.Result.P2;
import static io.pivotal.rpskata.RPS.Result.TIE;
import static io.pivotal.rpskata.RPS.Throw.PAPER;
import static io.pivotal.rpskata.RPS.Throw.ROCK;
import static io.pivotal.rpskata.RPS.Throw.SCISSORS;
import static org.junit.Assert.assertEquals;

public class RPSTest {

    @Test
    public void whenP1ThrowsRockAndP2ThrowsScissors_P1ShouldWin() {
        assertEquals(P1, RPS.play(ROCK, SCISSORS));
    }

    @Test
    public void whenP1ThrowsRockAndP2ThrowsRock_ItShouldBeATie() {
        assertEquals(TIE, RPS.play(ROCK, ROCK));
    }

    @Test
    public void whenP1ThrowsRockAndP2ThrowsPaper_P2ShouldWIn() {
        assertEquals(P2, RPS.play(ROCK, PAPER));
    }

}
