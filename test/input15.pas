{This program tests a continue statement in a while loop}
{output: 'The value of c is 5.0'}

program TestContinue;

var

a : real = 0;
c : real = 0;
b : boolean = true;

begin

while(a < 10) do
begin
    if(b) then
    begin
        c := c + 1;
        b := not b;
    end;
    else
        b := not b;
        continue;

    a := a + 1;
end;

writeln('The value of c is: ', c);

end.