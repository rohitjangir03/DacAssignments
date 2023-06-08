package EmployeeManagementSystem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

public class IOUtils {
    static void storeDetials(String fileName, Map<String,employee>emps) throws IOException{
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(emps);
        }
    }
  @SuppressWarnings("unchecked")
    static Map<String,employee> reStoreDetails(String fileName) throws IOException,ClassNotFoundException{
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
			return (Map<String, employee>)in.readObject();
		}
       
    }
}
