/*  It is recommended to use class name as same as the file name
it is called "one class per file " which improves code organisation and maintainablity.*/
public class Loops{
public static void main(String[] args) {
    //creating instance of a class namely objname
    Loopingclass objname = new Loopingclass();
    //calling methods using object created
    objname.display();
    int num[] = {1,2,3,4,5,6};

    //for loop
    for (int i=1;i<=3;i++){
        System.out.println("raja");
    }

    //while loop
    int j=1;
    while(j <=3){
        System.out.println("Rajan");
        j++;
    }

    //Do-while loop
    int k = 0;
    do{System.out.println(k);
        k++;
    }
    while(k >= 5);

    //enhanced for loop
    for(int n : num){
        System.out.print(n + " ");
    }
}
}
//creating a non-public class
class Loopingclass{
    //method to be called when called from public class
    void display(){
        System.out.println("Fuck you raja" + " ");
    }
}
// Above public class calls the non-public class.






