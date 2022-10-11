package hu.petrik.kolcsonzooop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Kolcsonozheto> katalogus = new ArrayList<>();
        List<Dvd> dvdk = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 5; i++) {
            Konyv k = new Konyv("Konyv#" + i, "Szerzo#" + i, "k" + i);
            katalogus.add(k);
            Dvd d = new Dvd("Dvd#" + i, (rnd.nextInt(100) + 100));
            katalogus.add(d);
            dvdk.add(d);
            Ujsag u = new Ujsag("Ujsag#" + i, (rnd.nextInt(23) + 1000), (rnd.nextInt(52) + 1));
            katalogus.add(u);
        }

        Dvd dvd1 = new Dvd("Star Wars I - Baljós Árnyak", 136);
        Dvd dvd2 = new Dvd("Star Wars II - Klónok támadása", 142);
        Dvd dvd3 = new Dvd("Star Wars III - Sithek bosszúja", 140);
        Dvd dvd4 = new Dvd("Star Wars IV - Új remény", 121);
        Dvd dvd5 = new Dvd("Star Wars V - A birodalom vissza vág", 124);
        Dvd dvd6 = new Dvd("Star Wars VI - A jedi vissza tér", 131);

        dvdk.add(dvd1);
        dvdk.add(dvd2);
        dvdk.add(dvd3);
        dvdk.add(dvd4);
        dvdk.add(dvd5);
        dvdk.add(dvd6);
        for (Kolcsonozheto k : katalogus) {
            System.out.println(k.megjelenitendoNev() + " - " + k.meddigKolcsonozheto());
        }

        System.out.println("------------------------------");

        Collections.sort(dvdk);
        for (Dvd d : dvdk) {
            System.out.println(d.megjelenitendoNev() + " - " + d.meddigKolcsonozheto());
        }
    }
}
