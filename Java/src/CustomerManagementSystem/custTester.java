package CustomerManagementSystem;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;

import static CustomerManagementSystem.data.addDataCustomer;
import static CustomerManagementSystem.validateDetails.*;

public class custTester {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Intializing list
            // ArrayList<Customer> custList = new ArrayList<>();
            // calling data.java to add hardcoded customers
            List<Customer> custList = addDataCustomer();
            System.out.println("");
            boolean exit = false;
            while (!exit) {
                System.out.println(
                        "Enter Choice 1:signUp  2:SignIn  3:Change Password  4:Unsubscribe "
                                + "5:Display all customers 6.Sort data by Email  7:Sort by dob,regAmount using external class"
                                + "8:Sort by dob,regAmount using Inner   9:Pay subscription class 0:exit");
                try {

                    switch (sc.nextInt()) {
                        case 1:
                            System.out.println(
                                    "Enter firstName, lastName, email, password , RegisterdAmount,DOB(yy-mm-dd), Plan ");
                            Customer validCustomr = validateAll(sc.next(), sc.next(), sc.next(), sc.next(),
                                    sc.nextDouble(), sc.next(), sc.next(),sc.next(), custList);
                            custList.add(validCustomr); // to add valid customer after validation
                            System.out.println("Customer Added Succesfully");
                            break;
                        case 2:
                            // Login using email and Password
                            System.out.println("ENter Email Id and Password");
                            validCustomr = customerLogin(sc.next(), sc.next(), custList);
                            break;

                        case 3:
                            // System.out.println("Enter Email for Verfication to change Password");
                            // Customer chngePs = new Customer(sc.next());
                            // int indx = custList.indexOf(chngePs);
                            // if (indx != -1) {
                            // System.out.println("Enter new Password");
                            // chngePs.setPassword(sc.next());
                            // System.out.println("Password Changed Successfully");
                            // }/
                            // changing password after loging in
                            System.out.println("Enter Email , Password for Password Change");
                            validCustomr = customerLogin(sc.next(), sc.next(), custList);
                            System.out.println("Enter new Password");
                            validCustomr.setPassword(sc.next());
                            break;
                        case 4:
                            // removing user after login
                            System.out.println("Enter Email and Password to delete customer");
                            validCustomr = customerLogin(sc.next(), sc.next(), custList);
                            int index = custList.indexOf(validCustomr);
                            custList.remove(index);
                            System.out.println("User removed Succesfully");
                            break;
                        case 5:
                            /*
                             * for(Customer c:custList)
                             * System.out.println(c);
                             */
                            Iterator<Customer> itr = custList.iterator();
                            while (itr.hasNext())
                                System.out.println(itr.next());
                            break;
                        case 6:
                            // sorting based on primary key (email) natural ,natural sort
                            Collections.sort(custList);
                            break;
                        case 7:
                            // sorting based on dob and registration Amount using customer sort external
                            // class method
                            Collections.sort(custList, new CustomSort());
                            break;
                        case 8:
                            // sorting based on dob and registration Amount using customer sort annonymus
                            // inner class method
                            Collections.sort(custList, new Comparator<Customer>() {
                                @Override
                                public int compare(Customer c1, Customer c2) {
                                    int in = c1.getDOB().compareTo(c2.getDOB());
                                    if (in == 0) {
                                       /*  if (c1.getRegistrationAmount() < c2.getRegistrationAmount())
                                            return -1;
                                        if (c1.getRegistrationAmount() == c2.getRegistrationAmount())
                                            return 0;
                                        else
                                            return 1; */
                                        return ((Double)c1.getRegistrationAmount()).compareTo(c2.getRegistrationAmount());
                                    }
                                    return in;
                                }
                            });
                            break;
                        case 9: 
                             System.out.println("Enter email id and password to login for paying the amount");
                             validCustomr = customerLogin(sc.next(), sc.next(), custList);
                                    
                            break;
                        case 0:
                            exit = true;
                            break;
                        default:
                            break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    sc.nextLine();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}