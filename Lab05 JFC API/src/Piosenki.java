import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Piosenki {
    public static void main(String[] args) {
        File file = new File("ListaPiosenek.txt");

        ArrayList<Piosenka> dataCollection = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            TreeSet<Piosenka> tempInputData = new TreeSet<>();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                tempInputData.add(new Piosenka(
                        line.split("/")[0],
                        line.split("/")[1],
                        Integer.parseInt(line.split("/")[2]),
                        Integer.parseInt(line.split("/")[3])
                ));
            }

            dataCollection.addAll(tempInputData);
        }
        catch (FileNotFoundException e) {
            System.err.println("Nie znaleziono pliku" + e.getMessage());
        }

        for (Piosenka title : dataCollection) {
            System.out.println(title);
        }

        System.out.println("### Sortuję. ###");
        Collections.sort(dataCollection);

        for (Piosenka title : dataCollection) {
            System.out.println(title);
        }

        System.out.println("### Sortuję po autorach. ###");
        Collections.sort(dataCollection, new AuthorCompare());

        for (Piosenka title : dataCollection) {
            System.out.println(title);
        }
    }
}
