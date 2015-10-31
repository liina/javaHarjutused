package teema2;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * 1. Joonista eesti lipp kasutades kolme Rectangle
 * 2. Joonista Jaapani lipp kasutades Rectangle ja Circle
 */
public class Harjutus1_lipud extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        eestilipp();
        jaapanilipp();
    }

    private void eestilipp() {
        Stage lava = new Stage();
        Pane pane = new Pane();
        Scene scene = new Scene(pane,500,300);
        lava.setScene(scene);
        lava.show();
        Rectangle kast = new Rectangle(0,0,500,100); //algusx,algusy,laius,kõrgus? - vist
        kast.setFill(Color.LIGHTBLUE);
        pane.getChildren().add(kast);
        Rectangle skast = new Rectangle(0,100,500,100); //algusx,algusy,laius,kõrgus? - vist
        skast.setFill(Color.BLACK);
        pane.getChildren().add(skast);
        Rectangle tkast = new Rectangle(0,200,500,100); //algusx,algusy,laius,kõrgus? - vist
        tkast.setFill(Color.WHITESMOKE);
        pane.getChildren().add(tkast);

    }
    private void jaapanilipp() {
        Stage lava = new Stage();
        Pane pane = new Pane();
        Scene scene = new Scene(pane,500,300);
        lava.setScene(scene);
        lava.show();
        Circle a = new Circle(250,150,100);
        a.setFill(Color.RED);
        pane.getChildren().add(a);
        lava.show();
    }
}
