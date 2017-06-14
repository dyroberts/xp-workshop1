package io.pivotal.rps;

public class RPS {
    public static Results play(Throw p1Throws, Throw p2Throws) {
        if (p1Throws.equals(p2Throws)){
            return Results.TIE;
        }
        return Results.P1;
    }
}