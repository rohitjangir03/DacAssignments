package EmpMngSys;

public class Tester {
    public static void main(String[] args) {
        Emp e = new SalesMgr(); // upcasting
        System.out.println(e.computeSalary());
        System.out.println(e.getClass()); // SalesMgr
        e = new Tempworker(); // 1 object (SalesMgr instance) marked for Garbage Collector
        System.out.println(e.computeSalary());
        System.out.println(e.getClass());// Tempworker
        Object ref;
        ref = e; // upcasting
        System.out.println(ref.getClass()); // TempWorker [Just a copy of Refernce]
        // object class doesn't have computeSalary Method we have to do downcasting explicitly
        System.out.println(((Emp) ref).computeSalary()); // complier is short sited --> downcasting 500
        System.out.println(((Tempworker) ref).computeSalary()); // 500
        if (ref instanceof PermanentWorker)
            System.out.println(((PermanentWorker) ref).computeSalary());// classCastException

            //type of the reference  resolved by Compiler
            // resolve type of instance of object at run time JVM

            //we need to acheive run time polymorphism because we have to deal with indirect referenes and has to reolve 
            // type of instance of objext at runtime
    }
}
