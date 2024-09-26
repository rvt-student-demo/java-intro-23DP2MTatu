package lv.rvt;
import java.util.*;

public class App 
{
    public static void main(String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int facN = Integer.valueOf(scanner.nextLine());
        int fac = 1;
        if (facN == 0){
            System.out.println(fac);
        }
        else{
            for(int i = 1; i < facN+1; i++){
                fac = fac * i;
            }
        }   System.out.println("Factorial: " + fac);
    }
}