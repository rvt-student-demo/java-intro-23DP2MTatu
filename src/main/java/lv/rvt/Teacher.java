package lv.rvt;

public class Teacher extends Person{

    private int salary;

    Teacher(String name, String adress, int salary) {
        super(name, adress);
        this.salary = salary;
    }

    public int salary() {
        return this.salary;
    }
    @Override
    public String toString() {
        return super.toString() + "\n" +"  " + "salary "  + salary() + " euro/month";
    }
}
