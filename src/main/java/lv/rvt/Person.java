package lv.rvt;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String initialName,int age,int weight,int height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.name = initialName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heigthPerHundred = this.height / 100.0;
        return this.weight / (heigthPerHundred * heigthPerHundred);
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }

    public String toString() {
        return this.name +" "+ this.age +" "+ this.height +" "+ this.weight;
    }
    // ...
}
