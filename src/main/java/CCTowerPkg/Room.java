package CCTowerPkg;

import java.util.ArrayList;

public abstract class Room {
    private int capacity;
    private ArrayList<Guest> guests;

    private double nightlyPrice;

    private boolean booked;

    public Room(int capacity, double nightlyPrice) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.nightlyPrice = nightlyPrice;
        this.booked = false;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }

    public void addGuestToRoom(Guest guest){
        this.guests.add(guest);
    }

    public void removeGuestFromRoom(){
        this.guests.clear();
    }

    public int getNumberOfGuests(){
        return this.guests.size();
    }

    public double getNightlyPrice() {
        return this.nightlyPrice;
    }

    public static double getRoomSize(double length,
                                     double width){
        return length * width;
    }

    public void setBooked() {
        this.booked = !booked;
    }

    public boolean isBooked() {
        return this.booked;
    }
}
