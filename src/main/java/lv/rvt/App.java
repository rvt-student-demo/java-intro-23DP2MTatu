package lv.rvt;
import java.io.BufferedReader;
import java.util.*;
public class App 
{
    public static void main(String[] args) {
        PaymentCard petesCard = new PaymentCard(10);

        System.out.println("money " + petesCard.balance());
        boolean wasSuccessful = petesCard.takeMoney(8);
        System.out.println("successfully took: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());

        wasSuccessful = petesCard.takeMoney(4);
        System.out.println("successfully took: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());
    }
}