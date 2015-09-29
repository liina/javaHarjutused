package liinafoor;

import foor.Foor;
import javafx.application.Application;
import javafx.stage.Stage;

public class TerveRistmik extends Application{
    public void start(Stage primaryStage) throws Exception {
        Foor ylal = new Foor("\u00fcleval", primaryStage);
        Foor all = new Foor("all", primaryStage);
        Foor parem = new Foor("paremal",primaryStage);
        Foor vasak = new Foor("vasakul",primaryStage);
        int j = 3; //tsyklite arv
        for (int i=0;i<8;i++) { //kollane vilkumine
            parem.kollane();
            parem.paus(1);
            vasak.kollane();
            vasak.paus(1);
            ylal.kollane();
            ylal.paus(1);
            all.kollane();
            all.paus(1);
            i++;
        }
        ylal.punane(); //algseis
        all.punane();
        parem.punane();
        vasak.punane();
        while ( j > 0){
            ylal.paus(23);
            all.paus(23);
            parem.paus(1);
            vasak.paus(1);
            for (int i=0;i<9;i++) { //p-v punane hakkab vilkuma
                parem.punane();
                parem.paus(1);
                vasak.punane();
                vasak.paus(1);
                i++;
            }
            parem.kollane(); //p-v kollaseks
            vasak.kollane();
            parem.paus(2);
            vasak.paus(2);
            parem.kollane();
            vasak.kollane();
            parem.roheline(); //p-v roheliseks
            vasak.roheline();
            parem.paus(1);
            vasak.paus(1);
            for (int i=0;i<9;i++) { //p-v roheline vilkuma
                parem.roheline();
                parem.paus(1);
                vasak.roheline();
                vasak.paus(1);
                i++;
            }
            parem.kollane(); //p-v kollaseks
            vasak.kollane();
            parem.paus(2);
            vasak.paus(2);
            parem.kollane();
            vasak.kollane();
            parem.punane(); //p-v punaseks
            vasak.punane();
            parem.paus(23);
            vasak.paus(23);

            //sama ü-a jaoks
            for (int i=0;i<9;i++) { //p-v punane hakkab vilkuma
                ylal.punane();
                ylal.paus(1);
                all.punane();
                all.paus(1);
                i++;
            }
            ylal.kollane(); //p-v kollaseks
            all.kollane();
            ylal.paus(2);
            all.paus(2);
            ylal.kollane();
            all.kollane();
            ylal.roheline(); //p-v roheliseks
            all.roheline();
            ylal.paus(1);
            all.paus(1);
            for (int i=0;i<9;i++) { //p-v roheline vilkuma
                ylal.roheline();
                ylal.paus(1);
                all.roheline();
                all.paus(1);
                i++;
            }
            ylal.kollane(); //p-v kollaseks
            all.kollane();
            ylal.paus(2);
            all.paus(2);
            ylal.kollane();
            all.kollane();
            ylal.punane(); //p-v punaseks
            all.punane();
            ylal.paus(1);
            all.paus(1);
            j--;
        }
        ylal.punane();
        all.punane();
        parem.punane();
        vasak.punane();
        for (int i=0;i<8;i++) { //kollane vilkumine
            parem.kollane();
            parem.paus(1);
            vasak.kollane();
            vasak.paus(1);
            ylal.kollane();
            ylal.paus(1);
            all.kollane();
            all.paus(1);
            i++;
        }
    }
}
