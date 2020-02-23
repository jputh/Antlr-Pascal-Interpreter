{This tests the readln and writeln functions.}
{Output: 'The value of x is **YOUR INPUT** !!!'}

program TestReadWrite;

var
x : real;
y : real;

begin

writeln('What would you like the value of x to be?: ');
readln(x);

writeln('The value of x is ', x, '!!!');

end.