package CCTowerPkg;

public class Booking {

    private int nights;
    private Room room;

    public Booking(Room room, int nights) {
        this.room = room;
        this.nights = nights;
    }

    public int getNights() {
        return this.nights;
    }

    public Room getRoom() {
        return this.room;
    }
}
