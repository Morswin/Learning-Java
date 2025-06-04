import java.util.Comparator;

public class Piosenka implements Comparable<Piosenka> {
    private String title;
    private String author;
    private int score;
    private int bmp;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getScore() {
        return score;
    }

    public int getBmp() {
        return bmp;
    }

    public Piosenka(String title, String author, int score, int bmp) {
        this.title = title;
        this.author = author;
        this.score = score;
        this.bmp = bmp;
    }

    @Override
    public int compareTo(Piosenka o) {
        return this.title.compareTo(o.title);
    }

    @Override
    public String toString() {
        return this.title + "\t" + this.author + "\t" + this.score + "\t" + this.bmp;
    }

    @Override
    public int hashCode() {
        return this.title.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
