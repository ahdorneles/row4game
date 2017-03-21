package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 25/01/17.
 */
public class Main {
    public static void main(String[] args) {
        User user1 = new User("Fred", new Bank("Fred", 10), new Wallet("Fred", 10));



        user1.depositBank(10);
        user1.withdrawBank(5);
        user1.withdrawWallet(5);


        System.out.println("Bank: " + user1.getBankBalance() + " Wallet " + user1.getWalletBalance());




    }


}
