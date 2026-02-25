package ProyectoAura.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

// TODO El diseño Hi-Fi se calca en vista FXML usando Screen Builder. Mediante un archivo CSS se inyectan los colores.

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/vistaPrincipal.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setTitle("Aplicación JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) { launch(args); }
}
