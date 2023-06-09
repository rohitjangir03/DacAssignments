package CustomerValidate;

import java.time.LocalDate;

public class Customer {
    private int custId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private double registrationAmount;
    private LocalDate DOB;
    private String plan;
    private static int counter;

    static {
        counter = 1001;
    }

    public Customer(String firstName, String lastName, String email, String password, double registrationAmount,
            LocalDate dob, String plan) {
        this.custId = counter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.registrationAmount = registrationAmount;
        this.DOB = dob;
        this.plan = plan;
    }

    public Customer(String email) {  //primary key based constructor
        this.email = email;
    }

    public boolean equals(Object o) {
        if (o instanceof Customer)
            return this.email.equals(((Customer) o).email);
        return false;
    }

    public int getCustId() {
        return this.custId;
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

}
