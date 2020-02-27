{Tests a recursive function call and scope}
{Output: 'The factorial of 5 is : 120.0'}

program TestRecursionFactorial;

var

a : real;

function factorial(a : real) : real;
var

result : real;

begin

    if(a = 1) then
        result := 1;
    else
        result := a * factorial(a - 1);

    factorial := result;
end;

begin

    a := factorial(5);
    writeln('The factorial of 5 is : ', a);

end.