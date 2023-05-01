package BankAccount;

public class Bank {
    private int accNo;
private String name;
private String type;
private double balance;

    public Bank(int accNo, String name, String type, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.type = type;
        this.balance = balance;
    }

    public int getAccNo() {
        return this.accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    @Override
    public boolean equals(Object a){
        if(a instanceof Bank)
        return this.accNo ==((Bank)a).accNo;
        return false;
    }
    @Override
    public String toString() {
        return "{" +
            " accNo='" + getAccNo() + "'" +
            ", name='" + getName() + "'" +
            ", type='" + getType() + "'" +
            ", balance='" + getBalance() + "'" +
            "}";
    }


}
