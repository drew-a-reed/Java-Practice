package com.techelevator;

public class CheckingAccount extends BankAccount{

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }
    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        int myBalance = super.getBalance();
        boolean canWithdraw = ((myBalance - amountToWithdraw) > (-100));
        boolean lessThanZero = ((myBalance - amountToWithdraw) < 0);
        boolean moreThanZero = ((myBalance - amountToWithdraw) > 0);

        if(canWithdraw && lessThanZero){
            amountToWithdraw = amountToWithdraw + 10;
        } else if (canWithdraw && moreThanZero) {
        } else {
            amountToWithdraw = 0;
        }

        return super.withdraw(amountToWithdraw);
    }
}
