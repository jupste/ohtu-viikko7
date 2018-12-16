/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.kivipaperisakset;

/**
 *
 * @author jussiste
 */
public class PeliFactory {
    public static void ihmispeli(){
        new KPSPelaajaVsPelaaja().pelaa();
    }
    public static void tekoalyPeli(){
        new KPSTekoaly().pelaa();
    }
    public static void parempiTekoalyPeli(){
        new KPSParempiTekoaly().pelaa();
    }
}
