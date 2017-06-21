package io.pivotal.rps;

import org.junit.Test;

import static io.pivotal.rps.RpsKata.Result.P1;
import static io.pivotal.rps.RpsKata.Result.P2;
import static io.pivotal.rps.RpsKata.Result.TIE;
import static io.pivotal.rps.RpsKata.Throw.PAPER;
import static io.pivotal.rps.RpsKata.Throw.ROCK;
import static io.pivotal.rps.RpsKata.Throw.SCISSORS;
import static org.junit.Assert.assertEquals;

public class RpsKataTest {

    @Test
    public void whenP1ThrowsRockAndP2ThrowsScissors_P1ShouldWin() {
        assertEquals(P1, RpsKata.play(ROCK, SCISSORS));
    }

    @Test
    public void whenP1ThrowsPaperAndP2ThrowsRock_P1ShouldWin() {
        assertEquals(P1, RpsKata.play(PAPER, ROCK));
    }

    @Test
    public void whenP1ThrowsScissorsAndP2ThrowsPaper_P1ShouldWin() {
        assertEquals(P1, RpsKata.play(SCISSORS, PAPER));
    }

    @Test
    public void whenP1ThrowsRockAndP2ThrowsRock_ItShouldBeATie() {
        assertEquals(TIE, RpsKata.play(ROCK, ROCK));
    }

    @Test
    public void whenP1ThrowsPaperAndP2ThrowsPaper_ItShouldBeATie() {
        assertEquals(TIE, RpsKata.play(PAPER, PAPER));
    }

    @Test
    public void whenP1ThrowsScissorsAndP2ThrowsScissors_ItShouldBeATie() {
        assertEquals(TIE, RpsKata.play(SCISSORS, SCISSORS));
    }

    @Test
    public void whenP1ThrowsRockAndP2ThrowsPaper_P2ShouldWin() {
        assertEquals(P2, RpsKata.play(ROCK, PAPER));
    }

    @Test
    public void whenP1ThrowsPaperAndP2ThrowsScissors_P2ShouldWin() {
        assertEquals(P2, RpsKata.play(PAPER, SCISSORS));
    }

    @Test
    public void whenP1ThrowsScissorsAndP2ThrowsRock_P2ShouldWin() {
        assertEquals(P2, RpsKata.play(SCISSORS, ROCK));
    }
}
