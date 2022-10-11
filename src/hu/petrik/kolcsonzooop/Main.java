package hu.petrik.kolcsonzooop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Kolcsonozheto> katalogus = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 5; i++) {
            Konyv k = new Konyv("Konyv#" + i, "Szerzo#" + i, "k" + i);
            katalogus.add(k);
            Dvd d = new Dvd("Dvd#" + i, (rnd.nextInt(100) + 100));
            katalogus.add(d);
            Ujsag u = new Ujsag("Ujsag#" + i, (rnd.nextInt(23) + 1000), (rnd.nextInt(52) + 1));
            katalogus.add(u);
        }
        for (Kolcsonozheto k : katalogus) {
            System.out.println(k.megjelenitendoNev() + " - " + k.meddigKolcsonozheto());
        }
    }
}
