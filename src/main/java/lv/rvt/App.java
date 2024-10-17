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
            if (userNumber == number) {
                System.out.println("RIGHT!");
                win = 1;
                break;
            } else {
                System.out.println("wrong");
            }
        }
        if(win == 1){
            System.out.println("You have won the game.");
        }
        else{
            System.out.println("The correct number was " +number+"."
                +"\nYou have lost the game.");
        }
    }
} 