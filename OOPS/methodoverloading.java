// you can convert integer to double, but not double to integer
// think what if methodoverloading concept is not included in java. you'll specify diff names for each method and call it vice versa

package OOPS;
public class methodoverloading {

    static int max(int a, int b){
        return a>b?a:b;  // check a is greater than b using conditional operator
    }
    static double max(double a, double b){
        return a>b?a:b;  // check a is greater than b using conditional operator
    }
    static char max(char a, char b){
        return a>b?a:b;  // check a is greater than b using conditional operator
    }

// method executes based on the parameters
    static void test(){
        System.out.println("test method with no argument");
    }

    static void test(int a){
        System.out.println("test method with 1 argument");
    }

    static void test(int a, int b){
        System.out.println("test method with 2 argument");
    }

    public static void main(String[] args){
        System.out.println(max(5,7)); // 7,  if you comment the int max method, it works on double method, turns the int to double and
        System.out.println(max(7.7,6.6)); //7.7
        System.out.println(max('r','a')); //it compares the ascii value and return the char. a = 48 

        test();
        test(1);
        test(10,12);

//using in-built method abs - absolute value returns only +ve number
        System.out.println(Math.abs(-4.7));
        System.out.println(Math.abs(10));
    }
}
