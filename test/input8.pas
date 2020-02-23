{This tests all special functions, including Sin, Cos, Exp, Ln, and Sqrt}
{a is equal to 1.0, sinPI is equal to 0.0, and cosPI is equal to -1.0}

program TestSpecialFunctions;

var 
a : real = 4;
cosPI : real = 180;
sinPI : real = 180;

begin

a := Sqrt(a);
a := Ln(a-1);
a := Exp(a);

cosPI := Cos(cosPI);
sinPI := Sin(sinPI);

if(sinPI < 0.00000005) then
    sinPI := 0.0;

writeln('a is equal to ', a, ', sinPI is equal to ', sinPI, ', and cosPI is equal to ', cosPI);

end.