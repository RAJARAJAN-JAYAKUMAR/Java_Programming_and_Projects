package operators;
public class LogicalOperators{
    public static void main(String[] args) {
        int a = 10000;
        int b = 10000;
        int c = 100;
        int d = 50;
        boolean result =  a==b || c==d; // or operator
        boolean result1 =  a==b && c==d; //and operator
        boolean result2 =  a == b; // not operator
        System.out.println(result); //true
        System.out.println(result1); //false
        System.out.println(!result2); //false, i need the answer to be opposite
}
}