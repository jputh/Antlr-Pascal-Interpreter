{This program tests declaration and initialization of real types, as well as arithmetic expressions}
{Output: 'a = 73.0 and b = 83.0'}

program myProgram;

var
a : real;
b : real = 10;

begin

a := 70 + (5/2) * 4 - 7;
b := a + b;

writeln('a = ', a, ' and b = ', b);
end.
