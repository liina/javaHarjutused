package teema1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * NB! Lahenda käesolev ülesanne konsoolis. Pole vaja JavaFXi siia segada.
 *
 * 1. Kirjuta lihtne laevade pommitamise mäng, kus arvuti genereerib 1x1
 *    laevad mööda 1 dimensioonilist lauda. See tähendab, et mängulaud
 *    ei ole mitte ruudustik, vaid üks rida.
 *
 * 2. Täienda mängu nii, et nüüd oleks laual ruudustik.
 *
 * 3. Kas oskad ka nii, et laevad ei ole 1x1 vaid 1x2 ja 1x3 ja orienteeruvad
 *    nii vertikaalselt kui ka horisontaalselt?
 */
public class Peamurdja3_laevad {
    public static void main(String[] args) {
       /*Scanner kasutaja = new Scanner(System.in);
        int[] laev = {0,1,0,0,1,0,0,0,1,0};
        int valmis = 0; //kontrollib kas onläbi või ei
        while (valmis == 0) {
            System.out.println("seis" + Arrays.toString(laev));
            System.out.println("Paku 1-10");
            int num = kasutaja.nextInt();
            if (laev[num - 1] == 1) {
                System.out.println(num + " pihtas");
                laev[num - 1] = 2;
            } else {
                System.out.println(num + " möödas.");
            }

            //kontroll kas mäng on läbi
            valmis = 1;
            for (int j=0;j<10;j++){
                if (laev[j]==1) {
                    valmis = 0;
                    break;
                }
            }
        }
        System.out.println("seis" + Arrays.toString(laev));
        System.out.println("Mäng läbi");
        */
        Scanner kasutaja = new Scanner(System.in);

        int[] laev = {randLaev(), randLaev(), randLaev(), randLaev(), randLaev(), randLaev(), randLaev(), randLaev(), randLaev(), randLaev()};
        int valmis = 0; //kontrollib kas onläbi või ei
        while (valmis == 0) {
            System.out.println("seis" + Arrays.toString(laev));
            System.out.println("Paku 1-10");
            int num = kasutaja.nextInt();
            if (laev[num - 1] == 1) {
                System.out.println(num + " pihtas");
                laev[num - 1] = 2;
            } else if (laev[num - 1] == 2) {
                System.out.println(num + " juba olid siin");
            } else {
                System.out.println(num + " möödas.");
            }

            //kontroll kas mäng on läbi
            valmis = 1;
            for (int j = 0; j < 10; j++) {
                if (laev[j] == 1) {
                    valmis = 0;
                    break;
                }
            }
        }
        System.out.println("seis" + Arrays.toString(laev));
        System.out.println("Mäng läbi");
    }
    public static int randLaev() {
        int x = (int) (Math.random()*2);
        return x;
    }

}