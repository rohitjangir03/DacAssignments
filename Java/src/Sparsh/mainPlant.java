package Sparsh;

import java.util.Scanner;

public class mainPlant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Plant[] p = new Plant[size];
       
        int index=0;
        int choice;
        do {
            System.out.println("Enter 1:Add Plant  2:Add Flower  3:Add Herb  4:Add Shrub  5:Add Tree"
                    + "   6:Show Plants   7:Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (index < p.length)
                        System.out.println("Enter PlantName , PlantType, LifeSpan, Price");
                    p[index++] = new Plant(sc.next(), sc.next(), sc.next(), sc.nextDouble());
                    break;
                case 2:
                    if (index < p.length)
                        System.out.println("Enter PlantName , PlantType, LifeSpan, Price, Color, Smell");
                    p[index++] = new Flower(sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.next());
                    break;
                case 3:
                    if (index < p.length)
                        System.out.println("Enter PlantName , PlantType, LifeSpan, Price, MedicalUse, Location");
                    p[index++] = new Herb(sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.next());
                    break;
                case 4:
                    if (index < p.length)
                        System.out.println("Enter PlantName , PlantType, LifeSpan, Price, Height, Purpose");
                    p[index++] = new shurb(sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.nextInt(), sc.next());
                    break;
                case 5:
                    if (index < p.length)
                        System.out.println("Enter PlantName , PlantType, LifeSpan, Price, LeafShape, SoilType");
                    p[index++] = new Tree(sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.next());
                    break;
                case 6:
                    for (int i = 0; i < index; i++) {
                        {
                            System.out.println(p[i]);
                        }
                    }
                    break;
              
                case 7:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Wrong Input");
                    break;
            }

        } while (choice != 7);
        sc.close();
    }
}