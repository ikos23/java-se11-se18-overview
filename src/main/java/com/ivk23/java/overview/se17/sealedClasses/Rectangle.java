package com.ivk23.java.overview.se17.sealedClasses;

/**
 * Rules:
 * - must directly extend the sealed class;
 * - mush be either `final` or `sealed` or `non-sealed`;
 */
public sealed class Rectangle extends Shape permits FilledRectangle {
    protected int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "I am Rectangle. My sides are: a=" + a + ", b=" + b + " .";
    }
}
