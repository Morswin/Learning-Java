package Lab02;

import java.util.ArrayList;
import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        boolean zakonczPetle = false;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        while (!zakonczPetle) {
            System.out.print("Podaj nastepna liczbe: ");
            int nastepnaLiczba;
            try {
                nastepnaLiczba = sc.nextInt();
                lista.add(nastepnaLiczba);
                if (lista.size() >= 5) {
                    zakonczPetle = true;
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Podano zły format liczby.");
                String next = sc.next();
            }
            catch (Exception e) {
                System.out.println("Podano coś co nie jest liczbą.");
                String next = sc.next();
            }
        }
    }
}
