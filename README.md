# README

Project by: Jason Puthusseril

Date: 2-28-2020

## How to run the code

To run the tests in the 'test' folder, do:

for all tests input0.pas to input18.pas,
```bash
java Main test/input#.pas
```

To recompile the code, do:
```bash
antlr4 Grammar.g4 -visitor
javac Main.java Grammar*.java InterpretVisitor.java
```

## Features

The following features have been implemented, along with all features from Project 1:

1. while-do and for-do loops 
    * see input10.pas and input11.pas
    * for nested loops, see input18.pas
2. break and continue keywords
    * see input15.pas and input16.pas
3. user-defined functions and procedures
    * see input14.pas and input18.pas
    * for recursion, see input17.pas
4. static scoping
    * see input12.pas and input13.pas (and any test involving functions/procedures)

## Bonuses

I also attempted the second bonus, formal parameters passing with proper scoping
* see input14.pas, input17.pas, and input18.pas, which all use formal parameter passing

## Assumptions

* All loops use begin and end to create a block
* for loop declares a variable to begin iteration
* for loops only work with integers in pascal, but I implemented it so it works with reals
* allowed variable declarations in loops to show that scope changes
* Functions must have the function body defined below them. In Pascal, you can declare a function and define it in another file, but I implemented it such that the function body must be defined after the declaration line for simplicity.
* case statements can only have booleans passed in
* case statements can only have a statement after each case. It can’t execute more than one line of code per case.

