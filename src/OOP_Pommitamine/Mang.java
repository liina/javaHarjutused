package OOP_Pommitamine;

import java.util.Arrays;

/**
 * Created by labner on 21.11.15.
 *  Mäng
 *  Oskab mängu seadistada
 *  mere ja laevastiku genereerimine
 *  Oskab mängu töös hoida
 *      kuni laevu on elus, siis küsi kasutjalt koordinaadid
 *      pommita merd
 *      annatagasisidet
 *  Oskab mängu lõpetada
 *      lõpeta mäng
 */
public class Mang {
    public Mang() {
        System.out.println("Start mäng");
        Meri meri = new Meri(10);
        Mangija mangija = new Mangija();
        while (meri.kasOnLaevuElus()){
            System.out.println("Mängi edasi");
            meri.kuvaSeis();
            int[] lask = mangija.kysiLask();
            boolean pihtas = meri.kasKeegiSaiPihta(lask);
            if (pihtas) {
                mangija.pihtas();
            } else {
                mangija.moodas();
            }
        }
        mangija.gameover();
    }
}
