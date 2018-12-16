package ohtu.kivipaperisakset;

import java.util.HashMap;
import java.util.Scanner;

public class Paaohjelma {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetataan");
            String vastaus = scanner.nextLine();
            if (vastaus.endsWith("a")) {            
                PeliFactory.ihmispeli();
            } else if (vastaus.endsWith("b")) {
                PeliFactory.tekoalyPeli();
            } else if (vastaus.endsWith("c")) {
                PeliFactory.parempiTekoalyPeli();
            } else {
                break;
            }
        }

    }
}
