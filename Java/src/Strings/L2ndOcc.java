package Strings;

import java.util.Scanner;

public class L2ndOcc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = new String(sc.nextLine());
        char[] ch = s.toCharArray();
        System.out.println("Enter character to search");
        char c= sc.next().charAt(0);
        int count=0;
        for(int i=ch.length-1;i>=0;i--){
            if(ch[i]==c){
                count++;
                if(count==2){
                    System.out.println("Index:"+i);
                }
                
            }
        }
         if(count==1){
            System.out.println("only 1 occurence");
         }
         else if(count==0){
             System.out.println("no occurences change input");
         }
        sc.close();
    }
}
