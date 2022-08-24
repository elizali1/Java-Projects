import java.util.ArrayList;
import java.util.List;

public class Hotel{
    static List<Rooms> rooms = new ArrayList<>();

    public static List<Rooms> addRoom(){
        Rooms DoubleStandard = new Rooms(2,"Double Standard", 150.00, true);
        if (DoubleStandard.isReady()==true){
            rooms.add(DoubleStandard);
        }
        Rooms DeluxeDouble = new Rooms(2,"Deluxe Double", 200.00, true);
        if (DeluxeDouble.isReady()==true){
            rooms.add(DeluxeDouble);
        }
        Rooms JuniorSuite = new Rooms(1,"Junior Suite", 300.00, true);
        if (JuniorSuite.isReady()==true){
            rooms.add(JuniorSuite);
        }
        Rooms GrandSuite = new Rooms(1,"Grand Suite", 400.00, true);
        if (GrandSuite.isReady()==true){
            rooms.add(GrandSuite);
        }
        return rooms;
    }
    public void displayRooms(){
        System.out.println(rooms);
    }
    public void bookRoom(String roomType){

    }
}
