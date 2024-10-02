package lv.rvt;
import java.util.*;

public class App 
{
    public static void main(String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times?");
        int number = Integer.valueOf(scanner.nextLine());
        printUntilNumber(number);


    }
    public static void printUntilNumber(int cik) {
        for(int i = 1; i <= cik; i++) {
            System.out.println(i);
        }
    }
} 