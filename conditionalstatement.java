public class ConditionalStatement {
    public static void main(String[] args) {
        int x = 91;
        //in java indentation not matters as is in python
        if (x>10) // this is the syntax for if clause
        System.out.println("hello");
        else
        System.out.println("Bye");
        if (x>10 && x<=100) // using and operator
        System.out.println("yes");
        else
        System.out.println("no");
        if (x>10 || x<=100) // using or operator
        System.out.println("yes");
        else
        System.out.println("no");

        // if multiple statement inside if clause then use {}

        int a = 8;
        int b = 7;
        int c = 9;
        if(a>b)
        {
            System.out.println(a);
            System.out.println("yes");
        }
        else 
            System.out.println("no");

        if (a>b && a>c) // you can give multiple conditioon within the braces
            System.out.println(a);
        else if(b>c)
            System.out.println(b);
        else
            System.out.println(c);
    }
}
