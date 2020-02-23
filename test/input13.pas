{Tests scopes in a while loop, as well as the use of if statements in a loop}
{output: 'She loves me', 'She loves me', 'She loves me not'}
program TestForLoopScope;

var 
a : real = 1;
b : real = 20;

begin

while(a < 4) do
begin
    c : boolean = b mod a = 0;
    if(c) then 
        writeln('She loves me');
    else 
        writeln('She loves me not');

    a := a + 1; 
    
end;


end.