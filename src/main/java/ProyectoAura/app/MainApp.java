package ProyectoAura.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = new FXMLLoader(getClass().getResource("/fxml/vistaPrincipal.fxml")).load();
        Scene scene = new Scene(root);

        stage.setTitle("Aura Wellness");
        stage.getIcons().add( new Image(Objects.requireNonNull(getClass().getResourceAsStream("/image/aura.png"))) );
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) { launch(args); }
}