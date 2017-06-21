package io.pivotal.rps;

import static io.pivotal.rps.RpsKata.Result.P1;
import static io.pivotal.rps.RpsKata.Result.P2;
import static io.pivotal.rps.RpsKata.Result.TIE;
import static io.pivotal.rps.RpsKata.Throw.PAPER;
import static io.pivotal.rps.RpsKata.Throw.ROCK;
import static io.pivotal.rps.RpsKata.Throw.SCISSORS;

public class RpsKata {

    public static Result play(Throw p1Throws, Throw p2Throws) {
        if (p1Throws == p2Throws) {
            return TIE;
        }
        if (p1Throws == ROCK && p2Throws == PAPER ||
                p1Throws == PAPER && p2Throws == SCISSORS ||
                p1Throws == SCISSORS && p2Throws == ROCK) {
            return P2;
        }
        return P1;
    }

    public enum Result {
        P1,
        P2,
        TIE
    }

    public enum Throw {
        ROCK,
        PAPER,
        SCISSORS
    }
}
