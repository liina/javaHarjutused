package teema2;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventTarget;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Joonista laevade pommitamine kasutades JavaFXi.
 */
public class Peamurdja1_laevad_fx extends Application{
    Stage lava;
    GridPane laud;
    int lauaPikkusLaevades = 4;
    int laevaServPikslites = 100;
    int kylg = lauaPikkusLaevades*laevaServPikslites;

    @Override
    public void start(Stage primaryStage) throws Exception {
        lava = primaryStage;
        seadistaLava();
        paigutaLaevad();
        reageeriKlikile();
        kontrolliLauda();

    }

    private boolean kontrolliLauda() {
        for (Node ruut : laud.getChildren()){
            if (ruut.getId().equals("laev")) {
                return true;
            }
        }
        return false;
    }

    private void reageeriKlikile() {
        laud.setOnMouseClicked(event -> {
            Rectangle ruut = (Rectangle) event.getTarget();
            String id = ruut.getId();
            if (id.equals("laev")) {
                ruut.setFill(Color.RED);
                ruut.setId("pihtas");
            } else {
                ruut.setFill(Color.GRAY);
            }
            if (!kontrolliLauda()){
                System.out.println("läbi");
            }
        });
    }

    private void paigutaLaevad() {
        for (int i = 0; i < lauaPikkusLaevades; i++){
            for (int j = 0; j < lauaPikkusLaevades; j++){
                Rectangle ruut = new Rectangle(laevaServPikslites, laevaServPikslites);
                if ((int) (Math.random()*2) == 1) {
                    ruut.setId("laev");
                    /*ruut.setOnMouseClicked(event -> {
                        ruut.setFill(Color.RED);
                    });*/
                } else {
                    ruut.setId("meri");
                }
                ruut.setStroke(Color.BLACK);
                ruut.setFill(Color.LIGHTBLUE);
                laud.add(ruut, i, j); //gridil pole vaja getChildren-it nagu muidu Pane-l
            }
        }


    }

    private void seadistaLava() {
        laud = new GridPane();
        Scene mscene = new Scene(laud,kylg,kylg);
        lava.setScene(mscene);
        lava.show();
        lava.setOnCloseRequest(event -> System.exit(0));
    }
}
