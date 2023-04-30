package Recursion;

import java.util.Scanner;

public class num1to5 {
    public static void sum(int i) {

        if (i == 0) {
            return;
        }

        System.out.println(i);
        sum(i - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:");
        sum(sc.nextInt());
        sc.close();
    }
}
