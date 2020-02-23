{Tests the precedence of operators.}
{Output: 'The value of b is true'}

program TestPrecedence;

var
a : boolean = false;
b : boolean;

begin

b := a or (4/2+9 = 10 or (true and 13 = 10 + 3));

writeln('The value of b is ', b);

end.