package com.company;

/**
 * Trieda Klient vytvara novych klientov a bankove ucty.
 */

public class Klient {

    private int klientskeCislo;
    private int pin;
    private BankovyUcet beznyUcet;
    private BankovyUcet sporiaciUcet;

    /**
     * Zostroji noveho klienta s klientskym cislom a pinom a zostroji sa beznyUcet spolu so sporiaciUcet.
     *
     * @param klientskeCislo klientkse cislo
     * @param pin            pin
     */
    public Klient(int klientskeCislo, int pin) {
        this.klientskeCislo = klientskeCislo;
        this.pin = pin;
        beznyUcet = new BankovyUcet();
        sporiaciUcet = new BankovyUcet();
    }

    /**
     * Vrati objekt beznyUcet typu BankovyUcet.
     * @return objekt beznyUcet typu BankovyUcet
     */
    public BankovyUcet getBeznyUcet() {
        return beznyUcet;
    }

    /**
     * Vrati objekt sporiaciUcet typu BankovyUcet.
     * @return objekt sporiaciUcet typu BankovyUcet
     */
    public BankovyUcet getSporiaciUcet() {
        return sporiaciUcet;
    }

    /**
     * Vrati hodnotu true ak sa hodnoty klientskeCislo a pin rovnaju zadanym hodnotam, inak vrati false.
     *
     * @param klientskeCislo klientske cislo
     * @param pin            pin
     * @return true ak sa hodnoty klientskeCislo a pin rovnaju zadanym hodnotam, inak vrati false
     */
    public boolean jeTotoznyS(int klientskeCislo, int pin) {
        return (this.klientskeCislo == klientskeCislo && this.pin == pin);
    }
}
