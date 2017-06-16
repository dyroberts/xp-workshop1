package io.pivotal.rpskata;

import static io.pivotal.rpskata.RPS.Result.TIE;
import static io.pivotal.rpskata.RPS.Throw.PAPER;
import static io.pivotal.rpskata.RPS.Throw.ROCK;

public class RPS {
    public static Result play(Throw p1Throw, Throw p2Throw) {
        if (p1Throw == p2Throw) {
            return TIE;
        }
        if (p1Throw == ROCK && p2Throw == PAPER) {
            return Result.P2;
        }
        return Result.P1;
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
