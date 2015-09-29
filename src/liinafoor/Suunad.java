package liinafoor;

import foor.Foor;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Created by kasutaja on 29.09.2015.
 */
public class Suunad extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Foor foor1 = new Foor("üleval", primaryStage);
        Foor foor2 = new Foor("all", primaryStage);
        Foor foor3 = new Foor("paremal", primaryStage);
        Foor foor4 = new Foor("vasakul", primaryStage);
    }
}
