package io.github.lsj8367.domain;

public class Dollar {

    private final int amount;

    public Dollar(final int amount) {
        this.amount = amount;
    }

    public Dollar times(final int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object object) {
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }
}
