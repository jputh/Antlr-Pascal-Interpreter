{This tests case statements with a single case, with one or multiple lines in the execution block. The variable x should equal 40 at the end of the program}
{Output: 'num = 200.0'}

program checkCase;
var
   passed: boolean;
   num: real = 10;
   
begin
   passed := true;
   
   case (passed) of
      true : num := num + 10;
    end;   
    
    passed := false;
    
    case (passed) of
      false : num := num * 10;         
    end; 

    writeln('num = ', num);
end.