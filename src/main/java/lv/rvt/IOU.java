package lv.rvt;

import java.util.*;

public class IOU {
    HashMap<String, Double> people = new HashMap<>();

    public void setSum(String toWhom, double amount) {
        this.people.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        if (!people.containsKey(toWhom)) {
            return 0;
        } else {
            return people.get(toWhom);
        }
    }

}
