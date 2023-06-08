package BankAccount;

public class Tester {
    public static void main(String[] args) {
        Object acc1 = new Bank(101, "Rohit", "Savings", 1200);
        Object acc2 = new Bank(101, "Rohit Jangir", "Savings", 1300);
        System.out.println(acc2.getClass());
      //  System.out.println(acc1==acc2); //reference equality (holdes different address
        System.out.println(acc1.equals(acc2));
        Object o=100; // autoboxing --> Upcasting
        System.out.println(o.getClass());  // java.lang.Integer
        System.out.println(acc1.equals(o)); // classCastException use instance of in equals then return false
    }
}
