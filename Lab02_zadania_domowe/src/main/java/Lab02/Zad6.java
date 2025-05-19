package Lab02;

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Integer a = wczytajLiczbe();
        Integer b;
        while (true) {
            b = wczytajLiczbe();
            if (b.equals(0)) {
                System.out.println("Nie dzielimy przez 0");
            }
            else {
                break;
            }
        }
        System.out.println("Wynik to: " + (a/b) + " r " + (a%b));
    }

    private static int wczytajLiczbe() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Podaj inta:");
            if (sc.hasNextInt()) {
                return sc.nextInt();
            }
            else {
                System.out.println("To nie był int.");
            }
        }
    }
}
