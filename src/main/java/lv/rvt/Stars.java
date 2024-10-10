package lv.rvt;

public class Stars 
{
    public static void printStars(int number) {
        for(int i = 0 ; i < number ; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void printSquare(int number) {
        for(int i = 0 ; i < number ; i++){
            for(int j = 0 ; j < number ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printRectangle(int width, int height) {
        for(int i = 0 ; i < height ; i++){
            for(int j = 0 ; j < width ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printTriangle(int size) {
        for(int i = 0 ; i <= size ; i++){
            printStars(i);
        }
        System.out.println();
    }
    public static void printSpace(int number) {
        for(int i = 0 ; i < number ; i++) {
            System.out.print(" ");
        }
    }
    public static void printRightTriagle(int size) {
        for(int i = 0 ; i <= size ; i++){
            printSpace(size-i);
            printStars(i);
        }

        System.out.println();
    }
    public static void christmasTree(int height) {
        int j = 1;
        for(int i = 1 ; i <= height ; i++){
            printSpace(height-i);
            printStars(j);
            j = j + 2;
        }
        for(int a = 0; a < 2; a++){
            printSpace(height-2);
            printStars(3);
        }
    System.out.println();
    }
}
