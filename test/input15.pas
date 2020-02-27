{This program tests a continue statement in a while loop}
{output: "The value of a is }

program TestContinue;

var

a : real = 0;
b : boolean = true;

begin

while(a < 5) do
begin
    if(b) then
        a := a + 1;
        b := not b;
    else
        continue;
end;

writeln('The value of a is: ', a);

end.