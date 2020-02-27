{Tests a nested for loop in a procedure and scope}
{Output: 'The value of a is : 40.0'}

program TestNestedForLoop;

var

a : real = 1;

procedure nest(a : real);
var

begin

    for i := 0 to 1 do
    begin

        for j := 0 to 5 do
        begin
            a := a + 1;
        end;

        a := a * 2;

    end;

end;

begin

    nest(a);
    writeln('The value of a is : ', a);

end.