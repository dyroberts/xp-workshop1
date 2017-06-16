package io.pivotal.rpskata;

import static io.pivotal.rpskata.RPS.Result.TIE;
import static io.pivotal.rpskata.RPS.Throw.PAPER;
import static io.pivotal.rpskata.RPS.Throw.ROCK;
import static io.pivotal.rpskata.RPS.Throw.SCISSORS;

public class RPS {

    public static Result play(Throw p1Throw, Throw p2Throw) {
        if (p1Throw == p2Throw) {
            return TIE;
        }
        if (p1Throw == ROCK && p2Throw == PAPER ||
                p1Throw == SCISSORS && p2Throw == ROCK ||
                p1Throw == PAPER && p2Throw == SCISSORS) {
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
