package filmy;

import java.util.Scanner;

public class film9 {
    public static void main(String[] args) {
        System.out.println("WZORY MATEMATYCZNE");
        System.out.println("Wybierz wzór");
        System.out.println("1) Obwód kwadratu");
        System.out.println("2) Obwód prostokąta");
        Scanner sc = new Scanner(System.in);
        System.out.print("Wybór:");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.print("Poodaj długość boku kwadratu:");
            int sideLength = sc.nextInt();
            System.out.println("Obwód kwadratu wynosi: " + (4 * sideLength));
        }
        else if (choice == 2) {
            System.out.print("Podaj dłuość coku a");
            int sideLengthA = sc.nextInt();
            System.out.print("Podaj dłuość coku b");
            int sideLengthB = sc.nextInt();
            System.out.println("Obwód prostokąta wynosi: " + (2 * sideLengthA + 2 * sideLengthB));
        }
        else {
            System.out.println("Podano wartość która nie jest opcją.");
        }
    }
}
