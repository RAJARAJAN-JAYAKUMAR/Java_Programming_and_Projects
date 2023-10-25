package OOPS.java;

// //* object oriented programming language
// object - Behaviour but a blueprint
// */
// class calculator{
//     public int add() //the method returns the value in int
//     {
//         System.out.println('return value')
//     }
// }



// public class basics {
//     public static void main(String[] args) {

//     }
// }

class Calculator{
    public int add(int n1, int n2){
        int r = n1 + n2;
        return r;
    }   
} 

public class Basics{
    public static void main(String[] args){
        int n1 = 4;
        int n2 = 5;
        calculator calc = new calculator();
        int result = calc.add(n1,n2);
        System.out.println(result);
    }
}

