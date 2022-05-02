package io.github.lsj8367.domain;

public class Dollar extends Money {

    public Dollar(final int amount, final String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public Money times(final int multiplier) {
        return Money.dollar(amount * multiplier);
    }

}
