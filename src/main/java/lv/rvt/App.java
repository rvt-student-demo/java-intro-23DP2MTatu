package lv.rvt;
import java.util.*;

public class App 
{
    public static void main(String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Jūsu vārds: ");
        String name = scanner.nextLine();
        
        System.out.println("Jūsu Uzvārds: ");
        String lastname = scanner.nextLine();
        
        System.out.println("Jūsu Grupa: ");
        String grupa = scanner.nextLine();
        
        System.out.println("Vārds: " + name + " Uzvārds: " + lastname + " grupa: " + grupa);
    }
}