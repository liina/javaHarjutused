package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

/**
 * Täpselt nagu oli fooriga, on nüüd ristmikuga. Kuidas esiteks
 * ristmik üles ehitada loe Foori README.md-st: https://github.com/KristerV/javaHarjutused
 */
public class Peamurdja2_ristmik extends Application {
    public void start(Stage primaryStage) throws Exception {
        Foor ylal = new Foor(Foor.YLEMINE, primaryStage);
        Foor all = new Foor(Foor.ALUMINE, primaryStage);
        Foor parem = new Foor(Foor.VASAK,primaryStage);
        Foor vasak = new Foor(Foor.PAREM,primaryStage);
        int j = 3; //tsyklite arv
        double yp = 0;
        double pp = 0;
        kollanevilgub(ylal);
        kollanevilgub(all);
        kollanevilgub(parem);
        kollanevilgub(vasak);

        ylal.vahetaPunast(); //l�litub t��rezhiimi
        all.vahetaPunast();
        parem.vahetaPunast();
        vasak.vahetaPunast();
        parem.paus(0.5);
        vasak.paus(0.5);
        pp += 0.5;
        while ( j > 0) {
            ylal.paus(11.5);
            all.paus(11.5);
            yp += 11.5;
            roheliseks(parem); //kestab 5.5
            roheliseks(vasak);

            parem.paus(0.5); //oota 0.5
            vasak.paus(0.5);
            pp += 0.5;
            punaseks(parem); //kestab 5.5
            punaseks(vasak);

            parem.paus(11.5);
            vasak.paus(11.5);
            pp += 11.5;
            roheliseks(ylal); //mingi viide tuleb sisse siin - ootaks, et punane hakkaks kohe vilkuma, sest 11 on l�bi
            roheliseks(all);
            ylal.paus(0.5);
            all.paus(0.5);
            yp += 0.5;
            punaseks(ylal); //kestab 5.5
            punaseks(all);
            j--;
        }
        ylal.paus(0.5); //hoiab punast
        all.paus(0.5);
        yp += 0.5;
        ylal.vahetaPunast(); //kustutab punased �ra
        all.vahetaPunast();
        parem.vahetaPunast();
        vasak.vahetaPunast();
        kollanevilgub(ylal); //ja ��rezhiimile ja l�puks kustub
        kollanevilgub(all);
        kollanevilgub(parem);
        kollanevilgub(vasak);
        System.out.println("pp" + pp +"yp" + yp);
    }
    public void kollanevilgub (Foor x) {
        for (int i=0;i<8;i++) { //kollane vilkumine
            x.vahetaKollast();
            x.paus(0.5);
            i++;
        }
    }
    public void roheliseks (Foor x)  { //pikkus 5.5
        double p = 0;
        for (int i=0;i<8;i++) { //punane hakkab vilkuma
            x.vahetaPunast();
            x.paus(0.5);
            p = p+0.5;
            i++;
        }
        x.vahetaKollast(); //kollaseks
        x.paus(1);
        p = p + 1;
        x.vahetaPunast();
        x.vahetaKollast();
        x.vahetaRohelist(); //roheliseks
        x.paus(0.5);
        p = p + 0.5;
        System.out.println("roheliseks paus" + p);
    }
    public void punaseks (Foor x)  { //pikkus 5.5
        double p = 0;
        for (int i=0;i<9;i++) { //roheline vilkuma
            x.vahetaRohelist();
            x.paus(0.5);
            p = p+0.5;
            i++;
        }
        x.vahetaKollast(); //kollaseks
        x.paus(1);
        p = p + 1;
        x.vahetaKollast();
        x.vahetaPunast(); //punaseks
        System.out.println("punaseks paus" + p);
    }


}