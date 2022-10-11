package hu.petrik.kolcsonzooop;

public class Ujsag implements Kolcsonozheto {
    private String cim;
    private int kiadasEv;
    private int kiadasHet;

    public Ujsag(String cim, int kiadasEv, int kiadasHet) {
        this.cim = cim;
        this.kiadasEv = kiadasEv;
        this.kiadasHet = kiadasHet;
    }

    public String getCim() {
        return cim;
    }

    public int getKiadasEv() {
        return kiadasEv;
    }

    public int getKiadasHet() {
        return kiadasHet;
    }

    @Override
    public String megjelenitendoNev() {
        return cim + " " + kiadasEv + "/" + kiadasHet;
    }

    @Override
    public int meddigKolcsonozheto() {
        return 0;
    }
}
