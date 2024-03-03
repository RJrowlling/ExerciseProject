package com.cjy.homework08;

public class SavingAccount extends CheackingAccount{
    int visa = 0;
    public SavingAccount(double initialBalance) {
        super(initialBalance);
    }

    public void earnMonthlyInterest() {
        setBalance(getBalance()*1.01);
        visa = 3;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        if (visa > 0) {
            visa -= 1;
            setBalance(getBalance() + 1);
        }

    }
}
