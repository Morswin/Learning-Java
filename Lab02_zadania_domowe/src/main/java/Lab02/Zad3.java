package Lab02;

import java.util.ArrayList;
import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean zakonczPetle = false;
        ArrayList<Integer> lista = new ArrayList<>();
        while (!zakonczPetle) {
            System.out.print("Podaj inta: ");
            if (sc.hasNextInt()) {
                lista.add(sc.nextInt());
                if (lista.size() >= 5) {
                    zakonczPetle = true;
                }
            }
            else {
                System.out.println("To nie int.");
                sc.next();
            }
        }
    }
}
