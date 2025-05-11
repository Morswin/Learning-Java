package filmy;

import java.util.Scanner;

public class film8 {
    public static void main(String[] args) {
//        System.out.println("WZORY MATEMATYCZNE");
//        System.out.print("Podaj długość boku kwadratu aby wyliczyć jego obwód: ");
//        Scanner sc = new Scanner(System.in);
//        int sideLength = sc.nextInt();
//        System.out.println("Obwód tego kwadratu to: " + (4 * sideLength));

        System.out.println("WZORY MATEMATYCZNE");
        System.out.print("Podaj długość boków prostokąta aby wyliczyć jego obwód.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj bok a:");
        int sideLengthA = sc.nextInt();
        System.out.print("Podaj bok b:");
        int sideLengthB = sc.nextInt();
        System.out.println("Obwód tego kwadratu to: " + (2 * sideLengthA + 2 * sideLengthB));
    }
}
