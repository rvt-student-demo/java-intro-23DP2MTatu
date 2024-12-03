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
            payment += 2.50;
            affordableMeals--;
            return payment;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        payment = payment - 4.30;
        heartyMeals++;
        this.money += 4.30;
        if (payment < 0) {
            payment += 4.30;
            heartyMeals--;
            this.money -= payment;
            return payment;
        }
        return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
        double priceAffordableMeat = 2.50;
        if(card.takeMoney(priceAffordableMeat) == true) {
            card.takeMoney(priceAffordableMeat);
            affordableMeals++;
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        double priceHeartyMeat = 4.30;
        if(card.takeMoney(priceHeartyMeat) == true) {
            card.takeMoney(priceHeartyMeat);
            heartyMeals++;
            return true;
        }
        return false;
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
