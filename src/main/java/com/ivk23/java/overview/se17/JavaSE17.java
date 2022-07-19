package com.ivk23.java.overview.se17;

import com.ivk23.java.overview.se17.sealedClasses.Circle;
import com.ivk23.java.overview.se17.sealedClasses.FilledRectangle;
import com.ivk23.java.overview.se17.sealedClasses.Rectangle;
import com.ivk23.java.overview.se17.sealedClasses.Shape;
import com.ivk23.java.overview.se17.sealedClasses.Square;
import com.ivk23.java.overview.se17.sealedClasses.interfaces.PlusExpr;

public class JavaSE17 {

    public static void main(String[] args) {

        // ==============================================================
        //  Sealed Classes JEP 409: Sealed Classes
        // ==============================================================
        Shape shape = new Shape(); // well, it's not abstract, so why not

        Circle circle = new Circle(2);
        System.out.println(circle);

        Square square = new Square(3);
        System.out.println(square);

        Rectangle rectangle = new Rectangle(2, 3);
        System.out.println(rectangle);

        FilledRectangle greenRectangle = new FilledRectangle(2, 3, "green");
        System.out.println(greenRectangle);

        // More examples
        Shape s2 = new Circle(4);
        var r3 = new Square(5);

        // :D
        new PlusExpr() {}.eval();

        // Pattern Matching for switch Expressions and Statements (JEP 406: Pattern Matching for switch (Preview))
        // IS PREVIEW, so we do not discuss it here !!!!!

    }

}
