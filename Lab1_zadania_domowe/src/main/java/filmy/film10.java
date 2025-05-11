package filmy;

import java.util.Scanner;

public class film10 {
    public static void main(String[] args) {
        System.out.println("WZORY MATEMATYCZNE");
        System.out.println("Wybierz wzór");
        System.out.println("1) Obwód kwadratu");
        System.out.println("2) Obwód prostokąta");
        Scanner sc = new Scanner(System.in);
        System.out.print("Wybór:");
        int choice = sc.nextInt();
        String chosenOption = switch (choice) {
            case 1 -> {
                System.out.print("Poodaj długość boku kwadratu:");
                int sideLength = sc.nextInt();
                yield ("Obwód kwadratu wynosi: " + (4 * sideLength));
            }
            case 2 -> {
                System.out.print("Podaj dłuość coku a");
                int sideLengthA = sc.nextInt();
                System.out.print("Podaj dłuość coku b");
                int sideLengthB = sc.nextInt();
                yield ("Obwód prostokąta wynosi: " + (2 * sideLengthA + 2 * sideLengthB));
            }
            default -> ("Podano wartość która nie jest opcją.");
        };
        System.out.println(chosenOption);
    }
}
