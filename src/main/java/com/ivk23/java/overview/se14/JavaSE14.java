package com.ivk23.java.overview.se14;

public class JavaSE14 {

    public static void main(String[] args) {
        // ==============================================================
        // Switch Expressions (JEP 361: Switch Expressions (Standard))
        // ==============================================================

        // this is what we had for a long time
        int numLetters = 0;
        Day day = Day.WEDNESDAY;
        switch (day) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                numLetters = 6;
                break;
            case TUESDAY:
                numLetters = 7;
                break;
            // ........
        }

        // And now, like all expressions, switch expressions evaluate
        // to a single value and can be used in statements.
        Day day2 = Day.WEDNESDAY;
        System.out.println(
                switch (day2) {
                    case MONDAY, FRIDAY, SUNDAY -> 6;
                    case TUESDAY -> 7;
                    case THURSDAY, SATURDAY -> 8;
                    case WEDNESDAY -> 9;
                    default -> throw new IllegalStateException("Invalid day: " + day);
                }
        );

        // And this is like super cool !
        int numLetters2 = switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> {
                System.out.println(6);
                yield 6;
            }
            case TUESDAY -> {
                System.out.println(7);
                yield 7;
            }
            case THURSDAY, SATURDAY -> {
                System.out.println(8);
                yield 8;
            }
            case WEDNESDAY -> {
                System.out.println(9);
                yield 9;
            }
            default -> {
                throw new IllegalStateException("Invalid day: " + day);
            }
        };

    }

}

enum Day {
    SUNDAY, MONDAY, TUESDAY,
    WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}
