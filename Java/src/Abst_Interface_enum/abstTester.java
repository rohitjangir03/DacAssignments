package Abst_Interface_enum;

public class abstTester {
    public static void main(String[] args) {
        abst a;
        a = new character(1001, "Zeimi", "Herb",3, "blueish-Green");
        System.out.println(a.getDetails());

        character c = new character(1002, "Moonlight", "Tree", 60, "Greeenosh");
        System.out.println(c.getDetails());
    }



}
