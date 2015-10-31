package teema2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * 1. Joonista kast kasutades jooni
 * 2. Joonista spiraal kasutades jooni (vaata ringi meetodi)
 * 3. Joonista propeller (nagu propeller.png) kasutades jooni
 */
public class Harjutus2_ringid extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane,500,300);
        primaryStage.setScene(scene);
        primaryStage.show();
        Line line = new Line(5, 5, 5, 55);
        Line line1 = new Line(5, 55, 55, 55);
        Line line2 = new Line(55, 55, 55, 5);
        Line line3 = new Line(55, 5, 5, 5);
        pane.getChildren().add(line);
        pane.getChildren().add(line1);
        pane.getChildren().add(line2);
        pane.getChildren().add(line3);

    }
}