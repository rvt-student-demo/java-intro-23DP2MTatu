package lv.rvt;

public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        if (euros < 0 || cents < 0) {
            this.euros = 0;
            this.cents = 0;    
        } else {
            this.euros = euros;
            this.cents = cents;
        }
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money addition) {
        if (addition.cents() + cents() > 99) {
            Money newMoney = new Money(addition.euros() + euros() +1,addition.cents() + cents() -100);
            return newMoney;
        }
        else {
            Money newMoney = new Money(addition.euros() + euros(),addition.cents() + cents()); // create a new Money object that has the correct worth
            return newMoney;
        }
    }

    public boolean lessThan(Money additon) {
        return (additon.euros() > euros());
    }

    public Money minus(Money addition) {
        if (addition.euros() >= euros()) {
            Money newMoney = new Money(0, 0);
            return newMoney;
        }
        else if (addition.cents > cents()) {
            Money newMoney = new Money(euros()- 1 - addition.euros(), cents() - addition.cents + 100);
            return newMoney;
        }
        else {
            Money newMoney = new Money(euros() - addition.euros(), cents() - addition.cents);
            return newMoney;
        }
    }
}
