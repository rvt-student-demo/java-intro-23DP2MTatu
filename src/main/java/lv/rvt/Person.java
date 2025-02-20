package lv.rvt;


public class Person {
    private String name;
    private int age;
    private String adress;

    public Person(String initialName,int age, String liveAdress) {
        this.age = age;
        this.adress = liveAdress;
        this.name = initialName;
    }

    public String toString() {
        return this.name +" "+ this.age +" "+ this.adress;
    }

    public String toCsvRow() {
        return this.name +", "+ this.age +", "+ this.adress;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getAdress() {
        return this.adress;
    }
}