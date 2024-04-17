import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EndPageInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
       // primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("LoginForm.fxml"))));
        //primaryStage.show();
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("EndPage.fxml"))));
        primaryStage.show();
    }
}
