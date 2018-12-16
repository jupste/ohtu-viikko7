/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.kivipaperisakset;

import java.util.Scanner;

/**
 *
 * @author jussiste
 */
public abstract class KPSPeli {

    protected Tuomari tuomari;
    protected static final Scanner scanner = new Scanner(System.in);
    protected String ekanSiirto;
    protected String tokanSiirto;
    protected AI tekoaly;

    public KPSPeli() {
        this.tuomari = new Tuomari();
    }

    protected void pelaa() {
        System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
        kierros();
        while (jatkuu()) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
            kierros();
        }
        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }

    protected boolean jatkuu() {
        return (ekanSiirto.equals("k") || ekanSiirto.equals("p") || ekanSiirto.equals("s")) && (tokanSiirto.equals("k") || tokanSiirto.equals("p") || tokanSiirto.equals("s"));
    }

    protected void kierros() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        ekanSiirto = scanner.nextLine();
        if (tekoaly == null) {
            System.out.print("Toisen pelaajan siirto: ");
            tokanSiirto = scanner.nextLine();
        } else {
            tekoaly.asetaSiirto(ekanSiirto);
            tokanSiirto = tekoaly.annaSiirto();
            System.out.println("Tietokone valitsi: " + tokanSiirto);
        }
    }
}
