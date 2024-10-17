package lv.rvt;
import java.util.*;

import javax.management.relation.Role;

public class App 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int win = 0;
        int score = 0;
        System.out.print("I am thinking of a number from 1 to 10."
            +"\nYou must guess what it is in three tries."
            +"\nEnter a guess: ");
        int number = rand.nextInt(10)+1;
        for(int i = 4; i >= 0; i = i - 1) {
            System.out.print("Enter a guess: ");
            int userNumber = scanner.nextInt();
            if(userNumber == number){
                score = i;
                win = 1;
                break;
            }
            score = i;
            System.out.println("Too Low! Your score is now "+score);
        }

        if(win == 1){
            System.out.println("You WON the game!");
            System.out.println("Your score is "+score);
        }
        else{
            System.out.println("You lost.");
            System.out.println("Your score is "+score);
        }
    }
} 