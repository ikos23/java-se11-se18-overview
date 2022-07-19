package com.ivk23.java.overview.se17.sealedClasses.interfaces;

/**
 * Like sealed classes, to seal an interface, add the sealed modifier to its declaration.
 * Then, after any extends clause, add the permits clause, which specifies the classes
 * that can implement the sealed interface and the interfaces that can extend the sealed interface.
 */
sealed interface Expr permits PlusExpr {
    public int eval();
}
