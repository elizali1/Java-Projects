package src.drawshapes;

import java.awt.*;

public class BankAccount implements Drawable {
    private double balance;
    private int accountNumber;
    private int x;
    private int y;


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


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
    public BankAccount(double b, int aN, int x, int y){
        this.balance = b;
        this.accountNumber = aN;
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "Bank Account: " + accountNumber+ "has a balance of: "+balance;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.gray);
        g.drawString("Bank Account: "+accountNumber+ " Balance: "+balance, x, y);
    }
}
