package lv.rvt;
import java.util.*;

public class App 
{
    public static void main(String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int NumberNumber = 0;
        float Summa = 0;
        while (true) {
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            if (number > 0) {
                NumberNumber += 1;
                Summa = Summa + number;
                continue;
            }
            if (number < 0) {
                continue;
            }
            if (number == 0) {
                break;
            }
        }
    if (NumberNumber == 0 ){
        System.out.println("Cannot calculate the average");
    }
    else{
        System.out.println(Summa/NumberNumber);
    }
    }
 }