package AxisBank;

public class BankAccount {
    private int AccId;
    private String customerName;
    private String accountType;
    private double balance;

    public BankAccount(int AccId, String customerName, String accountType, double balance) {
        super();
        this.AccId = AccId;
        this.customerName = customerName;
        this.accountType = accountType;
        this.balance = balance;
    }

    public int getAccId() {
        return this.AccId;
    }

    public void setAccId(int AccId) {
        this.AccId = AccId;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "{" +
                " AccId='" + getAccId() + "'" +
                ", customerName='" + getCustomerName() + "'" +
                ", accountType='" + getAccountType() + "'" +
                ", balance='" + getBalance() + "'" +
                "}";
    }
    @Override
    public boolean equals(Object o){
        System.out.println("Bank equal method");
        if(o instanceof BankAccount)
           return this.AccId==((BankAccount)o).AccId;
        return false;
    }
    @Override
    public int hashCode(){
        System.out.println("hashcode method called");
        return this.AccId;
    }

}
