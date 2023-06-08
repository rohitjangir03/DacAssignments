package EmployeeManagementSystem;
import static EmployeeManagementSystem.validationRules.validateAll;

import java.util.HashMap;
import java.util.Map;

public class empData {
    public static Map<String, employee> populateEmployee(){
        Map<String, employee> emps = new HashMap<>();
        try {
            emps.put("101",validateAll("101", "Arun", "Shah", "rnd", 70000.00, "2021-10-10", emps));
            emps.put("103",validateAll("103", "Rohit", "Jangir", "rnd", 70000.00, "2021-10-10", emps));
            emps.put("104",validateAll("104", "Devyani", "Soni", "rnd", 70000.00, "2021-10-10", emps));
            emps.put("105",validateAll("105", "Arun", "Shah", "rnd", 70000.00, "2021-10-10", emps));
            emps.put("106",validateAll("106", "Arun", "Shah", "rnd", 70000.00, "2021-10-10", emps)); 
            emps.put("107",validateAll("107", "Arun", "Shah", "rnd", 70000.00, "2021-10-10", emps)); 
            emps.put("108",validateAll("108", "Arun", "Shah", "rnd", 70000.00, "2021-10-10", emps));
            emps.put("109",validateAll("109", "Arun", "Shah", "rnd", 70000.00, "2021-10-10", emps));
            emps.put("110",validateAll("110", "Arun", "Shah", "rnd", 70000.00, "2021-10-10", emps));
            emps.put("111",validateAll("111", "Arun", "Shah", "rnd", 70000.00, "2021-10-10", emps));
            emps.put("112",validateAll("112", "Arun", "Shah", "rnd", 70000.00, "2021-10-10", emps));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return emps;
    }
}
