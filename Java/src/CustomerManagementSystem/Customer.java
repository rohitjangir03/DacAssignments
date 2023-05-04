package CustomerManagementSystem;

import java.time.LocalDate;

public class Customer implements Comparable<Customer> {
    private int custId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private double registrationAmount;
    private LocalDate DOB;
    private String plan;
    private LocalDate lastSubscriptionPaidDate; 
    private static int counter;

    static {
        counter = 1001;
    }

    public Customer( String firstName, String lastName, String email, String password, double registrationAmount, LocalDate DOB, String plan,LocalDate lastSubscriptionPaidDate) {
        this.custId = counter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.registrationAmount = registrationAmount;
        this.DOB = DOB;
        this.plan = plan;
        this.lastSubscriptionPaidDate=lastSubscriptionPaidDate;
    }
    public Customer(String email){
        this.email=email;
    }
    public Customer(String email,String password){
        this.email=email;
        this.password=password;
    }

    public int getCustId() {
        return this.custId;
    }
    public void setLastSubscriptionPaidDate(LocalDate lastSubscriptionPaidDate) {
        this.lastSubscriptionPaidDate = lastSubscriptionPaidDate;
    }
    public LocalDate getLastSubscriptionPaidDate() {
        return this.lastSubscriptionPaidDate;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRegistrationAmount() {
        return this.registrationAmount;
    }

    public void setRegistrationAmount(double registrationAmount) {
        this.registrationAmount = registrationAmount;
    }

    public LocalDate getDOB() {
        return this.DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public String getPlan() {
        return this.plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }
        @Override
    public String toString() {
        return "{" +
            " custId='" + getCustId() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            ", registrationAmount='" + getRegistrationAmount() + "'" +
            ", DOB='" + getDOB() + "'" +
            ", plan='" + getPlan() + "'" +
            "}";
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Customer)
           return this.email.equals(((Customer)o).email);
        return false;
    }
    
    @Override
    public int compareTo(Customer anotherCustomer){
        return this.email.compareTo(anotherCustomer.email);
    }

}