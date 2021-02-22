package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Trieda BankomatTester pracuje so vsetkymi ostatnymi triedami a funguje ako simulacia realneho nekonciaceho-sa bankomatu.
 */
public class BankomatTester {

    public static void main(String[] args) throws InterruptedException {

        JFrame okno = new JFrame();
        okno.setSize(540, 350);
        okno.setTitle("Narodna Banka Slovenska");
        okno.setLocationRelativeTo(null);
        okno.setResizable(false);

        ArrayList<String> pocetZnakov = new ArrayList<>();

        JTextField textovePoleCisla = new JTextField();
        textovePoleCisla.setEditable(false);
        textovePoleCisla.setBackground(Color.WHITE);
        textovePoleCisla.setBounds(20, 20, 150, 20);

        JTextArea textovePoleBankomat = new JTextArea();
        textovePoleBankomat.setEditable(false);
        textovePoleBankomat.setBounds(180, 50, 250, 200);

        JButton tlacitko1 = new JButton("1");
        tlacitko1.setBounds(20, 50, 50, 50);
        JButton tlacitko2 = new JButton("2");
        tlacitko2.setBounds(70, 50, 50, 50);
        JButton tlacitko3 = new JButton("3");
        tlacitko3.setBounds(120, 50, 50, 50);
        JButton tlacitko4 = new JButton("4");
        tlacitko4.setBounds(20, 100, 50, 50);
        JButton tlacitko5 = new JButton("5");
        tlacitko5.setBounds(70, 100, 50, 50);
        JButton tlacitko6 = new JButton("6");
        tlacitko6.setBounds(120, 100, 50, 50);
        JButton tlacitko7 = new JButton("7");
        tlacitko7.setBounds(20, 150, 50, 50);
        JButton tlacitko8 = new JButton("8");
        tlacitko8.setBounds(70, 150, 50, 50);
        JButton tlacitko9 = new JButton("9");
        tlacitko9.setBounds(120, 150, 50, 50);
        JButton tlacitko0 = new JButton("0");
        tlacitko0.setBounds(20, 200, 50, 50);
        JButton tlacitkoBodka = new JButton(".");
        tlacitkoBodka.setBounds(70, 200, 50, 50);
        JButton tlacitkoVynulovat = new JButton("CE");
        tlacitkoVynulovat.setBounds(120, 200, 50, 50);
        JButton tlacitkoA = new JButton("A");
        tlacitkoA.setBounds(460, 75, 50, 50);
        JButton tlacitkoB = new JButton("B");
        tlacitkoB.setBounds(460, 125, 50, 50);
        JButton tlacitkoC = new JButton("C");
        tlacitkoC.setBounds(460, 175, 50, 50);

        JPanel panel = new JPanel();
        panel.setLayout(null);      // layout manager je null, aby sa dali komponenty manualne nakonfigurovat
        panel = new JPanel();
        panel.setLayout(null);
        panel.add(tlacitko1);
        panel.add(tlacitko2);
        panel.add(tlacitko3);
        panel.add(tlacitko4);
        panel.add(tlacitko5);
        panel.add(tlacitko6);
        panel.add(tlacitko7);
        panel.add(tlacitko8);
        panel.add(tlacitko9);
        panel.add(tlacitko0);
        panel.add(tlacitkoBodka);
        panel.add(tlacitkoVynulovat);
        panel.add(tlacitkoA);
        panel.add(tlacitkoB);
        panel.add(tlacitkoC);

        JScrollPane posuvniky = new JScrollPane(textovePoleBankomat,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        posuvniky.setBounds(180, 50, 270, 220);

        panel.add(posuvniky);
        panel.add(textovePoleCisla);

        okno.add(panel);

        class Tlacitko1 implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                textovePoleCisla.setText(textovePoleCisla.getText() + "1");
                pocetZnakov.add("1");
            }
        }

