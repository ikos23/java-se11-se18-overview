package com.ivk23.java.overview.se17.sealedClasses;

/**
 * To seal a class, add the sealed modifier to its declaration.
 * Then, after any extends and implements clauses, add the `permits` clause.
 * This clause specifies the classes that may extend the sealed class.
 */
public sealed class Shape permits Circle, Rectangle, Square {
}
