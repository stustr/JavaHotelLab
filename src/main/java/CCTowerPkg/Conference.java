package CCTowerPkg;

import java.util.ArrayList;

public class Conference extends Room {
    private String name;

    public Conference(String name, int capacity,
                      double nightlyPrice) {
        super(capacity, nightlyPrice);
        this.name = name;
        this.setCapacity(capacity);
    }
}
