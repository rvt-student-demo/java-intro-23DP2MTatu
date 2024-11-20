package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Random;

public class PersonManager {
    
    public static ArrayList<Person> getPersonList() throws Exception{
        BufferedReader reader = Helper.getReader("persons.csv");

        ArrayList<Person> personList = new ArrayList<>();
        String Line;

        reader.readLine();
        
        while ((Line = reader.readLine()) != null) {
            String[] parts = Line.split(", ");
            // System.out.println(Arrays.toString(parts));
            Person person = new Person(parts[0],Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), Integer.parseInt(parts[3]));
            personList.add(person);
        }
        return personList;
    }

    public static void addPerson(Person person) throws Exception {
        BufferedWriter writer = 
        Helper.getWriter("persons.csv", StandardOpenOption.APPEND);

        writer.write(person.toCsvRow());
        writer.newLine();
        writer.close();
    }
}
