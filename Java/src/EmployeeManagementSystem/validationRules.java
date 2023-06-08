package EmployeeManagementSystem;

import java.time.LocalDate;
import java.util.Map;

import Exception_Handling.exception;

public class validationRules {
    public static employee validateAll(String id, String firstName, String lastName, String deptNo, double salary,
            String joinDate, Map<String,employee> emps) throws customException, exception {
        validateEmp(id, emps);
       LocalDate d = validateDate(joinDate);
       dept dep = validateDept(deptNo);
        return new employee(id, firstName, lastName, dep, salary, d);
    }

    public static LocalDate validateDate(String date) throws customException {
        LocalDate d1 = LocalDate.parse(date);
        LocalDate d2 = LocalDate.parse("2020-04-01");
        if (d1.isBefore(d2) && d1.isAfter(LocalDate.now()))
            throw new customException("Date is not vaild kindly use  date between 2020-04-01 to todays date");
        return d1;
    }

    public static dept validateDept(String deptNo) {
        return dept.valueOf(deptNo.toUpperCase());
    }
    
      public static void validateEmp(String id, Map<String,employee> emps) throws customException, exception  {
      if(emps.containsKey(id))
         throw new exception("duplicate id!!!!!");
      }
    
}
