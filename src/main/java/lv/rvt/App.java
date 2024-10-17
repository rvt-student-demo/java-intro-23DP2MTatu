package lv.rvt;
import java.util.*;

import javax.management.relation.Role;

public class App 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        
        int win = 0;
        System.out.print("I am thinking of a number from 1 to 10."
            +"\nYou must guess what it is in three tries."
            +"\nEnter a guess: ");
        int number = rand.nextInt(10)+1;
        for(int i = 0; i < 3;i++) {
            int userNumber = scanner.nextInt();
            int userNumberTemp = userNumber-number;
            if(userNumberTemp < 0){
                userNumberTemp = userNumberTemp * -1;
            }
            if(userNumber == number){
                win = 1;
                System.out.println("RIGHT!");
                break;
            }
            switch (userNumberTemp) {
                case 1:
                    System.out.println("hot");
                    break;
                case 2:
                    System.out.println("warm");
                    break;
                default:
                    System.out.println("cold");
                    break;
            }
        }
        if(win == 1){
            System.out.println("You have won the game.");
        }
        else{
            System.out.println("The correct number was "+number+".");
            System.out.println("You have lost the game.");
        }
    }
} 