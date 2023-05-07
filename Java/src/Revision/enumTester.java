package Revision;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class enumTester {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
        LocalDate d1= LocalDate.parse("2022-10-10");
        Long intervalMonths = Period.between(d1, LocalDate.now()).toTotalMonths();
        System.out.println(intervalMonths);

    //    int years = (int)Period.between(d1, LocalDate.now()).toTotalMonths();
    //    System.out.println(years);
    
        } catch (Exception e) {
          e.printStackTrace();
        } 
    }
}
