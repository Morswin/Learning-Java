import java.util.Comparator;

public class AuthorCompare implements Comparator<Piosenka> {
    @Override
    public int compare(Piosenka o1, Piosenka o2) {
        return o1.getAuthor().compareTo(o2.getAuthor());
    }
}
