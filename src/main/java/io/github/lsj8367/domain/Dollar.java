package io.github.lsj8367.domain;

public class Dollar extends Money {

    public Dollar(final int amount) {
        this.amount = amount;
    }

    @Override
    public Money times(final int multiplier) {
        return new Dollar(amount * multiplier);
    }

}
