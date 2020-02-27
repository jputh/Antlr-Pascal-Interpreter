{This program tests a break statement in a for loop. The following line should be printed 5 times with 'x' incrementing from 1 to 5}
{output: 'This loop has run x time(s)'}

program TestContinue;

var

a : real = 1;
b : boolean = true;

begin

for i:=1 to 10 do
begin
    if(a > 4) then
        break;
    else
        begin
            writeln('This loop has run ', a, ' time(s)');
            a := a + 1;
        end;
end;


end.