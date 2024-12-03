package lv.rvt;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        payment = payment - 2.50;
        affordableMeals++;
        this.money += 2.50;
        if (payment < 0) {
            payment = payment + 2.50;
            affordableMeals = affordableMeals - 1;
            return payment;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        payment = payment - 4.30;
        heartyMeals++;
        this.money += 4.30;
        if (payment < 0) {
            payment = payment + 4.30;
            heartyMeals = heartyMeals - 1;
            this.money = this.money - payment;
            return payment;
        }
        return payment;
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
