package Strings;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        StringBuilder sb= new StringBuilder(sc.nextLine());
        for (int  i=0;i<sb.length()/2;i++){
            int front =i;
            int back = sb.length()-1-i;
            char fch = sb.charAt(front);
            char bch = sb.charAt(back);
            sb.setCharAt(front, bch);
            sb.setCharAt(back, fch);
        }
        System.out.println(sb);
        sc.close();
    }
}
