import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main extends Hotel {
    public static void main(String[] args) {
        System.out.println("Welcome to HOTEL.");
        menu();
    }

    public static void menu() {
        Scanner myScanner = new Scanner(System.in);
        String guestInput;
        do {
            System.out.println("How can we help you? ");
            System.out.println("1. Booking: New Booking");
            System.out.println("2. Booking: Cancel Existing Booking");
            System.out.println("3. Inquiry: See all rooms");
            System.out.println("4. Facilities: Check on Room Status");
            guestInput = myScanner.nextLine();
            if (guestInput.equals(("1"))) {
                bookingMenu();
//            } else if (guestInput.equals("2")) {
//                cancellationsMenu();
            } else if (guestInput.equals("3")) {
                System.out.println(addRoom());
            } else if (guestInput.equals("4")) {

            } else {
                System.out.println("Unrecognized input. Please try again.");
            }
        } while (!guestInput.equals("exit"));
    }

    public static void bookingMenu() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("When would you like to check in: MM/DD/YYYY");
        String checkIn = myScanner.nextLine();
        System.out.println("When would you like to check out: MM/DD/YYYY");
        String checkOut = myScanner.nextLine();
        System.out.println("What is your first name? ");
        String guestFirstName = myScanner.nextLine();
        System.out.println("When is your last name? ");
        String guestLastName = myScanner.nextLine();
        System.out.println("How many people will be staying in the room? ");
        int numOfGuests = myScanner.nextInt();
        if (numOfGuests == 2) {
            System.out.println("What is the full name of your guest?");
        } else if (numOfGuests > 2) {
            System.out.println("Unfortunately, we are only able to allow a maximum of two persons including yourself.");
        }
        {
            System.out.println("Which room would you like to book? ");
            String roomSelection = myScanner.nextLine();
            System.out.println("To confirm we have: " + guestFirstName + " " + guestLastName + " staying in the: " + roomSelection + " checking in on: " + checkIn + " and leaving on: " + checkOut);
        }
    }
    public static void doubleStandard(){

    }
    public static void deluxeDouble(){

    }
    public static void juniorSuite(){

    }
    public static void grandSuite(){

    }
}



//        String[] brokenCommand = guestInput.split(" ");
//        System.out.println(Arrays.toString(brokenCommand));
        //makeBooking grandsuite 24Nov22 1Dec22
        //["makeBooking", "grandsuite", "24Nov22", "1Dec22"]

//    public static void cancellationsMenu(){
//        Scanner myScanner = new Scanner(System.in);
//        String guestInput = myScanner.nextLine();
//        System.out.println("What name is the reservation under? ");
//    }
//    public static boolean isRoomReady(){
//
//        return false;
//    }
//}
