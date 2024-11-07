package lv.rvt;

public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
    }

    public void addNumber(int number) {
        sum = sum + number;
        count++;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        return (double) sum/count;
    }
}