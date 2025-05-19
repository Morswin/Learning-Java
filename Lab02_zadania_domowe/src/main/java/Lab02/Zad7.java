package Lab02;

import java.beans.Introspector;
import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Integer a = wczytajLiczbe();
        Integer b = wczytajLiczbe();
        Scanner sc = new Scanner(System.in);
        String z;
        while (true) {
            System.out.print("Podaj operację (+ - * /): ");
            z = sc.next();
            if (z.equals("+") || z.equals("-") || z.equals("/") || z.equals("*")) {
                break;
            }
            else {
                System.out.println("Nie ma takiego znaku operacji.");
            }
        }
        switch (z) {
            case "+" -> {
                System.out.println("a + b = " + (a + b));
            }
            case "-" -> {
                System.out.println("a - b = " + (a - b));
            }
            case "*" -> {
                System.out.println("a * b = " + ( a * b));
            }
            case "/" -> {
                if (b.equals(0)) {
                    System.out.println("Próbowano podzielić przez 0");
                }
                else {
                    System.out.println("a / b = " + (a / b));
                }
            }
        }
    }

    private static int wczytajLiczbe() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Podaj inta:");
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.println("To nie był int.");
            }
        }
    }
}
