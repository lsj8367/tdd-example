package io.github.lsj8367.domain;

public abstract class Money {
    protected int amount;
    protected String currency;

    public static Money franc(final int amount) {
        return new Franc(amount, "CHF");
    }

    abstract Money times(final int multiplier);
    protected String currency() {
        return currency;
    }

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
            && getClass().equals(money.getClass());
    }


}
