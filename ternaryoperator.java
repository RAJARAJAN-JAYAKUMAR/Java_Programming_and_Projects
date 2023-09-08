public class ternaryoperator {
    public static void main(String[] args) {
        int n = 4;
        int result = 0;

        if(n%2 == 0){
            result = 10;
            System.out.println(result);}
        else{
            result = 20;}

        // we can do this operation in single line using ternary operator
        // Ternary operator -> ?:

        result = n%2==0 ? 10  : 20;
        System.out.println(result);
        // in the above statement returns the same as if-clause, if condition is true it will return the value after (?) and if not returns the value after (:)
        
    }
}
