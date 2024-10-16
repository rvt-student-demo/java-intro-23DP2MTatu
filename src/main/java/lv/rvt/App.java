package lv.rvt;
import java.util.*;

public class App 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();
        int index = 0;
        int summa = 0;
        while (true) {
            number.add(scanner.nextInt());
            if (number.get(index) == 0){
                number.remove(index);
                System.out.println(number);
                System.out.println(number.get(1)+number.get(2));
                System.out.println(summa);
                break;
            }
            summa = summa + number.get(index);
            index++;
        }
    }
} 