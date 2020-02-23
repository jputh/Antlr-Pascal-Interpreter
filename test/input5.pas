{This program tests if-then-else statements. The variable c should equal 2 and the variable d should equal 1}
{Output: 'c = 2.0 and b = 1.0'}

program myProgram;

var
a : boolean = true;
b : boolean = false;
c : real = 10;
d : real = 100;

begin

if a then
    c := 20;

if(a and b) then
begin
    c := 20;
    d := d / 5;
end
else
begin
    c := 2;
    d := d / 100;
end;

writeln('c = ', c, ' and d = ', d);
end.