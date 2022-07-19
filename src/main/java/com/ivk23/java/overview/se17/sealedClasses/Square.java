package com.ivk23.java.overview.se17.sealedClasses;

/**
 * Rules:
 * - must directly extend the sealed class;
 * - mush be either `final` or `sealed` or `non-sealed`;
 */
public non-sealed class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "I am Square. a=" + side + " .";
    }
}
