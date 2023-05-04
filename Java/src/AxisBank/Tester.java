package AxisBank;

import java.util.HashSet;

public class Tester {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(101, "Rohit", "SAVING", 100000);
        BankAccount b2 = new BankAccount(102, "Devyani", "SAVING", 100000);
        BankAccount b3 = new BankAccount(104, "sunyy", "DEMAT", 900000);
        BankAccount b4 = new BankAccount(102, "Rohit", "CURRENT", 200000);
        BankAccount b5 = new BankAccount(104, "mohit", "SAVING", 300000);
        BankAccount b6 = new BankAccount(103, "Sahil", "DEMAT", 500000);
        BankAccount b7 = new BankAccount(105, "Yogesh", "CURRENT", 200000);
        BankAccount b8 = new BankAccount(106, "Tamana", "SAVING", 300000);
        
        HashSet <BankAccount> newDetails = new HashSet<>();
        System.out.println(newDetails.add(b1));
        System.out.println(newDetails.add(b2));
        System.out.println(newDetails.add(b3));
        System.out.println(newDetails.add(b4));
        System.out.println(newDetails.add(b5));
        System.out.println(newDetails.add(b6));
        System.out.println(newDetails.add(b7));
        System.out.println(newDetails.add(b8));
        System.out.println(newDetails);
        System.out.println(newDetails.size());
    }
}
