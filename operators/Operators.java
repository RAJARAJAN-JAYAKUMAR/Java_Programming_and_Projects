package operators;
public class Operators {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 8;
        int add = num1 + num2;
        int sub = num1 - num2;
        int multiply = num1 * num2;
        int division = num1 / num2;
        int remainder = num1 % num2;
        System.out.println(add);
        System.out.println(sub);
        System.out.println(multiply);
        System.out.println(division); //answer is 0. How?
        System.out.println(remainder); //answer is &. How?

        int n = 7;
        // num3 = num3 +1; 
        n += 1; //shorthand writing
        ++n; //post-increment
        System.out.println(n);
        n++; //post-increment
        System.out.println(n); // n is 10
        // so how the pre increment and post increment differs, inplace of fetch the value 

        int result = ++n;
        System.out.println(result); // result = 11
        //first increase the value and fetch the vlaue 'n'. and assign to the variable

        int result1 = n++;
        System.out.println(result1);
        //fetching the value first and increase next. but the fetching value only assigned to the variable
    }
}

