import CCTowerPkg.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;
    Guest guest;
    Conference conference;

    @Before
    public void before() {
        guest = new Guest("Bob");
        bedroom = new Bedroom(RoomType.DOUBLE, 1, 100.00);
        conference = new Conference("Bob's room", 60,
                50.00);
    }

    @Test
    public void roomHasType(){
        assertEquals(RoomType.DOUBLE,
                bedroom.getRoomType());
    }
    
    @Test
    public void roomHasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void conferenceRoomHasCapacity(){
        assertEquals(60, conference.getCapacity());
    }

    @Test
    public void canCalculateRoomSize(){
        assertEquals(20.00, Room.getRoomSize(4, 5), 0.0);
    }

}