        class Tlacitko2 implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                textovePoleCisla.setText(textovePoleCisla.getText() + "2");
                pocetZnakov.add("2");
            }
        }

        class Tlacitko3 implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                textovePoleCisla.setText(textovePoleCisla.getText() + "3");
                pocetZnakov.add("3");
            }
        }
        class Tlacitko4 implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                textovePoleCisla.setText(textovePoleCisla.getText() + "4");
                pocetZnakov.add("4");
            }
        }
        class Tlacitko5 implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                textovePoleCisla.setText(textovePoleCisla.getText() + "5");
                pocetZnakov.add("5");
            }
        }
        class Tlacitko6 implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                textovePoleCisla.setText(textovePoleCisla.getText() + "6");
                pocetZnakov.add("6");
            }
        }
        class Tlacitko7 implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                textovePoleCisla.setText(textovePoleCisla.getText() + "7");
                pocetZnakov.add("7");
            }
        }
        class Tlacitko8 implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                textovePoleCisla.setText(textovePoleCisla.getText() + "8");
                pocetZnakov.add("8");
            }
        }
        class Tlacitko9 implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                textovePoleCisla.setText(textovePoleCisla.getText() + "9");
                pocetZnakov.add("9");
            }
        }
        class Tlacitko0 implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                textovePoleCisla.setText(textovePoleCisla.getText() + "0");
                pocetZnakov.add("0");
            }
        }

        class TlacitkoBodka implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                textovePoleCisla.setText(textovePoleCisla.getText() + ".");
                pocetZnakov.add(".");
            }
        }

        class TlacitkoVynulovat implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                textovePoleCisla.setText(null);
                pocetZnakov.clear();
            }
        }

        ActionListener posluchac1 = new Tlacitko1();
        tlacitko1.addActionListener(posluchac1);

        ActionListener posluchac2 = new Tlacitko2();
        tlacitko2.addActionListener(posluchac2);

        ActionListener posluchac3 = new Tlacitko3();
        tlacitko3.addActionListener(posluchac3);

        ActionListener posluchac4 = new Tlacitko4();
        tlacitko4.addActionListener(posluchac4);

        ActionListener posluchac5 = new Tlacitko5();
        tlacitko5.addActionListener(posluchac5);

        ActionListener posluchac6 = new Tlacitko6();
        tlacitko6.addActionListener(posluchac6);

        ActionListener posluchac7 = new Tlacitko7();
        tlacitko7.addActionListener(posluchac7);

        ActionListener posluchac8 = new Tlacitko8();
        tlacitko8.addActionListener(posluchac8);

        ActionListener posluchac9 = new Tlacitko9();
        tlacitko9.addActionListener(posluchac9);

        ActionListener posluchac0 = new Tlacitko0();
        tlacitko0.addActionListener(posluchac0);

        ActionListener posluchacBodka = new TlacitkoBodka();
        tlacitkoBodka.addActionListener(posluchacBodka);

        ActionListener posluchacVynulovat = new TlacitkoVynulovat();
        tlacitkoVynulovat.addActionListener(posluchacVynulovat);

        Bankomat bankomat;
        final String SUBOR_S_KLIENTAMI = "klienti.txt";

        Banka banka = new Banka();

        try {
            banka.nacitajKlientov(SUBOR_S_KLIENTAMI);
        } catch (FileNotFoundException vynimka) {
            System.out.println("Chyba pri otvarani suboru: " + SUBOR_S_KLIENTAMI + "\n");
            System.exit(0);
        }

        bankomat = new Bankomat(banka);

        List<String> holder = new LinkedList<>();

        okno.setVisible(true);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        class TlacitkoA1 implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                synchronized (holder) {
                    holder.add(textovePoleCisla.getText());
                    holder.notify();
                    bankomat.nastavKlientskeCislo(Integer.parseInt(textovePoleCisla.getText()));
                    textovePoleCisla.setText("");
                }
            }
        }

        ActionListener posluchacA1 = new TlacitkoA1();


        class TlacitkoA2 implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                synchronized (holder) {
                    holder.add(textovePoleCisla.getText());
                    holder.notify();
                    bankomat.nastavKlienta(Integer.parseInt(textovePoleCisla.getText()));
                    textovePoleCisla.setText("");
                    if (!bankomat.jeNastavenySpravnyKlient()) {
                        textovePoleBankomat.append("Zadali ste nespravny PIN!\n\n");
                    }
                }
            }
        }

        ActionListener posluchacA2 = new TlacitkoA2();


        class TlacitkoA3 implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                synchronized (holder) {
                    holder.add("a");
                    holder.notify();

                    if (holder.contains("a")) {
                        bankomat.nastavTypUctu(Bankomat.BEZNY);
                        textovePoleBankomat.append("Zvolili ste bezny ucet.\n");
                    }
                }
            }
        }

        ActionListener posluchacA3 = new TlacitkoA3();

        class TlacitkoB1 implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                synchronized (holder) {
                    holder.add("b");
                    holder.notify();

                    if (holder.contains("b")) {
                        bankomat.nastavTypUctu(Bankomat.SPORIACI);
                        textovePoleBankomat.append("Zvolili ste sporiaci ucet.\n");
                    }
                }
            }
        }

        ActionListener posluchacB1 = new TlacitkoB1();

        class TlacitkoC1 implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                synchronized (holder) {
                    holder.add("c");
                    holder.notify();

                    if (holder.contains("c")) {
                        bankomat.reset();
                    }
                }
            }
        }

        ActionListener posluchacC1 = new TlacitkoC1();

        class TlacitkoA4 implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                synchronized (holder) {
                    holder.add("a");
                    holder.notify();

                    if (holder.contains("a")) {
                        bankomat.vloz(Double.parseDouble(textovePoleCisla.getText()));
                        textovePoleBankomat.append("Vlozili ste sumu: " + textovePoleCisla.getText() + " EUR.\n\n");
                        bankomat.nastavPredchadzajuciaStav();
                        textovePoleCisla.setText("");
                    }
                }
            }
        }

        ActionListener posluchacA4 = new TlacitkoA4();

        class TlacitkoB2 implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                synchronized (holder) {
                    holder.add("b");
                    holder.notify();

                    if (holder.contains("b")) {
                        bankomat.vyber(Double.parseDouble(textovePoleCisla.getText()));
                        textovePoleBankomat.append("Vybrali ste sumu: " + textovePoleCisla.getText() + " EUR.\n\n");
                        bankomat.nastavPredchadzajuciaStav();
                        textovePoleCisla.setText("");
                    }
                }
            }
        }

        ActionListener posluchacB2 = new TlacitkoB2();

        class TlacitkoC2 implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                synchronized (holder) {
                    holder.add("c");
                    holder.notify();

                    if (holder.contains("c")) {
                        bankomat.nastavPredchadzajuciaStav();
                    }
                }
            }
        }

        ActionListener posluchacC2 = new TlacitkoC2();


        while (true) {

            int stav = bankomat.getStav();

            if (stav == Bankomat.START) {
                textovePoleBankomat.append("Zadaj klientske cislo. \n" + "A = OK\n\n");

                tlacitkoA.addActionListener(posluchacA1);

                tlacitkoA.removeActionListener(posluchacA2);
                tlacitkoA.removeActionListener(posluchacA3);
                tlacitkoB.removeActionListener(posluchacB1);
                tlacitkoC.removeActionListener(posluchacC1);
                tlacitkoA.removeActionListener(posluchacA4);
                tlacitkoB.removeActionListener(posluchacB2);
                tlacitkoC.removeActionListener(posluchacC2);


            } else if (stav == Bankomat.PIN) {
                tlacitkoA.removeActionListener(posluchacA1);
                tlacitkoA.addActionListener(posluchacA2);

                textovePoleBankomat.append("Zadaj PIN. \n" + "A = OK\n\n");


            } else if (stav == Bankomat.UCET) {
                textovePoleBankomat.append("Zvolte typ uctu:\n" + "A = Bezny\n" + "B = Sporiaci\n" + "C = Koniec\n\n");

                tlacitkoA.removeActionListener(posluchacA2);
                tlacitkoA.removeActionListener(posluchacA4);
                tlacitkoB.removeActionListener(posluchacB2);
                tlacitkoC.removeActionListener(posluchacC2);

                tlacitkoA.addActionListener(posluchacA3);
                tlacitkoB.addActionListener(posluchacB1);
                tlacitkoC.addActionListener(posluchacC1);


            } else if (stav == Bankomat.TRANSAKCIA) {
                textovePoleBankomat.append("Aktualny zostatok na ucte: " + bankomat.getAktualnyZostatok() + " EUR\n\n");
                textovePoleBankomat.append("Zvolte akciu:\n" + "A = Vklad\n" + "B = Vyber\n" + "C = Spat\n\n");
                textovePoleBankomat.append("Ciastka: \n\n");

                tlacitkoA.removeActionListener(posluchacA3);
                tlacitkoB.removeActionListener(posluchacB1);
                tlacitkoC.removeActionListener(posluchacC1);

                tlacitkoA.addActionListener(posluchacA4);
                tlacitkoB.addActionListener(posluchacB2);
                tlacitkoC.addActionListener(posluchacC2);

            }

            synchronized (holder) {

                while (holder.isEmpty())

                    holder.wait();

                holder.remove(0);
            }
        }
    }
}
