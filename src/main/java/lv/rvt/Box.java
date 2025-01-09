package lv.rvt;

public class Box {
    private double width;
    private double height;
    private double length;

    public Box(Box oldBox) {
        width = oldBox.width();
        height = oldBox.height();
        length = oldBox.length();
    }

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box biggerBox( Box oldBox ) {
        return new Box( 1.25*oldBox.length(), 1.25*oldBox.width(), 1.25*oldBox.height() );
    }

    public Box ( double side ) {
        width = height = length = side;
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

    public double length() {
        return length;
    }

    public double height() {
        return height;
    }

    public double width() {
        return width;
    }
}
