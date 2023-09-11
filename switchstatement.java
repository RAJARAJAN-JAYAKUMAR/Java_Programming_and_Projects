/* 
syntax for switch statement

switch(expression){    
case value1:    
 //code to be executed;    
 break;  //optional  
case value2:    
 //code to be executed;    
 break;  //optional  
......    
    
default:     
  code to be executed if all cases are not matched;  
}    

Conditions:

-There can be one or N number of case values for a switch expression.
-The case value must be of switch expression type only. The case value must be literal or constant. It doesn't allow variables.
-The case values must be unique. In case of duplicate value, it renders compile-time error.
-The Java switch expression must be of byte, short, int, long (with its Wrapper type), enums and string.
-Each case statement can have a break statement which is optional. When control reaches to the break statement, it jumps the control after the switch expression. If a break statement is not found, it executes the next case.
-The case value can have a default label which is optional.
*/

class switchstatement{
    public static void main(String[] args) {
        int month = 1;
        String monthname = "";
        switch (month) {
            case 1:
                System.out.println(monthname = "january");
            break;
            case 2:
                System.out.println(monthname = "February");
                
            break;
        
            default:
                System.out.print("nothing");
                System.out.print("nothing");
            break;
        }
    }
}