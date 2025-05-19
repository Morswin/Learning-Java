package Lab02;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean przerwij = false;
        while (!przerwij) {
            if (sc.hasNextInt()) {
                int i = sc.nextInt();
                if (i == 0) {
                    System.out.println("Nie odwracamy 0.");
                }
                else {
                    System.out.println("Odwrotna to: " + (1/i));
                }
            }
            else {
                System.out.println("podano coś co nie jest intem.");
            }
        }
    }
}
