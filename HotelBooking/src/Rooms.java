import java.util.ArrayList;
import java.util.List;

public class Rooms {
    public static Rooms[] getRooms;
    String roomType;
    Double roomPrice;
    Boolean ready;
    int numAvail;


    public int getNumAvail() {
        return numAvail;
    }

    public void setNumAvail(int numAvail) {
        this.numAvail = numAvail;
    }

    public Boolean isReady() {
        return ready;
    }

    public void setReady(Boolean ready) {
        this.ready = ready;
    }
    public boolean equals(Object obj){

        return false;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(Double roomPrice) {
        this.roomPrice = roomPrice;
    }
    public Rooms(int nA, String rT, double rP, boolean ready ){
        this.numAvail = nA;
        this.roomType = rT;
        this.roomPrice = rP;
        this.ready = ready;
    }
    public String toString(){
        return "We have: "+this.numAvail+" of "+this.roomType+" which costs: "+this.roomPrice+" a night and is: "+(this.isReady()?"Empty":"Occupied");
    }

    public Rooms[] getRooms() {
        return new Rooms[0];
    }
}
