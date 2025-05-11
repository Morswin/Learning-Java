package Lab01;

import java.util.Scanner;

public class ZLab08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wartości 2 przyprostokątnych.");
        System.out.print("Przyprostokątna a:");
        double a = sc.nextDouble();
        System.out.print("Przyprostokątna b:");
        double b = sc.nextDouble();
        System.out.println("Przeciwprostokątna: " + (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2))));
    }
}
