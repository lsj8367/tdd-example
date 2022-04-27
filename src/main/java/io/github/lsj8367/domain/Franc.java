package io.github.lsj8367.domain;

public class Franc extends Money {
    public Franc(final int amount) {
        this.amount = amount;
    }

    @Override
    public Money times(final int multiplier) {
        return new Franc(amount * multiplier);
    }

}
