package lv.rvt;
import java.util.*;

public class App 
{
    public static void main(String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int NumberNumber = 0;
        int Summa = 0;
        while (true) {
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            if (number != 0) {
                NumberNumber += 1;
                Summa = Summa + number;
                continue;
            }
            if (number == 0) {
                break;
            }
        }
    System.out.println("Number of numbers: " + NumberNumber);
    System.out.println("Sum of the numbers: " + Summa);
    }
 }