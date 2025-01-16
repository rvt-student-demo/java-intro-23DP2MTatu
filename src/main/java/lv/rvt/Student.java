package lv.rvt;

public class Student extends Person{
    private int credits;

    public Student(String name,String adress) {
        super(name,adress);
        credits = 0;
    }

    public void study() {
        credits++;
    }

    public int credits() {
        return this.credits;
    }

    @Override 
    public String toString() {
        return super.toString() + "\n" + "Study credits "+ credits();
    }
}
