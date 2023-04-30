package Abst_Interface_enum;

public class interTester implements Interf1, inter2 {
    public void show() {
        System.out.println("1");
    }
    public void display() {
        System.out.println("Display succesfully");
    }
    public static void main(String[] args) {
        interTester t = new interTester();
        t.show();
        t.display();
    }
}
