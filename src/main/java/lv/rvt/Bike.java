package lv.rvt;

public class Bike extends Vehicle{

    private String type;

    public Bike(String model, String mark, String motoString, int wheelsSk, String type) {
        super(model, mark, motoString, wheelsSk);
        this.type = type;
    }
}
