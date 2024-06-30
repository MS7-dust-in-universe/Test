import javafx.animation.ParallelTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextFlow;

import javax.xml.soap.Text;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class mainController{
    public VBox alerts;
    public Button btn;
    public AnchorPane mainform;

    public void btnOnAction(ActionEvent actionEvent) throws IOException {
        // Load the AnchorPaneGUI
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("sample2.fxml"));
        AnchorPane second = loader.load();

        // Add the AnchorPaneGUI to the VBox
        alerts.getChildren().add(second);
    }
}