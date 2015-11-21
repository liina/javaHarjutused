package OOP_Pommitamine;

import java.util.Arrays;

/**
 * Created by labner on 21.11.15.
 */
public class Meri {
    private int mereServaPikkus;
    private Laev[] laevastik = new Laev[5];
    public Meri(int pikkus) {
        System.out.println("Start meri");
        mereServaPikkus = pikkus;
        looLaevastik();
    }

    private void looLaevastik() { //private meetod on nähtav ainult selles klassis
        for (int i = 0; i < laevastik.length; i++) {
            laevastik[i] = new Laev(mereServaPikkus);
        }
    }

    public boolean kasOnLaevuElus() {
        for (Laev laev : laevastik){    //foreach
            boolean elus = laev.kasOledElus();
            if (elus) {
                return true;
            }
        }

        return false;
    }

    public boolean kasKeegiSaiPihta(int[] lask) {
        for (Laev laev : laevastik){    //foreach
            boolean pihtas = laev.kasSaidPihta(lask);
            if (pihtas) {
                return true;
            }

        }
        return false;
    }
    public void kuvaSeis() {
        int[][] laud = new int[mereServaPikkus][mereServaPikkus];
        for ( Laev laev : laevastik) {
            int[] k = laev.annaKoordinaadid();
            boolean elus = laev.kasOledElus();
            if (elus) {
                laud[k[0]][k[1]] = 1;
            } else {
                laud[k[0]][k[1]] = 2;
            }
        }
        for (int i = 0; i < laud.length; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
    }
}
