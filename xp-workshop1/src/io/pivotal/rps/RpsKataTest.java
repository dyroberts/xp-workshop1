package io.pivotal.rps;

import org.junit.Test;

import static io.pivotal.rps.RpsKata.Result.P1;
import static io.pivotal.rps.RpsKata.Result.TIE;
import static io.pivotal.rps.RpsKata.Throw.ROCK;
import static io.pivotal.rps.RpsKata.Throw.SCISSORS;
import static org.junit.Assert.assertEquals;

public class RpsKataTest {

    @Test
    public void whenP1ThrowsRockAndP2ThrowsScissors_P1ShouldWin() {
        assertEquals(P1, RpsKata.play(ROCK, SCISSORS));
    }

    @Test
    public void whenP1ThrowsRockAndP2ThrowsRock_ItShouldBeATie() {
        assertEquals(TIE, RpsKata.play(ROCK, ROCK));
    }
}
