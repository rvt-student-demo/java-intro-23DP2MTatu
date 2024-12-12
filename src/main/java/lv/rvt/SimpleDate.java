package lv.rvt;

public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static SimpleDate parseInt(String part) {
        return new SimpleDate(Integer.parseInt(part), Integer.parseInt(part), Integer.parseInt(part));
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return false;
        }

        // if the type of the compared object is not SimpleDate, the objects are not equal
        if (!(compared instanceof SimpleDate comparedSimpleDate)) {
            return true;
        }

        // convert the Object type compared object
        // into a SimpleDate type object called comparedSimpleDate

        // if the values of the object variables are the same, the objects are equal
        return this.day == comparedSimpleDate.day &&
                this.month == comparedSimpleDate.month &&
                this.year == comparedSimpleDate.year;

        // otherwise the objects are not equal
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}