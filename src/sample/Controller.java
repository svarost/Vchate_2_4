package sample;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalTime;

public class Controller {
    private String userName = "Viktor";

    @FXML
    TextArea textArea;

    @FXML
    TextField textField;

    @FXML
    void sendMsg() {
        if(!textField.getText().isEmpty()) {
            textArea.appendText(userName + ": " + textField.getText() + "\n");
            textField.clear();
            textField.requestFocus();
        }
    }
}