package lv.rvt;
import java.io.BufferedReader;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        
        boolean isProgrammWork = true;
        
        while (isProgrammWork) {
            
            System.out.println();
            System.out.println("Welcome to person manager, type \"help\" to see available commands.");
            
            String userInput = scanner.nextLine().toLowerCase();
            System.out.println();

            switch (userInput) {
            case "exit":
                isProgrammWork = false;
                System.out.println("Thanks, bye bye!");
                break;
            case "add":
                System.out.println(
                "Ievadiet personu pēc parauga: \n" +
                "{name} {age} {weight} {height}");;

                PersonManager.addPerson(scanner.nextLine());
                break;
            case "show":
                PersonManager.showPersonList();
                break;
            case "help":
                System.out.println(
                "add: add person to person list \n" +
                "show: show person list \n" +
                "help: show help menu \n" +
                "exit: end programm"
                );
                break;
            default:
                System.out.println("unknown command");
                break;
           }
        }
    }
}