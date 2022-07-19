package com.ivk23.java.overview.se16;

import java.util.Objects;

public record Rectangle(double length, double width) {}


// Basically our record is equivalent to the following normal class:
final class Rectangle1 {
    private final double length;
    private final double width;

    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double length() {
        return this.length;
    }

    double width() {
        return this.width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle1 that = (Rectangle1) o;
        return Double.compare(that.length, length) == 0 && Double.compare(that.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }

    @Override
    public String toString() {
        return "Rectangle1{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}