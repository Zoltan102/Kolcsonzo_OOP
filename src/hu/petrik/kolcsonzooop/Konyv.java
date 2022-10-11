package hu.petrik.kolcsonzooop;

public class Konyv implements Kolcsonozheto {
    private String cim;
    private String szerzo;
    private String isbn;

    public Konyv(String cim, String szerzo, String isbn) {
        this.cim = cim;
        this.szerzo = szerzo;
        this.isbn = isbn;
    }

    public String getCim() {
        return cim;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String megjelenitendoNev() {
        return this.szerzo + " - " + this.cim;
    }

    @Override
    public int meddigKolcsonozheto() {
        return 14;
    }
}
