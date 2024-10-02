package lv.rvt;
import java.util.*;

public class App 
{
    public static void main(String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times?");
        int cik = Integer.valueOf(scanner.nextLine());
        for(int i = 0;i < cik; i++) {
            PrintText();
        }

    }
    public static void PrintText() {
        System.out.println("In a hole in the ground there lived a method");
    }
} 