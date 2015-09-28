package liinafoor;

import foor.Foor;
import javafx.application.Application;
import javafx.stage.Stage;

public class TerveTsykkel extends Application {
    public void start(Stage primaryStage) throws Exception {
        Foor foor = new Foor("üleval", primaryStage);
        //yks tsykkel
        foor.punane();
        foor.paus(3);
        for (int i=0;i<9;i++) { //5 korda kustutab ja 4 korda paneb põlema
            foor.punane(); //paneb põlema v. kustutab ära
            foor.paus(1);   //ootab enne järgmisele ringile minekut
            i++;
        }
        foor.kollane();
        foor.paus(3);
        foor.kollane();
        foor.roheline();
        foor.paus(3);
        for (int i=0;i<9;i++) { //5 korda kustutab ja 4 korda paneb põlema
            foor.roheline(); //paneb põlema v. kustutab ära
            foor.paus(1);   //ootab enne järgmisele ringile minekut
            i++;
        }
    }
}
