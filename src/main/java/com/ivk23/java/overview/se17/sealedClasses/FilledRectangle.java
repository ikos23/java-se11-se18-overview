package com.ivk23.java.overview.se17.sealedClasses;

/**
 * Rules:
 * - must directly extend the sealed class;
 * - mush be either `final` or `sealed` or `non-sealed`;
 */
public final class FilledRectangle extends Rectangle {
    private String color;

    public FilledRectangle(int a, int b, String color) {
        super(a, b);
        this.color = color;
    }

    @Override
    public String toString() {
        return "I am Rectangle. My color is " + color + " and sides are: a=" + a + ", b=" + b + " .";
    }
}
