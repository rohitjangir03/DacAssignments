package Revision;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylst {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] data = {10,20,30,40,50,60};
        for(int a:data)
            arr.add(a);
          
        arr.add(10);
        arr.add(80);
        System.out.println(arr);
       System.out.println(arr.get(5));
       System.out.println(arr.set(6, 70));
       System.out.println(arr.remove(7));
       System.out.println(arr);
       Iterator<Integer> ist = arr.iterator();
       while(ist.hasNext()){
        
           ist.next();
    }
    System.out.println(arr);

    }
}
