package Lab03;

import java.util.ArrayList;

public class Zad01 {
    public static void main(String[] args) {
        ArrayList<Pracownik> pracownicy = new ArrayList<Pracownik>();
        pracownicy.add(new Pracownik("", 100.0));
        pracownicy.add(new Pracownik("", 150.0));
        pracownicy.add(new Pracownik("", 200.0));
        for (Pracownik a : pracownicy) {
            System.out.println("Wartość pracownika " + a.getId() + " przed: " + a.getPensja());
            a.podniesPensje(0.05);
            System.out.println("Wartość pracownika " + a.getId() + " po: " + a.getPensja());
        }
    }
}
