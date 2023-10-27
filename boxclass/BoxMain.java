package boxclass;

// public class BoxMain {
//     public static void main(String[] args) {
//         Box blackbox;
//         blackbox = new Box();
//         // Box blackbox = new Box();
//         blackbox.length = 10;
//         blackbox.breadth = 20;
//         System.out.println(blackbox.length);
//     }
// }
// class Box{
//    int length; //instance variable
//    int breadth;
//    int height;
// }

// public class BoxMain{
//     int boxVolume(int length, int breadth, int height){ //method definition
//         int vol;
//         vol = length*breadth*height;
//         return vol;
//     }
//     public static void main(String[] args) {
//     int volume = boxVolume(10,20,30);
//     System.out.println(volume); //error: non-static method boxVolume(int,int,int) cannot be referenced from a static context
//     }
// }

// public class BoxMain{
//     static int boxVolume(int length, int breadth, int height){
//         // int vol;
//         // vol = length*breadth*height;
//         // return vol;
//         return length*breadth*height;
// }    public static void main(String[] args) { 
//         int volume = boxVolume(10,20,30);
//         System.out.println(volume); //6000
//         System.out.println(boxVolume(10,20,30)); //6000
//     }
// }

// public class BoxMain{
//     static void boxVolume(int length, int breadth, int height){ //usign void to print statement not returing value,so no need to declare return literal type
//     // int vol;
//     // vol = length*breadth*height;
//     // return vol;
//     System.out.println(length*breadth*height);
//     }
//     static void printLine(){
//         System.out.println("---------------------");
//     }
//     static void WelcomeMessage(){
//         System.out.println(" ---------------------");
//         System.out.println("|                     |");
//         System.out.println("|       WElCOME       |");
//         System.out.println("|                     |");
//         System.out.println(" ---------------------");
//     }
//     public static void main(String[] args) { 
//     printLine();
//     System.out.println("Hello");
//     boxVolume(10,20,30);
//     printLine();
//     WelcomeMessage();
//     }
// }

public class BoxMain {
    public static void main(String[] args) {
        Box blackbox;
        blackbox = new Box();
        // Box blackbox = new Box();
        blackbox.length = 10;
        blackbox.breadth = 20;
        blackbox.height = 20;
        blackbox.volume(); // calling method using object is 'invoking'
        System.out.println(blackbox.volume());
        Box woodBox = new Box();
        woodBox.length = 20;
        woodBox.breadth = 30;
        woodBox.height = 40;
        woodBox.volume(); // calling method using object is 'invoking'
        System.out.println(woodBox.volume());
       }
   }
   class Box{
   int length; int breadth; int height; int volume(){
   return length*breadth*height;
   }
}



