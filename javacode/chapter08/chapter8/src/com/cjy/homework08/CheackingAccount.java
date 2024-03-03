package com.cjy.homework08;

public class CheackingAccount extends BankAccount{
    public CheackingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        setBalance(getBalance() - 1);
    }
}
