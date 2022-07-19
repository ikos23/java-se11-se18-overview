package com.ivk23.java.overview.se17.sealedClasses;

/**
 * Rules:
 *  - must directly extend the sealed class;
 *  - mush be either `final` or `sealed` or `non-sealed`;
 *
 */
public final class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "I am Circle. R=" + radius + " .";
    }
}
