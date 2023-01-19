package CCTowerPkg;

import java.util.ArrayList;

public class Bedroom extends Room{
    private RoomType roomType;
    private int number;

    private double nightlyPrice;

    public Bedroom(RoomType roomType, int number,
                   double nightlyPrice) {
        super(roomType.getValue(), nightlyPrice);
        this.roomType = roomType;
        this.number = number;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public int getRoomValue() {
        return this.roomType.getValue();
    }
}
