package com.ivk23.java.overview.se11;

import java.util.function.BiFunction;

public class JavaSE11 {

    public static void main(String[] args) {
        // ==============================================================
        // Local Variable Type Inference (improvements)
        // JEP 286: Local-Variable Type Inference
        // JEP 323: Local-Variable Syntax for Lambda Parameters
        // ==============================================================

        // we had this
        BiFunction<Integer, Integer, Integer> l1 = (Integer a, Integer b) -> a + b;

        // now it is also possible
        // we've been told this is useful because you can add let's say annotations to these params
        BiFunction<Integer, Integer, Integer> l2 = (var a, var b) -> a + b;
    }

}
