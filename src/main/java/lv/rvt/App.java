package lv.rvt;
import java.util.*;

public class App 
{
    public static void main(String[] args )
    {
        int sum = 0;
        int Num = 0; 
        int Even = 0;
        int Odd = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1){
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " +Num);
                System.out.println("Average: " + (double) sum/Num);
                System.out.println("Even: " + Even);
                System.out.println("Odd: " + Odd);
                break;
            }
            else {
                if (number % 2 == 0) {
                    Even++;
                }
                else {
                    Odd++;
                }
                sum += number;
                Num++;
            }
        }
    }
} 