package StudentDup;

import java.util.Scanner;

class stdmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Students");
        int size = sc.nextInt();
        Student[] S = new Student[size];
        int choice;
        do {
            System.out.println("1:add student  2: edit address  3: display 4:Exit");
            choice = sc.nextInt();
            int index = 0;
            switch (choice) {
                case 1:
                    System.out.println("Enter Roll no:");
                    int stdID = sc.nextInt();
                    if (index < S.length) {
                        if (S[index] != null) {
                            for (int i = 0; i <= index; i++) {
                                if (stdID == S[i].getStudentID()) {
                                    System.out.println("Roll no already Exist or duplicate Entry");
                                    break;
                                }
                                
                            }
                            break;
                        }
                        System.out.println("Enter Firstname,Lastname,address,email,Course");
                        S[index] = new Student(stdID, sc.next(), sc.next(), sc.next(), sc.next(), sc.next());
                        index++;
                    }
                    break;
                case 2:
                    System.out.println("Enter Roll no:");
                    stdID = sc.nextInt();
                    for (int i = 0; i <= index; i++) {
                        if (stdID == S[i].getStudentID()) {
                            System.out.println("Enter address");
                            String nadd = new String(sc.next());
                            S[i].setAddress(nadd);
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i <= index; i++) {
                        System.out.println(S[i].toString());
                    }
                    break;
                case 4:
                    System.out.println("Exited");
                    break;
                default:
                    System.out.println("wrong input");
                    break;

            }
        } while (choice != 4);
        sc.close();
    }
}