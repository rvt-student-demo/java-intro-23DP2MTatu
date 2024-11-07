package lv.rvt;

public class Statistics {
    int count;
    int sum;
    int SumEven;
    int SumOdd;

    public Statistics() {
    }

    public void addNumber(int number) {
        sum = sum + number;
        if (number%2 == 0) {
            SumEven = SumEven + number;
        }
        else {
            SumOdd = SumOdd + number;
        }
        count++;
    }
    public int getSumOdd() {
        return SumOdd;
    }
    public int getSumEven() {
        return SumEven;
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