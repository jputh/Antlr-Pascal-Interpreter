{This tests the scope of a for loop. The value of b is 20 in the global scope}
{and in the for loop, the variable c is initialized to 5 and added to it.}
{The variable c only exists in the loop, and once the loop is exited, b is}
{multiplied by 100}

{output: 'The value of b is: 500'}
program TestForLoopScope;

var 
a : real;
b : real = 20;

begin

for a := 0 to 5 do
begin
    c : real = 5;
    b := b + c;
end;

b := b*10;

writeln('The value of b is: ', b);

end.