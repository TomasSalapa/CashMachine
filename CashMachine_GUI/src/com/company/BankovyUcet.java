package com.company;

/**
 * Trieda predstavuje vymysleny bankovy ucet so zakladnou funkcionalitou
 * vkladu, vyberu a vypisu zostatku na ucte.
 */
public class BankovyUcet {

    private double aktualnyZostatok;

    /**
     * Vytvori novy bankovy ucet so zadanym pociatocnym zostatkom.
     *
     * @param pociatocnyZostatok pociatocny zostatok
     */
    public BankovyUcet(double pociatocnyZostatok) {
        aktualnyZostatok = pociatocnyZostatok;
    }

    /**
     * Vytvori prazdny bankovy ucet s aktualnym zostatkom 0.
     */
    public BankovyUcet() {
        aktualnyZostatok = 0;
    }

    /**
     * Vlozi na ucet zadanu sumu penazi.
     *
     * @param suma ciastka penazi, ktora sa vlozi na ucet.
     */
    public void vloz(double suma) {
        aktualnyZostatok = aktualnyZostatok + suma;
    }

    /**
     * Vyberie z uctu zadanu sumu penazi.
     *
     * @param suma ciastka penazi, ktora sa vyberie z uctu.
     */
    public void vyber(double suma) {
        aktualnyZostatok = aktualnyZostatok - suma;
    }

    /**
     * Vypise aktualny zostatok na ucte na standardny vystup.
     */
    public void vypis() {
        System.out.println("Aktalny zostatok na ucte je: " + aktualnyZostatok + " EUR.");
    }

    /**
     * Vrati hodnotu aktualnyZostatok.
     * @return hodnotu aktualnyZostatok
     */
    public double getAktualnyZostatok() {
        return aktualnyZostatok;
    }
}
