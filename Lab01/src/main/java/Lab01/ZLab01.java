package Lab01;

public class ZLab01 {
    public static void main(String[] args) {
        System.out.println("Kody liczbowe i odpowiadające im znaki");
        for (int i = 48; i <= 124; i++) {
            System.out.println("Kod " + i + " odpowiada znakowi: " + (char)i);
        }
    }
}
