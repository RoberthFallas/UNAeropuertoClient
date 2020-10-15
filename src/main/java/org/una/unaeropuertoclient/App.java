package org.una.unaeropuertoclient;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.una.unaeropuertoclient.utils.AppContext;
import org.una.unaeropuertoclient.utils.DateConverter;
import org.una.unaeropuertoclient.utils.FlowController;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        DateConverter.toSpringDateTime(LocalDateTime.now());
        DateConverter.toSpringDate(LocalDate.now());
        AppContext.getInstance();
        FlowController.getInstance().InitializeFlow(stage, null);
        FlowController.getInstance().goViewInWindow("Login", Boolean.FALSE);
    }

    public static void main(String[] args) {
        launch();
    }

}
