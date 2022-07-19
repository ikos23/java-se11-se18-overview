package com.ivk23.java.overview.se15;

public class JavaSE15 {

    public static void main(String[] args) {
        // ==============================================================
        // Text Blocks (JEP 378: Text Blocks)
        // ==============================================================

        // Using a literal string
        String dqName = "Pat Q. Smith";

        // Using a text block
        String tbName = """
                Pat Q. Smith""";

        System.out.println(dqName.equals(tbName)); // TRUEc

        writeHTML();

        // https://docs.oracle.com/en/java/javase/15/text-blocks/index.html

    }

    static void writeHTML() {
        String html = """
                <html>
                    <body>
                        <p>Hello World.</p>
                    </body>
                </html>
                """;
        System.out.println(html);
    }

}
