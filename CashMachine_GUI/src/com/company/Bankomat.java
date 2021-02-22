package com.company;

/**
 * Trieda Bankomat sluzi na posuvanie / resetovanie jeho stavov, nastavovanie klientkskeho cisla, pinu, typu uctu a zaobstarava transakcie.
 */

public class Bankomat {

    public static final int START = 1;
    public static final int PIN = 2;
    public static final int UCET = 3;
    public static final int TRANSAKCIA = 4;

    public static final Object BEZNY = 1;
    public static final Object SPORIACI = 2;

    private Banka banka;
    private BankovyUcet aktualnyUcet;
    private Klient aktualnyKlient;
    private int stav;
    private int klientskeCislo;

    /**
     * Vytvori novu banku a zrestuje bankomat na zaciatok.
     *
     * @param banka banka
     */
    public Bankomat(Banka banka) {
        this.banka = banka;
        reset();
    }

    /**
     * Vrati hodnotu stav.
     *
     * @return hodnotu stav
     */
    public int getStav() {
        return stav;
    }

    /**
     * Nastavi klientske cislo na danu hodnotu a posunie stav bankomatu na zadanie pinu.
     *
     * @param klientskeCislo klientske cislo
     */
    public void nastavKlientskeCislo(int klientskeCislo) {
        assert stav == START;
        this.klientskeCislo = klientskeCislo;
        stav = PIN;
    }

    /**
     * Nastavi klienta na zaklade zadaneho pinu s predchadzajucim klientskym cislom
     * a posunie stav bankomatu na vyber tupy uctu; ak pin neprislucha ziadnemu klientovi, bankomat sa zrestuje na zaciatok.
     *
     * @param pin pin
     */
    public void nastavKlienta(int pin) {
        assert stav == PIN;
        this.aktualnyKlient = banka.vyhladajKlienta(klientskeCislo, pin);

        if (aktualnyKlient == null) {
            stav = START;
        } else {
            stav = UCET;
        }
    }

    /**
     * Vracia hodnotu true ak dany klient existuje v databaze, inak vrait hodnotu false.
     *
     * @return hodnotu true ak dany klient existuje v databaze, inak vrait hodnotu false
     */
    public boolean jeNastavenySpravnyKlient() {
        if (aktualnyKlient == null) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Nastavi typ uctu na bezný alebo sporiaci a posunie stav bankomatu na transakciu.
     *
     * @param typUctu typ uctu.
     */
    public void nastavTypUctu(Object typUctu) {
        assert stav == UCET || stav == TRANSAKCIA;

        if (typUctu == BEZNY) {
            this.aktualnyUcet = aktualnyKlient.getBeznyUcet();
        } else {
            this.aktualnyUcet = aktualnyKlient.getSporiaciUcet();
        }
        stav = TRANSAKCIA;
    }

    /**
     * Zresetuje bankomat do pociatocneho stavu start pre zadanie noveho klientskeho cisla.
     */
    public void reset() {
        klientskeCislo = -1;
        aktualnyKlient = null;
        stav = START;
    }

    /**
     * Vrati hodnotu aktualnyZostatok z daneho typu uctu, ak je stav bankakomatu na transakcii.
     *
     * @return hodnotu aktualnyZostatok z daneho typu uctu, ak je stav bankakomatu na transakcii
     */
    public double getAktualnyZostatok() {
        assert stav == TRANSAKCIA;
        return aktualnyUcet.getAktualnyZostatok();
    }

    /**
     * Vlozi ciastku na dany typ uctu, ak je stav bankakomatu na transakcii.
     *
     * @param ciastka ciastka
     */
    public void vloz(double ciastka) {
        assert stav == TRANSAKCIA;
        aktualnyUcet.vloz(ciastka);
    }

    /**
     * Vyberie ciastku z daneho typu uctu, ak je stav bankakomatu na transakcii.
     *
     * @param ciastka ciastka
     */
    public void vyber(double ciastka) {
        assert stav == TRANSAKCIA;
        aktualnyUcet.vyber(ciastka);
    }

    /**
     * Nastavi stav bankomatu na predchadzajuci stav.
     */
    public void nastavPredchadzajuciaStav() {
        if (stav == TRANSAKCIA) {
            stav = UCET;
        } else if (stav == UCET) {
            stav = PIN;
        } else if (stav == PIN) {
            stav = START;
        }
    }
}
