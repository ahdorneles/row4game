package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 25/01/17.
 */
public class Wallet {
    private String name;
    private int balance;


    public Wallet(String walletName, int balance) {
        this.name = walletName;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void deposit(int amount) {
        if (amount < 0){
            return;
        }
        balance = balance + amount;

    }

    public int withdraw(int amount){
        if (amount > balance){
            return 0;
        }
        balance = balance - amount;
        return balance;
    }

    public int getBalance() {
        return balance;
    }
}
