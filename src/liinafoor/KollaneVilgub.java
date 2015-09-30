package liinafoor;

import foor.Foor;
import javafx.application.Application;
import javafx.stage.Stage;

public class KollaneVilgub extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Foor foor = new Foor("üleval", primaryStage);
        for (int i=0;i<10;i++) {
            foor.kollane(); //paneb põlema v. kustutab ära
            foor.paus(1);   //ootab enne järgmisele ringile minekut
            i++;
        }
    }
}
