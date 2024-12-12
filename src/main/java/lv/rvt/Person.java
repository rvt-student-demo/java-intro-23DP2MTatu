package lv.rvt;

public class Person {
    private String name;
    private int weight;
    private int height;
    private SimpleDate date;

    public Person(String name, SimpleDate date, int weight, int height) {
        this.name = name;
        this.date = date;
        this.weight = weight;
        this.height = height;
    }

    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Person, the objects are not equal
        if (!(compared instanceof Person comparedPerson)) {
            return false;
        }

        // if the values of the object variables are equal, the objects are equal
        return this.name.equals(comparedPerson.name) &&
                this.date == comparedPerson.date &&
                this.weight == comparedPerson.weight &&
                this.height == comparedPerson.height;

        // otherwise the objects are not equal
    }

    public String toString() {
        return this.name +" "+ this.date +" "+ this.weight +" "+ this.height;
    }

    public String toCsvRow() {
        return this.name +", "+ this.date +", "+ this.weight +", "+ this.height;
    }
}
