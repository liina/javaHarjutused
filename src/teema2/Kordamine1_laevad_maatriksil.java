package teema2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Loo laevade pommitamine, kus on vaid 1x1 laevad ja kasutaja saab arvuti laevasid pommitada 9x9 maatriksil.
 */
public class Kordamine1_laevad_maatriksil {
    static int[][] laud;
    static int laualaius = 4;
    static int lauakorgus = 4;


    public static void main(String[] args) {
        int valmis = 0;
        genreeriLaud();
        genAsukoht();
        while (valmis == 0) {
            int[] asukoht = kysiAsukohta();
            kontrolliTabamust(asukoht);
            valmis = kontrolliLopp();
        }
        System.out.println("Kõik!");
    }

    private static int kontrolliLopp() {
        //kontroll kas mäng on läbi
        int valmis = 1;
        for (int i = 0; i < lauakorgus;i++) {
            for (int j = 0; j <laualaius;j++){
                if (laud[i][j] == 1) {
                    valmis = 0;
                    break;
                }
            }
        }
        return valmis;
    }

    private static void kontrolliTabamust(int[] asukoht) {
        int x = asukoht[0];
        int y = asukoht[1];
        if (laud[x][y] == 1) {
            System.out.println("pihtas");
            laud[x][y] = 2;
        } else if (laud[x][y] == 2) {
            System.out.println("juba olid siin");
        } else {
            System.out.println("möödas.");
        }
        //
        for (int i = 0; i < lauakorgus;i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
        //
    }

    private static int[] kysiAsukohta() { //try catch juhtimisstruktuur
        try {
            Scanner kasutaja = new Scanner(System.in);
            System.out.println("Anna rida");
            int x = kasutaja.nextInt() - 1;
            System.out.println("Anna veerg");
            int y = kasutaja.nextInt() - 1;
            int[] asukoht = {x, y};
            return asukoht;
        } catch (Exception e) {
            System.out.println("Numbrid!");
        }
        return kysiAsukohta();
    }

    private static void genreeriLaud() {
        laud = new int[laualaius][lauakorgus];
    }
    private static void genAsukoht() {
        for (int i = 0; i < lauakorgus;i++) {
            for (int j = 0; j <laualaius;j++){
                laud[i][j] = (int) (Math.random()*2);
            }
            System.out.println(Arrays.toString(laud[i]));
        }
    }

    /*
    public static int randLaev() {
        int x = (int) (Math.random()*2);
        return x;
    }
    */


}
