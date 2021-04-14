package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField textField;

    @FXML
    private TextArea textArea;

    @FXML
    private void clickSend(ActionEvent actionEvent) {
        textArea.appendText(textField.getText()+"\n");
        textField.clear();
        textField.requestFocus();

    }

    @FXML
    private void clickClose(ActionEvent actionEvent) {

    }

    public void clickClear(ActionEvent actionEvent) {
        textField.clear();
        textArea.clear();

    }
}
