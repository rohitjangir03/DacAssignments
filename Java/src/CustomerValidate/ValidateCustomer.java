package CustomerValidate;

import java.time.LocalDate;

public class ValidateCustomer {

    public static Customer checkCustomer(String firstName, String lastName, String email, String password,
            double registrationAmount, String DOB, String plan, Customer[] customers) throws CustomerException {
        ValidCustomer(email, customers);
        LocalDate dd = validDate(DOB);
        ServicePlan vplan = validPlan(plan);
        double netPrice = registrationAmount + vplan.getCost();
        return new Customer(firstName, lastName, email, password, netPrice, dd, plan);
    }

    public static ServicePlan validPlan(String plan) {
        return ServicePlan.valueOf(plan.toUpperCase());
    }

    public static LocalDate validDate(String Date) throws CustomerException {
        LocalDate d1 = LocalDate.parse(Date);
        LocalDate curdate = LocalDate.now();
        if (d1.isBefore(curdate))
            return d1;
        throw new CustomerException("Date is after current date so its not a valid input");
    };

    public static void ValidCustomer(String email, Customer[] customers) throws CustomerException {
        Customer c = new Customer(email);
        for (Customer v : customers) {
            if (v != null) {
                if (v.equals(c))
                    throw new CustomerException("Duplicate emails");
                System.out.println("No Duplicate");
            }
        }
        System.out.println("No Dup Found");
    }
}
