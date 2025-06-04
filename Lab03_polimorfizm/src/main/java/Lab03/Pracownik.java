package Lab03;

public class Pracownik {
    {
        this.id = Pracownik.przyznajId();
    }
    private static Integer nastepnyId = 1;
    private Integer id;
    private String nazwisko = "Domyślne";
    private Double pensja;
    public Pracownik() {
//        this.nazwisko = "";
        this.pensja = 0.0;
//        this.id = Pracownik.przyznajId();
    }
    public Pracownik(String nazwisko, Double pensja) {
        this.nazwisko = nazwisko;
        this.pensja = pensja;
//        this.id = Pracownik.przyznajId();
    }
    public Pracownik(Double d) {
        // Nie zdążyłem, dokończę potem
    }
    public void podniesPensje(Double wartosc) {
        this.pensja += this.pensja * wartosc;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public String getNazwisko() {
        return this.nazwisko;
    }
    public void setPensja(Double pensja) {
        this.pensja = pensja;
    }
    public Double getPensja() {
        return this.pensja;
    }
    private static Integer przyznajId() {
        Integer i = Pracownik.nastepnyId;
        Pracownik.nastepnyId++;
        return i;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return this.id;
    }
    public static void setNastepnyId(Integer nastepnyId) {
        Pracownik.nastepnyId = nastepnyId;
    }
    public static Integer getNastepnyId() {
        return Pracownik.nastepnyId;
    }
}
