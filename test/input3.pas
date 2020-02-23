{This program tests boolean declaration and initialization, boolean operators, and logical operators}
{Output: 'a = 4.0 and b = true'}

program myProgram;

var
a : real;
b : boolean;
c : real = 3.0;
d : boolean = true;

begin

a := 1.0 + c;
b := d and ((10+7) = 17);


writeln('a = ', a, ' and b = ', b);

end.