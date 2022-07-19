package com.ivk23.java.overview.se16;

public class JavaSE16 {

    public static void main(String[] args) {
        // ==============================================================
        // Record Classes (JEP 395: Records)
        // ==============================================================

        Rectangle r1 = new Rectangle(2, 3);
        // public accessor methods
        r1.length();
        r1.width();
        System.out.println(r1);

        boolean areEq = new Rectangle(2, 3).equals(r1);
        System.out.println("Are equal ? " + areEq);

        // you can even have Local Record Classes
        record Square(int side) {
            // The Canonical Constructor of a Record Class
            Square(int side) {
                if (side < 0) throw new IllegalArgumentException("Must be positive.");
                this.side = side;
            }
        }

        System.out.println(new Square(12));


        // ==============================================================
        // Pattern Matching for instanceof (FINALLY xD)
        // (JEP 394: Pattern Matching for instanceof)
        // ==============================================================
        printShapeNewWay(new Triangle());

    }

    public static void printShape(Shape shape) {
        if (shape instanceof Triangle) {
            ((Triangle) shape).perimeter(); // x_x
        }

        if (shape instanceof Circle) {
            ((Circle) shape).radius(); // x_x
        }
    }

    public static void printShapeNewWay(Shape shape) {
        if (shape instanceof Triangle tr) {
            tr.perimeter();
        }

        if (shape instanceof Circle cr) {
            cr.radius();
        }
    }

    interface Shape {
    }

    static class Triangle implements Shape {

        public void perimeter() {
            System.out.println("I am Triangle with perimeter 9.");
        }
    }

    static class Circle implements Shape {
        public void radius() {
            System.out.println("I am Circle with radius 7.");
        }
    }

}
