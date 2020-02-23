{This is just a regular program. The output depends on your input!}

program GradingExample;

var

e1 : real;
e2 : real;
e3 : real;
e4 : real;


begin

writeln('Welcome to your Physics class! We are going to calculate some grades.');
writeln('What was your grade on exam 1?: ');
readln(e1);
writeln('What was your grade on exam 2?: ');
readln(e2);
writeln('What was your grade on exam 3?: ');
readln(e3);
writeln('');
writeln('This is the good news. We take the square root of each exam grade and multiply by 10 to determine your grade. Here are your new scores:');

e1 := Sqrt(e1) * 10;
e2 := Sqrt(e2) * 10;
e3 := Sqrt(e3) * 10;

writeln('Exam 1: ', e1);
writeln('');
writeln('Exam 2: ', e2);
writeln('');
writeln('Exam 3: ', e3);
writeln('');

e4 := 90 * 4 - e1 - e2 - e3;

writeln('If you get an ', e4, ' on Exam 4 you can get an A in this class!');


end.
