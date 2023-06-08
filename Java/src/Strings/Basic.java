package Strings;
import java.util.Scanner;
import static java.lang.System.*;
public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
         out.println("Enter String");
        String s = new String(sc.next());
       // converting String to char
        char[] ch = s.toCharArray();
        //using forEach for iteration
            for(char c:ch){
                out.print(c+" ");
            } 
            char temp;
            //Doing reverse of String using char
            for(int i=0; i<ch.length/2;i++){
                temp = ch[i];
                ch[i]=ch[ch.length-1-i];
                ch[ch.length-1-i]=temp;
            }
            out.println("------------------------------");
            for(char c:ch){
                System.out.print(c+" ");
            } 
            System.out.println("  ");
            System.out.println(ch[ch.length]);
            // Converting charArray to String

            String f = new String(ch);
            out.println(f);
            sc.close(); 
            Integer i1 = Integer.valueOf(230); // boxing (primitive --> wrapper)
            out.println("i1:"+i1);    
            int data = i1.intValue();  // unboxing(wrapper --> primitive)
            out.println("data:"+data);     
            i1=12345;          //  autoboxing
            out.println("i1:"+i1);
            String s4 = "123456";  
            out.println(s4);
            i1++;   //autounboxing -->int (Increment++)--> autoboxing
            out.println("i1:"+i1);
            Double d1 = 123.456;  //autoboxing double --> Double
            Double d2 = d1++;     //autounboxing (D-d)--> inc(++) --> autoboxing
            out.println("d1:"+d1);  
            out.println("d2:"+d2);
            double d3 = 123.45f;   //no difference between f and F  , widening float to dobule
            out.println("d3:"+d3);
            Double d4 = (double)123.456f;   // widening --> autoboxing
            out.println("d4:"+d4); 
            Number n = 123.456f;   // autoboxing (float to Float)--> upcasting(Float to Number)
            out.println("n:"+n);
            out.println(n.getClass());  // java.lang.Float
            Object o = true;     //autoboxing(boolean to Boolean) --> upcasting (Boolean to Object)
            out.println("O:"+o); 
            o=100;             
            out.println("O:"+o);
            o=456.789;
            out.println("O:"+o);
            out.println(o.getClass()); // java.lang.Double
}
}