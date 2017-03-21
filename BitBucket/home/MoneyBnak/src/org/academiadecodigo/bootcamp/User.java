package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 25/01/17.
 */
public class User {

    private String name;
    private Bank account;
    private Wallet wallet;

    public User(String name, Bank bank, Wallet wallet) {

        this.account = bank;
        this.wallet = wallet;
        this.name = name;
    }

    public void depositBank( int amount) {
        if (amount > wallet.getBalance()){
            System.out.println("Not enough money, you have in you wallet: " + wallet.getBalance());
            return;
        }
        account.deposit(amount);
        wallet.withdraw(amount);
        System.out.println("After depositing in the bank: " + amount + " in the bank you have: " + account.getBalance() + " and in the wallet: " + wallet.getBalance());
    }

    public void depositWallet( int amount){
        if (amount > account.getBalance()){
            System.out.println("Not enough money, your current account balance is: " + account.getBalance());
            return;
        }
        wallet.deposit(amount);
        account.withdraw(amount);
        System.out.println("After depositing in the wallet: " + amount + " in the bank you have: " + account.getBalance() + " and in the wallet: " + wallet.getBalance());


    }

    public void withdrawBank(int amount){
        if (amount > account.getBalance()){
            System.out.println("Not enough money, your current account balance is: " + account.getBalance());
            return;
        }
        wallet.deposit(amount);
        account.withdraw(amount);
        System.out.println("After withdrawing from the bank: " + amount + " in the bank you have: " + account.getBalance() + " and in the wallet: " + wallet.getBalance());

    }

    public void withdrawWallet(int amount){
        if (amount > wallet.getBalance()){
            System.out.println("Not enough money, you have in you wallet: " + wallet.getBalance());
            return;
        }
        account.deposit(amount);
        wallet.withdraw(amount);
        System.out.println("After withdrawing from the wallet: " + amount + " in the bank you have: " + account.getBalance() + " and in the wallet: " + wallet.getBalance());

    }

    public int getBankBalance(){
        return account.getBalance();
    }
    public int getWalletBalance(){
        return wallet.getBalance();
    }


    public String getName() {
        return name;
    }


}
