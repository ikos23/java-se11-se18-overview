package com.ivk23.java.overview.se17.sealedClasses.interfaces;

public non-sealed interface PlusExpr extends Expr {

    @Override
    default int eval() {
        System.out.println("PlusExpr.eval");
        return 0;
    }

}
