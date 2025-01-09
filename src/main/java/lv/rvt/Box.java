package lv.rvt;

import java.lang.reflect.Constructor;

public class Box {
    private double width;
    private double height;
    private double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double volume() {
        return width * height * length;
    }

    public double area(){ 
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea() ;              
    }

    private double faceArea() {
        return height * width;
    }
    
    private double topArea() {
        return width * length;
    }

    private double sideArea() {
        return height * length;
    }
}
