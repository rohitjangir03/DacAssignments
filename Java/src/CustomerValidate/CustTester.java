package CustomerValidate;

import java.util.Scanner;

public class CustTester {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size:");
            int size = sc.nextInt();
            Customer[] c = new Customer[size];
            int index = 0;
            boolean exit = false;
            while (!exit) {
                System.out.println("Enter 1:Add Customer   2:Display Customer   0:Exit");
                switch (sc.nextInt()) {
                    case 1:
                        if (index < c.length) {
                            System.out.println(
                                    "Enter firstName, lastName, email, password , RegisterdAmount,DOB(yy-mm-dd), Plan ");
                            Customer cc = ValidateCustomer.checkCustomer(sc.next(), sc.next(), sc.next(), sc.next(),
                                    sc.nextDouble(), sc.next(), sc.next(), c);
                            c[index++] = cc;
                            System.out.println("new Customer added");
                        }
                        break;
                    case 2:
                        for (Customer d : c) {
                            if (d != null)
                                System.out.println(d);
                        }
                        break;
                    case 0:
                        exit = true;
                        break;
                    default:
                        System.out.println("Wrong Input");
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
