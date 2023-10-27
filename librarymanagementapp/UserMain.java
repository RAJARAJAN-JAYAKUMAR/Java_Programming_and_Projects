package librarymanagementapp;



public class UserMain {
    public static void main(String[] args) {
     UserDetails user_1= new UserDetails();
     user_1.user_name = "mangai";
     user_1.book_name = "A little book of friendship";
     System.out.println(user_1.user_name);
     System.out.println(user_1.book_name);
     System.out.println(user_1.remainder_message);

    }
}

class UserDetails{
    String user_name;
    String book_name;
    String remainder_message = "Thank you my golu friend";
}