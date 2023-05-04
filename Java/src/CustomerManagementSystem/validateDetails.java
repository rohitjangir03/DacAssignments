package CustomerManagementSystem;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;


public class validateDetails {

    public static Customer validateAll(String firstName, String lastName, String email, String password,
            double registrationAmount, String DOB, String plan,String lastSubscriptionPaidDate, List<Customer> customers) throws custException {
        validCust(customers, email);
        validPlan(plan);
        validRamount(registrationAmount, validPlan(plan));
        LocalDate sd = LocalDate.parse(lastSubscriptionPaidDate);
        LocalDate dd = validateMinor(DOB);
        return new Customer(firstName, lastName, email, password, registrationAmount, dd, plan,sd);
    }

    public static void validCust(List<Customer> customers, String email) throws custException {
        // wrap email in customer refer
        Customer newCustomer = new Customer(email);
        if (customers.contains(newCustomer))
            throw new custException("Duplicate Email cant register");
        System.out.println("no duplicate found !!!");
    }

    // add a static method for plan parsing and validation
    public static planenum validPlan(String plan) throws IllegalArgumentException {
        System.out.println(" ----------");
        return planenum.valueOf(plan.toUpperCase());

    }

    public static void validRamount(double RegisterdAmount, planenum validPlanenum) throws custException {
        if (RegisterdAmount != validPlanenum.getCost())
            throw new custException("Invalid Plan");
        System.out.println("valid Plan");
    }

    public static LocalDate validateMinor(String date) throws custException {
        LocalDate DOB = LocalDate.parse(date);
        int ageInYears = Period.between(DOB, LocalDate.now()).getYears();
        if (ageInYears < 21)
            throw new custException("Customer is minor");
        System.out.println("Customer is not minor");
        return DOB;
    }
    //add static method to validate if the subscription date time is more than 3 months or not
    public static int validateSubscriptionDate(String date) throws custException{
        LocalDate subsDate = LocalDate.parse(date);
        int intervalMonths = (int)Period.between(subsDate, LocalDate.now()).toTotalMonths();
        if(intervalMonths>3)
             throw new custException("User subscribed ended");
        System.out.println("having subscription ");
        return intervalMonths;
    }

    // add static method for cusotmer signin
    public static Customer customerLogin(String email, String password, List<Customer> custList) throws custException {
        Customer em = new Customer(email);
        // String ps = sc.next();
        // search customer by email
        int index = custList.indexOf(em);
        if (index == -1)
            throw new custException("Invalid Email");
        if (custList.get(index).getPassword().equals(password))
            System.out.println("Login Succesful");
        else
            throw new custException("User not found , wrong input");

        return new Customer(email, password);
    }
}
