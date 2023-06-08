package Exception_Handling;
import java.util.Scanner;
import java.lang.System;
import static Exception_Handling.Logic.validateMoney;
import static Exception_Handling.Logic.validateDate;
public class Tester {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)) {
            System.out.println("Enter Money");
            validateMoney(sc.nextInt());
            System.out.println("Enter Date: dd/mm/yyyy");
            validateDate(sc.next());
        } catch (Exception e) {
            System.out.println("Tester array exception found"+e);
        }
        finally{
            System.out.println("program executed ");
        }
    }
}
