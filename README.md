# "New" Java Features Overview (from Java SE11 to Java SE18)

#### At the moment the latest released JDK is `18.0.1.1` (I used one from Oracle).

⚠️This tiny project is simply an overview of some new features (maybe not very new) that
came to us recently and `ARE PERMANENT` now (which means, there won't be any examples of something
that is still in preview or re-preview, blah, blah, blah.)

⚠️There are actually more features introduced in every release, aka new / improved GC, some new API,
some legacy stuff becomes `@Deprecated`, etc. I focused only on features which developers can kinda "touch"
in a daily work (I believe that 80-99% of the time you don't care what GC is being used by your app, but
some new lang feature you can probably use every day).

#### So, this is what we have.

 - Java SE 11 LTS (Local Variable Type Inference "enhancements")
   - [JEP 286: Local-Variable Type Inference](https://openjdk.org/jeps/286)
   - [JEP 323: Local-Variable Syntax for Lambda Parameters](https://openjdk.org/jeps/323)
 - Java SE 12 (no new permanent features)
 - Java SE 13 (no new permanent features)
 - Java SE 14 (Switch Expressions)
   - [JEP 361: Switch Expressions (Standard)](https://openjdk.org/jeps/361)
 - Java SE 15 (Text Blocks)
   - [JEP 378: Text Blocks](https://openjdk.org/jeps/378)
 - Java SE 16 (Record Classes & Pattern Matching for instanceof)
   - [JEP 395: Records](https://openjdk.org/jeps/395)
   - [JEP 394: Pattern Matching for instanceof](https://openjdk.org/jeps/394)
   - Java SE 17 LTS (Sealed Classes)
     - [JEP 409: Sealed Classes](https://openjdk.org/jeps/409)
 - Java SE 18 (no new permanent features)