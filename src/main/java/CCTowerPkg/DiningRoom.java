package CCTowerPkg;

public class DiningRoom extends Room {

    private String name;

    public DiningRoom(int capacity, double nightlyPrice,
                      String name) {
        super(capacity, nightlyPrice);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
