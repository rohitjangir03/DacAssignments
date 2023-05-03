package CustomerManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;
import static CustomerManagementSystem.validateDetails.validateAll;

public class custTester {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Intializing list
            ArrayList<Customer> custList = new ArrayList<>();
            boolean exit = false;
            while (!exit) {
                System.out.println(
                        "Enter Choice 1:signUp  2:SignIn  3:Change Password  4:Unsubscribe  5:Display all customers  0:exit");
                try {
                    switch (sc.nextInt()) {
                        case 1:
                            System.out.println(
                                    "Enter firstName, lastName, email, password , RegisterdAmount,DOB(yy-mm-dd), Plan ");
                            Customer validCustomr = validateAll(sc.next(), sc.next(), sc.next(), sc.next(),
                                    sc.nextDouble(), sc.next(), sc.next(), custList);
                            custList.add(validCustomr);
                            System.out.println("Customer Added Succesfully");
                            break;
                        case 2:
                            System.out.println("ENter Email Id and Password");
                            Customer em = new Customer(sc.next(),sc.next());
                           // String ps = sc.next();
                            // String ps = sc.next();
                            int index = custList.indexOf(em);
                           // String b = custList.get(index).getPassword();
                            if (index != -1)
                                System.out.println("Login Succesful");
                            throw new custException("Usrr not found");

                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:for(Customer c:custList)
                                  System.out.println(c);
                            break;
                        case 0:
                            exit = true;
                            break;
                        default:
                            break;
                    }
                } catch (Exception e) {
                    e.getStackTrace();
                }
            }

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
