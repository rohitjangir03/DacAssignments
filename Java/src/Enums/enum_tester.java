package Enums;

import java.util.Scanner;

public class enum_tester {
    /*
     * public static void main(String[] args) {
     * // e1[] e = e1.values() ;
     * Scanner sc = new Scanner(System.in);
     * String s= sc.next().toUpperCase();
     * e1 u=e1.valueOf(s);
     * System.out.println("All Colors:");
     * System.out.println(u);
     * System.out.println(u.ordinal());
     * for (e1 i : e1.values()) {
     * System.out.println(i);
     * }
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // how to trigger loading of enum type?
        
        int bill = 0;
        
                // display food Color along with its price
                // values -- Color[]
                /* System.out.println("Color :");
                for (Color m : Color.values())
                    System.out.println(m);
 */
                // valueOf to convert String ---enum
                System.out.println("Enter color:");
                Color m = Color.valueOf(sc.next().toUpperCase());
                System.out.println("Pls enter food item n quantity");
                int qty = sc.nextInt();
                // enums can be used as a switch argument
                switch (m) {
                    case GOLD:
                        break;
                    case PLATINUM:
                        break;
                    case SILVER:
                        bill += (qty * m.getPrice());
                        break;
                    default:
                        break;
                }

            
                System.out.println("Generating Bill");
           
        
        System.out.println("Total Bill " + bill);
        
            sc.close();

    }
}
