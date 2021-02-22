package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Trieda Banka vytvara kolekciu s klientami, nacitava data o klientoch a zistuje, ci zadany klient existuje.
 */

public class Banka {

    private List<Klient> klineti;

    /**
     * Vytvori sa prazdna kolekcia klienti.
     */
    public Banka() {
        klineti = new ArrayList<>();
    }

    /**
     * Nacita dany subor s klientami, precita ho a z danych udajov vytvori noveho Klienta.
     *
     * @param suborKlienti subor s datami o klientoch
     * @throws FileNotFoundException vynimka ak sa dany subor nenajde
     */
    public void nacitajKlientov(String suborKlienti) throws FileNotFoundException {
        Scanner vstupZoSuboru = new Scanner(new FileReader(suborKlienti));

        while (vstupZoSuboru.hasNext()) {

            int klientskeCislo = vstupZoSuboru.nextInt();
            int pin = vstupZoSuboru.nextInt();

            Klient klient = new Klient(klientskeCislo, pin);
            pridajKlienta(klient);
        }
    }

    /**
     * Prida klienta do kolekcie klienti.
     *
     * @param klient klient
     */
    private void pridajKlienta(Klient klient) {
        klineti.add(klient);
    }

    /**
     * Vyhlada klienta na zaklade klientskeho cisla a pinu a porovna ho s uz existujucimi klientami v kolekcii klienti,
     * ak ich udaje nie su totozne, vrati hodnotu null.
     *
     * @param klientskeCislo klientske cislo
     * @param pin            pin
     * @return klienta na zaklade klientskeho cisla a pinu
     */
    public Klient vyhladajKlienta(int klientskeCislo, int pin) {
        for (Klient klinet : klineti) {
            if (klinet.jeTotoznyS(klientskeCislo, pin)) {
                return klinet;
            }
        }
        return null;
    }
}
