package CustomerManagementSystem;

import java.util.ArrayList;
import java.util.List;
import static CustomerManagementSystem.validateDetails.validateAll;

public class data {
   public static  List<Customer> addDataCustomer(){
    try {
        ArrayList<Customer> customerData = new ArrayList<>();
        customerData.add(validateAll("Rohit","Jangir","roh@123","rj",2000,"2000-09-03","gold","2023-04-19",customerData));
        customerData.add(validateAll("Devyani","Soni","dev@123","ds",5000,"1999-10-23","Diamond","2023-04-19",customerData));
        customerData.add(validateAll("yogesh","Pari","yog@123","yo",10000,"2000-10-03","platinum","2023-03-11",customerData));
        customerData.add(validateAll("tamana","pari","tam@123","ta",1000,"2000-10-03","silver","2023-05-01",customerData));
        customerData.add(validateAll("megha","sharma","meg@123","ma",10000,"2000-12-03","platinum","2023-05-03",customerData));
        customerData.add(validateAll("sahil","Soni","sah@123","sa",5000,"2000-12-03","diamond","2023-04-11",customerData));
        customerData.add(validateAll("Sunny","Sen","sun@123","su",2000,"1999-08-03","gold","2023-03-03",customerData));
        customerData.add(validateAll("Suprit","Sharma","sup@123","su",2000,"2001-07-03","gold","2023-02-01",customerData));
        customerData.add(validateAll("Piyush","Meena","piy@123","pi",5000,"2001-07-03","diamond","2023-01-19",customerData));
        customerData.add(validateAll("Nishant","Jain","nis@123","ni",2000,"2000-05-12","gold","2023-04-10",customerData));
        customerData.add(validateAll("Mohit","sid","moh@123","mo",1000,"1999-10-23","silver","2023-01-23",customerData));
        customerData.add(validateAll("Sukumar","singh","suk@123","su",5000,"1998-04-03","diamond","2023-03-20",customerData));
        return customerData;
    } catch (Exception e) {
        e.printStackTrace();
    }
   return null;
   } 
    
}
