// Note that the constructor name must match the class name, and it cannot have a return type (like void).

// Also note that the constructor is called when the object is created.

// All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. 
// However, then you are not able to set initial values for object attributes.

package OOPS.java;
                         
// public class Constructors {
//     int x;  // class attribute
//     public Constructors(int y) {
//     x = 5; // set the initial value for the class attribute
//     y = y
//     }

//     public static void main(String[] args) {
//         Constructors obj1 = new Constructors();
//         System.out.println(obj1.x);
//         System.out.println(obj.y);
//     }
// }

public class Constructors{
    int modelYear;
    String modelName;

    public Constructors(int year, String name){
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args){
        Constructors mycar = new Constructors(1969, "mustang");
        System.out.println(mycar.modelYear + " " + mycar.modelName);
    }
}


