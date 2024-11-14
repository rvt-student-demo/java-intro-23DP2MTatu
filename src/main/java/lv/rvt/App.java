package lv.rvt;
import java.io.BufferedReader;
import java.util.*;
public class App 
{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = Utils.getReader("persons.csv");
        
        int avgAge = 0;

        ArrayList<Person> personList = new ArrayList<>();
        String Line;

        reader.readLine();
        
        while ((Line = reader.readLine()) != null) {
            String[] parts = Line.split(", ");
            // System.out.println(Arrays.toString(parts));
            Person person = new Person(parts[0],Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), Integer.parseInt(parts[3]));
            personList.add(person);
        }
        
        for(int i = 0; i < personList.size(); i++){
            System.out.println(personList.get(i));
            avgAge = avgAge + personList.get(i).getAge();
        }
        System.out.println("Videjais gadu sktais: " + avgAge / personList.size());
    }
}