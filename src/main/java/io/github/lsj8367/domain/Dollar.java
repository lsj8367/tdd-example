package io.github.lsj8367.domain;

public class Dollar {

    int amount;

    public Dollar(final int amount) {
        this.amount = amount;
    }

    public Dollar times(final int multiplier) {
        return new Dollar(amount * multiplier);
    }

}
