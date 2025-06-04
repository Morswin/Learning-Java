package Lab02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean znalezionoZmienna = false;
        Double wartosc;
        while (!znalezionoZmienna) {
            System.out.print("Podaj double: ");
            try {
                wartosc = sc.nextDouble();
                znalezionoZmienna = true;
                System.out.println("Zgadza się, to jest double: " + wartosc);
            }
            catch (InputMismatchException e) {
                System.out.println("Podano nieprawidłowy typ danych.");
                sc.next();
            }
        }
    }
}
