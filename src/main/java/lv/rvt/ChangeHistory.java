package lv.rvt;

import java.util.ArrayList;


public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        history = new ArrayList<Double>();
    }
    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        if (history == null) {
            return 0;
        }
        else {
            double max = Double.NEGATIVE_INFINITY;
            for (Double double1 : history) {
                if (max < double1) {
                    max = double1;
                }
            }
            return max;
        }
    }

    public double minValue() {
        if (history == null) {
            return 0;
        }
        else {
            double min = Double.POSITIVE_INFINITY;
            for (Double double1 : history) {
                if (min > double1) {
                    min = double1;
                }
            }
            return min;
        }
    }

    public double average() {
        if (history == null) {
            return 0;
        }
        else {
            double avg = 0;
            for (Double double1 : history) {
                avg = avg + double1;
            }
            return avg/history.size();
        }
    }
}
