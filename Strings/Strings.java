package Strings;
/*
use double quotes for String literal
use single quote for char literal 
its not a primitive data type cause String is a class
it start with capital letter unlike primitive data type
 */


public class Strings{
    public static void main(String[] args) {

        // String var = "Rajarajan";  use this syntax always

        String name = new String("Rajarajan");
        System.out.println(name); 
        System.out.println(name.hashCode()); //1837913474 <- hashcode
        System.out.println("hello " + name); // concatenate using + operator

        // string methods
        System.out.println(name.charAt(1)); //retreiving values using charAt method
        System.out.println(name.concat(" you are cute")); // concat string using concat() method


    }
}