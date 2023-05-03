package CustomerManagementSystem;

import java.time.LocalDate;
import java.util.List;

public class validateDetails {
     
    public static Customer validateAll(String firstName, String lastName, String email, String password, double registrationAmount, String DOB, String plan,List<Customer> customers) throws custException{
      validCust(email, customers);
      validPlan(plan);
      validRamount(registrationAmount, plan);
      LocalDate dd = validateMinor(plan);
      return new Customer(firstName, lastName, email, password, registrationAmount, dd, plan);
    }
     
    public static void validCust(String email , List<Customer> customers) throws custException{
        Customer c = new Customer(email);
        if(customers.contains(c))
           throw new custException("Duplicate Email cant register");
        System.out.println("no duplicate found !!!");
    }
    public static planenum validPlan(String plan)throws IllegalArgumentException {
        System.out.println(" ----------");
        return planenum.valueOf(plan.toUpperCase());
        
    }

    public static void validRamount(double RegisterdAmount,String Plan) throws custException{
     double amt = planenum.valueOf(Plan.toUpperCase()).getCost();
     if(RegisterdAmount!=amt)
         throw new custException("Invalid Plan");
       System.out.println("valid Plan");
    }

     public static LocalDate validateMinor(String Date) throws custException{
            LocalDate DOB = LocalDate.parse(Date);
            LocalDate curDate = LocalDate.now();
            if(curDate.getYear()-DOB.getYear()<18 )
               throw new custException("Customer is minor");
            System.out.println("Customer is not minor");
            return DOB;
     }

 }
