{This tests a while loop. Should print out 0.0 through 9.0}
program TestWhileLoop;

var 
a : real = 0;

begin

while(a < 10) do
begin
    writeln(a);
    a := a + 1;
end;

end.