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

        kollanevilgub(ylal);
        kollanevilgub(all);
        kollanevilgub(parem);
        kollanevilgub(vasak);

        ylal.punane(); //lülitub töörezhiimi
        all.punane();
        parem.punane();
        vasak.punane();
        parem.paus(1);
        vasak.paus(1);
        while ( j > 0) {
            ylal.paus(21);
            all.paus(21);
            roheliseks(parem); //kestab 10
            roheliseks(vasak);
            parem.paus(1); //oota 1
            vasak.paus(1);
            punaseks(parem); //kestab 10
            punaseks(vasak);
            parem.paus(21);
            vasak.paus(21);
            roheliseks(ylal); //mingi viide tuleb sisse siin - ootaks, et punane hakkaks kohe vilkuma, sest 21 on läbi
            roheliseks(all);
            ylal.paus(1);
            all.paus(1);
            punaseks(ylal); //kestab 10
            punaseks(all);
            j--;
        }
        ylal.paus(1); //hoiab punast
        all.paus(1);
        ylal.punane(); //kustutab punased ära
        all.punane();
        parem.punane();
        vasak.punane();
        kollanevilgub(ylal); //ja öörezhiimile ja lõpuks kustub
        kollanevilgub(all);
        kollanevilgub(parem);
        kollanevilgub(vasak);
    }
    public void kollanevilgub (Foor x) {
        for (int i=0;i<8;i++) { //kollane vilkumine
            x.kollane();
            x.paus(1);
            i++;
        }
    }
    public void roheliseks (Foor x)  {
       for (int i=0;i<9;i++) { //punane hakkab vilkuma
            x.punane();
            x.paus(1);
            i++;
        }
        x.kollane(); //kollaseks
        x.paus(2);
        x.kollane();
        x.roheline(); //roheliseks
    }
    public void punaseks (Foor x)  {
        for (int i=0;i<9;i++) { //roheline vilkuma
            x.roheline();
            x.paus(1);
            i++;
        }
        x.kollane(); //kollaseks
        x.paus(2);
        x.kollane();
        x.punane(); //punaseks
    }
}
