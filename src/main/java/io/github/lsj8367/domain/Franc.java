package io.github.lsj8367.domain;

public class Franc extends Money {

    public Franc(final int amount, final String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public Money times(final int multiplier) {
        return Money.franc(amount * multiplier);
    }

}
