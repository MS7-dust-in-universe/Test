import javafx.animation.ParallelTransition;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

public class sample1Controller {

    public Button deleteButton;

    public void deleteOnAction(ActionEvent actionEvent) {
        AnchorPane second = (AnchorPane) deleteButton.getScene().getRoot();

        // Get the VBox that holds the AnchorPane
        VBox alerts = (VBox) second.getParent();

        // Remove the AnchorPane from the VBox
        alerts.getChildren().remove(second);
    }
}