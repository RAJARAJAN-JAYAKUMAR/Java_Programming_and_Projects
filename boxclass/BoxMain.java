package boxclass;

public class BoxMain {
    public static void main(String[] args) {
        Box blackbox;
        blackbox = new Box();
        // Box blackbox = new Box();
        blackbox.length = 10;
        blackbox.breadth = 20;
        System.out.println(blackbox.length);

    }
}

class Box{
   int length;
   int breadth;
   int height;
}