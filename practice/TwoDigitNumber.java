package practice;

public class TwoDigitNumber {
    static Boolean isBool(int a, int b){
        if(a%b ==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        boolean result = isBool(10, 3);
        System.out.println(result);
    }
}
