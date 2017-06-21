package io.pivotal.rps;

import static io.pivotal.rps.RpsKata.Result.P1;
import static io.pivotal.rps.RpsKata.Result.TIE;

public class RpsKata {

    public static Result play(Throw p1Throws, Throw p2Throws) {
        if (p1Throws == p2Throws) {
            return TIE;
        }
        return P1;
    }

    public enum Result {
        P1,
        TIE
    }

    public enum Throw {
        ROCK,
        SCISSORS
    }
}
