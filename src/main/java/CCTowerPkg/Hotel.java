package CCTowerPkg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Hotel {
    private ArrayList bedrooms;
    private ArrayList conferences;

    private ArrayList bookings;

    private String name;

    private HashMap<String, DiningRoom> diningRooms;

    public Hotel(String name, ArrayList<Bedroom> bedrooms,
                 ArrayList<Conference> conferences,
                 HashMap<String, DiningRoom> diningRooms) {
        this.name = name;
        this.bedrooms = bedrooms;
        this.conferences = conferences;
        this.bookings = new ArrayList<Booking>();
        this.diningRooms = diningRooms;
    }

    public ArrayList getBedrooms() {
        return this.bedrooms;
    }

    public void setBedrooms(ArrayList bedrooms) {
        this.bedrooms = bedrooms;
    }

    public ArrayList getConferences() {
        return this.conferences;
    }

    public void setConferences(ArrayList conferences) {
        this.conferences = conferences;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfBedrooms() {
        return bedrooms.size();
    }

    public int getAmountOfConferences() {
        return conferences.size();
    }

    public void checkInGuest(Guest guest, Room room) {
        room.addGuestToRoom(guest);
    }

    public void checkOutGuest(Room room) {
        room.removeGuestFromRoom();
    }

    public Booking bookRoom(Room room, int nights) {
        Booking booking = new Booking(room, nights);
        this.bookings.add(booking);
        room.setBooked();
        return booking;
    }

    public int getAmountOfBookings() {
        return bookings.size();
    }

    public double totalBill(Booking booking) {
        Room room = booking.getRoom();
        return room.getNightlyPrice() * booking.getNights();
    }

    public ArrayList<Bedroom> findEmpties() {
        ArrayList<Bedroom> empties =
                new ArrayList<>();
        for (Bedroom bedroom : this.bedrooms) {
            if (!bedroom.isBooked()) {
                empties.add(bedroom);
            }
        }
        return empties;
    }
}

