package Strings;
import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) throws Exception {

      
        Scanner sc = new Scanner(System.in);
        String sb = new String(sc.nextLine());
        char[] ch =sb.toCharArray();
       
        char[] c = new char[ch.length];
        int k=0;
       
        for(int i=ch.length-1;i>=0;i--){
            
             if(ch[i] == ' ' ){
                for(int j=0;j<k/2;j++){
                 char temp = c[j];
                 c[j]=c[k-1-j];
                 c[k-1-j]=temp;
                }
                for(int b=0;b<k;b++){
                System.out.print(c[b]);
                }
                System.out.print(' ');
                k=0;
                i--;
             }
             if(i==0){
                for(int a=0;a<ch.length;a++){
                    if(ch[a]==' '){
                        break;
                    }
                System.out.print(ch[a]);
                }
            }
             c[k]=ch[i];
             ++k;
        }
       
        sc.close();    
    }
   
}
