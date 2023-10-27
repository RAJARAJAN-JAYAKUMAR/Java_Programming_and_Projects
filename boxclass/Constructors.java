//cosntructor should be named as class name

package boxclass;

// public class Constructors{
//     public static void main(String[] args) {
//         Box blackbox = new Box();
//         blackbox.setDim(5, 4, 5);
//        }
//    }
// class Box{
//    int length; int breadth; int height; 
//    int volume(){
//    return length*breadth*height;
//    }
//    void setDim(int l, int b, int h){
//     length = l;
//     breadth = b;
//     height = h;
//    }
// }


// public class Constructors{
//     public static void main(String[] args) {
//         // Box blackbox = new Box();
//         // blackbox.setDim(5, 4, 5);
//         Box blackbox = new Box(5,4,5); //using constructor
//        }
//    }
// class Box{
//    int length; 
//    int breadth; 
//    int height; 
//    int volume(){
//    return length*breadth*height;
//    }
//    Box(int l, int b, int h){ //constructor
//     length = l;
//     breadth = b;
//     height = h;
//    void setDim(int l, int b, int h){
//     length = l;
//     breadth = b;
//     height = h;
//    }
// }

// This pointer
public class Constructors{
    public static void main(String[] args) {
        // Box blackbox = new Box();
        // blackbox.setDim(5, 4, 5);
        Box blackbox = new Box(5,4,5); //using constructor
       }
   }
class Box{
   int length; 
   int breadth; 
   int height; 
   int volume(){
   return length*breadth*height;
   }
   Box(int l, int b, int h){ //constructor using this pointer. might be use for variable name class
    this.length = l;
    this.breadth = b;
    this.height = h;
   void setDim(int l, int b, int h){
    length = l;
    breadth = b;
    height = h;
   }
}
