To run my code, just use the grun test rig:
    antlr4 Grammar.g4
    javac Grammar*.java
    grun Grammar start -gui test/INSERT_TEST_HERE



Each test has a comment at the top specifying what it does.



Assumptions:
To be honest I can't think of all of them at the moment BUT these are the ones that come to mind
- You can't use apostrophe's in writln statements
- an if-then-else block with single line statements ends with 'end;' after the statement in the else block
- an if-then-else block with multiple lines uses 'begin' and 'end' keywords to indicate the beginning and end of each block