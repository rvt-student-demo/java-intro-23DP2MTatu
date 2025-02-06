package lv.rvt;

public class Box implements Packable{
    
    private double maxCap;
    private double cap;
    private int itemCount;

    public Box(int maxCap) {
        this.maxCap = maxCap;
        cap = 0;
    }

    public void add(Book item) {
        if (maxCap >= cap + item.weight()) {
            cap += item.weight();
            itemCount++;
        }
    }

    public void add(CD item) {
        if (maxCap >= cap + item.weight()) {
            cap += item.weight();
            itemCount++;
        }
    }

    @Override
    public String toString() {
        return "Box: " + itemCount + " item, total weight " + cap + " kg";
    }
}
