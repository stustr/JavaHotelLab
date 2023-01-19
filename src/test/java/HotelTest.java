import CCTowerPkg.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class HotelTest {

    Bedroom bedroom;
    Conference conference;
    Guest guest;

    Hotel hotel;

    Booking booking;
    DiningRoom diningRoom;

    @Before
    public void before(){
        guest = new Guest("Bob");
        bedroom = new Bedroom(RoomType.DOUBLE, 1, 100.00);
        conference = new Conference("Bob's room", 60,
                50.00);
        ArrayList<Bedroom> bedroomList = new ArrayList<>();
        ArrayList<Conference> conferenceList =
                new ArrayList<>();
        bedroomList.add(bedroom);
        conferenceList.add(conference);
        diningRoom = new DiningRoom(15, 200.00, "Luxury " +
                "Foods for Rich People");
        HashMap<String, DiningRoom> diningRooms =
                new HashMap<>();
        diningRooms.put(diningRoom.getName(), diningRoom);
        hotel = new Hotel("The Loveshack", bedroomList,
                conferenceList, diningRooms);


    }

    @Test
    public void hotelHasName(){
        assertEquals("The Loveshack", hotel.getName());
    }

    @Test
    public void hotelHasBedrooms(){
        assertEquals(1,
                hotel.getAmountOfBedrooms());
    }

    @Test
    public void hotelHasConferences(){
        assertEquals(1, hotel.getAmountOfConferences());
    }

    @Test
    public void hotelCanCheckIn(){
        hotel.checkInGuest(guest, bedroom);
        hotel.checkInGuest(guest, conference);
        assertEquals(1, bedroom.getNumberOfGuests());
        assertEquals(1, conference.getNumberOfGuests());

    }

    @Test
    public void hotelCanCheckOut(){
        hotel.checkInGuest(guest, bedroom);
        hotel.checkOutGuest(bedroom);
        hotel.checkInGuest(guest, conference);
        hotel.checkOutGuest(conference);
        assertEquals(0, bedroom.getNumberOfGuests());
        assertEquals(0, conference.getNumberOfGuests());
    }

    @Test
    public void hotelCanBook(){
        hotel.bookRoom(bedroom, 7);
        assertEquals(1, hotel.getAmountOfBookings());
        assertTrue(bedroom.isBooked());
    }

    @Test
    public void hotelCanBill(){
        Booking booking = hotel.bookRoom(bedroom, 7);
        assertEquals(700.00, hotel.totalBill(booking), 0.0);
    }

    @Test
    public void canFindEmpties(){
        Bedroom bedroom2 = new Bedroom(RoomType.SINGLE, 2
                , 20.00);
        assertEquals(1, hotel.findEmpties().size());
    }







}
