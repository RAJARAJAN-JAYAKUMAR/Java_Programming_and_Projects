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
        //im putting new version of switch statement in this class
        newversion obj1 = new newversion();
        obj1.display();
        newversion2 obj2 = new newversion2();
        obj2.display();
        newversion3 obj3 = new newversion3();
        obj3.display();


    }
}

// Updated Version of switch statement
//below here is the new syntax for the switch statement
class newversion{
    void display(){
    String day = "Sunday";
    switch(day)
    {
        case "Saturday", "Sunday" -> System.out.println("6am");

        case "Monday" -> System.out.println("8am");
        default -> System.out.println("nope");
    }
    }
}
class newversion2{
    void display(){
        String day = "Monday";
        String result = "";
        switch(day)
        {
            case "Monday", "Tuesday" -> result = "6 am";
            case "Saturday" -> result = "7am";
        }
        System.out.println(result);
    }
}

class newversion3{
    void display(){
        String day = "Wednesday";
        String result ="";
        result = switch(day)
        {
            case "Monday", "Tuesday" -> "6 am";
            case "Saturday" -> "7am";
            default -> "2 am";
        };
        System.out.println(result);
    }
}