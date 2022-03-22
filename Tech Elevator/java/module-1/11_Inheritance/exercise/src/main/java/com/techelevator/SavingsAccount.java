package com.techelevator;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }
    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        int myBalance = super.getBalance();
        int fineAmount = amountToWithdraw + 2;
        boolean lessThan = ((myBalance - (amountToWithdraw)) < 150);
        boolean failedTransaction = (myBalance - fineAmount) < 0;

        if (lessThan && !failedTransaction) {
            amountToWithdraw = (amountToWithdraw + 2);
        } else if (failedTransaction) {
            amountToWithdraw = 0;
        }

        return super.withdraw(amountToWithdraw);
    }
}
