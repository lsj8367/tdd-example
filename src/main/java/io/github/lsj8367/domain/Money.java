package io.github.lsj8367.domain;

public abstract class Money {
    protected int amount;

    abstract Money times(final int multiplier);

    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
            && getClass().equals(money.getClass());
    }
}
