package strings;
 
public class MutableImmutableString{
    public static void main(String[] args) {
        String name = "raja";

        name = name + "rajan";
        System.out.println(name); //rajarajan

        String s1  = "raja";
        String s2 = "raja";
        System.out.println(s1 == s2); //true
    } 
}
