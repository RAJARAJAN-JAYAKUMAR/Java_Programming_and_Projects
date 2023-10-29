package busreservationproject;

import java.util.Scanner;
import java.util.ArrayList;

public class BusMain {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<Bus>();

        buses.add(new Bus(1,true,45));
        buses.add(new Bus(2,true,50));
        buses.add(new Bus(3,true,35));
        
        for(Bus b : buses){
            b.displayBusInfo();
        }


        int userOpt = 1;
        Scanner scanner = new Scanner(System.in);
        while(userOpt==1){
            System.out.println("Enter 1 to Book and 2 to Exit: ");
            userOpt = scanner.nextInt();
            if(userOpt==1){
                System.out.println("Booking.....");
            }
        }
        
    }
}
