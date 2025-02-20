package lv.rvt;
import java.util.ArrayList;

public class Box implements Packable{
    
    private double maxCap;


    public Box(int maxCap) {
        this.maxCap = maxCap;
        arrayList<double> cap = new arrayList<>();
    }

    public void add(Book item) {
        if (maxCap >= (weight() + item.weight())) {
            cap[cap.length] = item.weight();
        }
    }

    public void add(CD item) {
        if (maxCap >= weight() + item.weight()) {
            cap[cap.length] += item.weight();
        }
    }

    public double weight() {
        double weight = 0;
        
        for (double d : cap) {
            weight += d;
        }

        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + cap.length + " item, total weight " + weight() + " kg";
    }
}
