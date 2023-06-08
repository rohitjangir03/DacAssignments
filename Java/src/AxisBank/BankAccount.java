package AxisBank;

public class BankAccount {
    private int AccId;
    private String customerName;
    private AccountType accountType;
    private double balance;

    public BankAccount(int AccId, String customerName, AccountType accountType, double balance) {
        super();
        this.AccId = AccId;
        this.customerName = customerName;
        this.accountType = accountType;
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return this.accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "{" +
                " AccId='" +this.AccId+ "'" +
                ", customerName='" + this.customerName + "'" +
                ", accountType='" + getAccountType() + "'" +
                ", balance='" + this.balance + "'" +
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
