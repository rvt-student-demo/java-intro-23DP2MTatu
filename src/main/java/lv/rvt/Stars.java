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
    }
}
