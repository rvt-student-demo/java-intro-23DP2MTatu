package lv.rvt;

public class Agent {
    public String name;
    public String lastname;

    public Agent(String Name, String Lastname){
        name = Name;
        lastname = Lastname;
    }
    public String toString() {
        return "My name is " + lastname + ", " + name + " " + lastname; 
    }
}
