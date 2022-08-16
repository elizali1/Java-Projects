package src;

import java.awt.*;

public class BankAccount implements Drawable{
    private double balance;
    private int accountNumber;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public BankAccount(double b, int aN){
        this.balance = b;
        this.accountNumber = aN;
    }
    public String toString(){
        return "Bank Account: " + accountNumber+ "has a balance of: "+balance;
    }

    @Override
    public void draw(Graphics x) {
        x.drawString("Money", 100,100);
    }
}
