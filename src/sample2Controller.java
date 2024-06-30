import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class sample2Controller {


    public AnchorPane second;

    public void showmoreOnAction(ActionEvent actionEvent) throws IOException {
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("sample1.fxml")));
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.initStyle(StageStyle.UTILITY);
        stage.centerOnScreen();
        stage.show();


    }


}
