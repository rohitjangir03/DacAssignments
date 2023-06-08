package EmployeeManagementSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static EmployeeManagementSystem.IOUtils.*;
import static EmployeeManagementSystem.validationRules.validateAll;

public class empTester {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
         Map<String,employee> emps = new HashMap<>();
        System.out.println("Enter File Name");
        emps = reStoreDetails(sc.next());
    
        boolean exit = true;
        while(exit){
                System.out.println("Enter 1:Add Employee  2:List all Details  3:Promote an Emp  4:Delete Employee  "
                +"5:Sort as per joiningDate  0:Exit");
                System.out.println("Enter Choice:");
                switch(sc.nextInt()){
                    case 1:
                           System.out.println("Enter EmpId  FirstName  LastName  Dept  Salary  JoiningDate(yyyy-MM-dd)");
                           String id = sc.next();
                           emps.put(id, validateAll(id, sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(), emps));
                           System.out.println("Employee Added Successfully");
                    break;
                    case 2:
                          emps.values()
                          .forEach(e -> System.out.println(e));
                    break;
                    case 3:
                    break;
                    case 4:
                        System.out.println("Enter the Id to remove");
                         emps.remove(sc.next());  
                    break;
                    case 5:
                          emps.values()
                          .stream()
                          .sorted((e1,e2) -> (e1.getJoinDate().compareTo(e2.getJoinDate())))
                          .forEach(e -> System.out.println(e));
                    break;
                    case 0:
                    System.out.println("Enter File Name");
                    storeDetials(sc.next(),emps);
                    exit = false;
                    break;
                    default:
                    break;
                }
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
