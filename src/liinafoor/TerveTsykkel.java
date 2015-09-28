package liinafoor;

import foor.Foor;
import javafx.application.Application;
import javafx.stage.Stage;

public class TerveTsykkel extends Application {
    public void start(Stage primaryStage) throws Exception {
        Foor foor = new Foor("�leval", primaryStage);
        //yks tsykkel
        foor.punane();
        foor.paus(3);
        for (int i=0;i<9;i++) { //5 korda kustutab ja 4 korda paneb p�lema
            foor.punane(); //paneb p�lema v. kustutab �ra
            foor.paus(1);   //ootab enne j�rgmisele ringile minekut
            i++;
        }
        foor.kollane();
        foor.paus(3);
        foor.kollane();
        foor.roheline();
        foor.paus(3);
        for (int i=0;i<9;i++) { //5 korda kustutab ja 4 korda paneb p�lema
            foor.roheline(); //paneb p�lema v. kustutab �ra
            foor.paus(1);   //ootab enne j�rgmisele ringile minekut
            i++;
        }
    }
}
