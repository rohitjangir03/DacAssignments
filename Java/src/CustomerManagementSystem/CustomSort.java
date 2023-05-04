package CustomerManagementSystem;

import java.util.Comparator;

public class CustomSort implements Comparator<Customer>{
    public int compare(Customer c1,Customer c2){
        int in =c1.getDOB().compareTo(c2.getDOB());
        if(in ==0 ){
        if(c1.getRegistrationAmount()<c2.getRegistrationAmount())
              return -1;
        if(c1.getRegistrationAmount()==c2.getRegistrationAmount())
              return 0; 
        else
              return 1;
        }
        return in;
            
        
    }
}
