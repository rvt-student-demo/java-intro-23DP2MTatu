package lv.rvt;

public abstract class Vehicle {
    
    private String model;
    private String mark;
    private String motorType;
    private int wheelsSk;

    public Vehicle(String model, String mark, String motoString, int wheelsSk) {
        this.mark = mark;
        this.model = model;
        this.motorType = motoString;
        this.wheelsSk = wheelsSk;
    }
}
