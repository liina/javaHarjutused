package LoginDB;

import java.util.Scanner;

/**
 * Created by labner on 22.11.15.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kasutajanimi:");
        String kasutajaNimi = sc.nextLine();
        System.out.println("Parool:");
        String parool = sc.nextLine();
        Andmebaas ab = new Andmebaas();
        //ab.looTabel();

        boolean kasutajaExists = ab.kasKasutajaOlemas(kasutajaNimi);
        System.out.println(kasutajaExists);
        if (kasutajaExists) {
            //
        } else {
            ab.registreeri(kasutajaNimi, parool);
        }
        ab.showTabel();
        ab.sulgeYhendus();
    }
}

