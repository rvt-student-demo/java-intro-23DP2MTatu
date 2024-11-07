package lv.rvt;
import java.util.*;
public class App 
{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();

        System.out.println("Enter numbers:");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            statistics.addNumber(number);
        }
        System.out.println("Sum: " + statistics.sum());
    }
} 