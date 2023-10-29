package busreservationproject;
import java.util.*;
import java.text.ParseException; // for exception handling
import java.text.SimpleDateFormat; // to manipulate date formats

public class Booking {
    String passengerName;
    int busNo;
    Date date;

    //using constructor to get user-input
    Booking(){ 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name Asshole:");
        passengerName = scanner.next();
        System.out.println("Enter Bus number: ");
        busNo = scanner.nextInt();
        System.out.println("Enter Booking date(dd-mm-yyyy): ");
        String dateInput = scanner.next();

        // to convert string to date
        SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy"); //why capital MM is used cause small mm might be used to name minutes(mm) 
        
        // date = dateformat.parse(dateInput); // this code works. but, ue try and catch for better approach
        try {
            date = dateformat.parse(dateInput);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses){
        int capacity = 0;
        for(Bus bus : buses){
            if(bus.getbusNo()== busNo)
                capacity = bus.getCapacity();
        }
        int booked = 0; // intializing to count the no of bookings
        for(Booking b:bookings){
            if((b.busNo == busNo) && b.date.equals(date)){
                booked++;
            }
        }
        return booked<capacity?true:false;
    }
}
