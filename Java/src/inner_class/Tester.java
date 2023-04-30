package inner_class;

import java.util.Scanner;

public class Tester {
    // outer class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name  Email  Address");
        String name = sc.next();
        String Email = sc.next();
        String address = sc.nextLine();
        Bank b = new Bank(name, Email, address);
        System.out.println("Need Locker (Y/N)");
        Character c = sc.next().charAt(0);
        if (c.equals('Y')) {
            System.out.println("Enter DUration");
            int d = sc.nextInt();
            b.assignLocker(d);
            System.out.println("locker assigned");
            System.out.println(b);
            sc.close();
        }

    }
}