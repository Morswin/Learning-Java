package org.example;

public class FractionIN {
    private int licznik;
    private int mianownik;

    FractionIN(int licznik, int mianownik) {
        if (mianownik == 0) {
            throw new IllegalArgumentException("parametr n=0!");
        }
        this.licznik = licznik;
        this.mianownik = mianownik;
    }

    FractionIN() {
        this.licznik = 0;
        this.mianownik = 1;
    }

    FractionIN(int licznik) {
        this.licznik = licznik;
        this.mianownik = 1;
    }

    FractionIN(FractionIN frac) {
        this.licznik = frac.getLicznik();
        this.mianownik = frac.getMianownik();
    }

    public String toString() {
        return "%d/%d";
    }

    public int getLicznik() {
        return this.licznik;
    }

    public int getMianownik() {
        return this.mianownik;
    }

    public void setLicznik(int licznik) {
        this.licznik = licznik;
    }

    public void setMianownik(int mianownik) {
        if (mianownik == 0) {
            throw new IllegalArgumentException("parametr n=0!");
        }
        this.mianownik = mianownik;
    }

    public void setFrac(int licznik, int mianownik) {
        if (mianownik == 0) {
            throw new IllegalArgumentException("parametr n=0!");
        }
        this.licznik = licznik;
        this.mianownik = mianownik;
    }
}
