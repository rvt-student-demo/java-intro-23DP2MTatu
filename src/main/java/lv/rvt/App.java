package lv.rvt;
import java.io.BufferedReader;
import java.util.*;
public class App 
{
    public static void main(String[] args) throws Exception {
        
        String name = "";
        int age = 0;
        int weight = 0;
        int height = 0;

        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Person> persons = PersonManager.getPersonList();
        for (Person person : persons) {
            System.out.println(person);
        }

        name = scanner.nextLine();
        age = scanner.nextInt();
        weight = scanner.nextInt();
        height = scanner.nextInt();

        Person person = new Person(name, age, weight, height);

        PersonManager.addPerson(person);

    }
}