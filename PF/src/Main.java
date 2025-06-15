import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        // Sortuję metodą instancji klasy
        String[] names1 = new String[] { "Piotr", "Alojzy", "Marysia"};
        Arrays.sort(names1, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names1));
        // Usuwam nulle metodą statyczną klasy
        ArrayList<String> names2 = new ArrayList<>(Arrays.asList(null, "Piotr", "Alojzy", "Marysia", null));
        names2.removeIf(Objects::isNull);
        System.out.println(names2);
        // Wyświetlam metodą instancji obiektu
        names2.forEach(System.out::println);
    }
}