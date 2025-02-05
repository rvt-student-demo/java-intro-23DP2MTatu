package lv.rvt;

public class Car extends Vehicle{
    
    private String color;

    public Car(String model, String mark, String motoString, int wheelsSk, String color) {
        super(model, mark, motoString, wheelsSk);
        this.color = color;
    }
}
