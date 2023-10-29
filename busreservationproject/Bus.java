package busreservationproject;
import java.util.Scanner;
import java.util.ArrayList;

public class BusMain {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();
        buses.add(new Bus(1,true,2));
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
                Booking booking = new Booking();
                if(booking.isAvailable(bookings,buses)){
                    bookings.add(booking);
                    System.out.println("your booking is confirmed");
                }
                else
                System.out.println("Bus is fullda baemaali. ni ooruku poi enna snatch pora");
            }
        }
        
    }
}

