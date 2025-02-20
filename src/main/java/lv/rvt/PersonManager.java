package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class PersonManager {

    public void run() throws Exception {
        Console console = System.console();
        
        boolean isProgrammWork = true;
        
        while (isProgrammWork) {
            
            System.out.println();
            System.out.println("Welcome to person manager, type \"help\" to see available commands.");
            
            String userInput = console.readLine();
            System.out.println();
            switch (userInput) {
                case "exit":
                    isProgrammWork = false;
                    System.out.println("Thanks, bye bye!");
                    break;

                case "add":
                    System.out.println(
                    "Ievadiet personu pēc parauga: \n" +
                    "{name} {age} {adress}");
                    addPerson(console.readLine());
                    break;

                case "show":
                    showPersonList();
                    break;

                // TODO remake "Show..." funkcijas uz "sort" ar tipu sakartošanas

                case "showByName":
                    getPersonSortByName();
                    break;

                case "showByAge":
                    getPersonSortByAge();
                    break;

                case "showByAdress":
                    getPersonSortByAdress();
                    break;

                case "help":
                    System.out.println(
                    "add: add person to person list \n" +
                    "show: show person list \n" +
                    "showByName: show person list sort by name\n" +
                    "showByAge: show person list sort by age\n" +
                    "showByAdress: show person list sort by adress\n" +
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
    
    public ArrayList<Person> getPersonList() throws Exception {
        BufferedReader reader = Helper.getReader("persons.csv");

        ArrayList<Person> personList = new ArrayList<>();
        String Line;

        reader.readLine();
        
        while ((Line = reader.readLine()) != null) {
            String[] parts = Line.split(", ");
            
            Person person = new Person(parts[0],Integer.parseInt(parts[1]), parts[2]);
            personList.add(person);
        }
        return personList;
    }

    public void showPersonList() throws Exception{
        ArrayList<Person> personList = new ArrayList<>();
        System.out.println("name, age, adress");
        
        personList = getPersonList();

        for (Person person : personList) {
            System.out.println(person);
        }
    }

    public void addPerson(Person person) throws Exception {
        BufferedWriter writer = 
        Helper.getWriter("persons.csv", StandardOpenOption.APPEND);

        writer.write(person.toCsvRow());
        writer.newLine();
        writer.close();
    }

    public void addPerson(String line) throws Exception{
        
        String[] part = line.split(" ");
        Person person = new Person(part[0],Integer.parseInt(part[1]),part[2]);
        addPerson(person);
        System.out.println("Person was added to the list");
    }

    public void getPersonSortByName() throws Exception {
        ArrayList<Person> personList = new ArrayList<>();
        System.out.println("name, age, adress");
        
        personList = getPersonList();

        personList.sort(Comparator.comparing(Person::getName));

        for (Person person : personList) {
            System.out.println(person);
        }
    }
    
    public void getPersonSortByAge() throws Exception {
        ArrayList<Person> personList = new ArrayList<>();
        System.out.println("name, age, adress");
        
        personList = getPersonList();

        personList.sort(Comparator.comparing(Person::getAge));

        for (Person person : personList) {
            System.out.println(person);
        }
    }
    
    public void getPersonSortByAdress() throws Exception {
        ArrayList<Person> personList = new ArrayList<>();
        System.out.println("name, age, adress");
        
        personList = getPersonList();

        personList.sort(Comparator.comparing(Person::getAdress));

        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
