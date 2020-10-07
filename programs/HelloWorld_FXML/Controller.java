package HelloWorld_JavaFXML;

import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

    @FXML
    public JFXTextField validationInputField;

    @FXML
    public Label validationLabel;

    @FXML
    public ImageView emotionPic;

    @FXML
    private void validateInput(){
        if((validationInputField.getText()).equalsIgnoreCase("Hello World")){
            emotionPic.setImage(new Image(this.getClass().getResourceAsStream("assets/trophy.png")));
            validationLabel.setText("Congrats! You have provided valid Input.");
        }
        else{
            emotionPic.setImage(new Image(this.getClass().getResourceAsStream("assets/sad.png")));
            validationLabel.setText("Wrong Input! Try Again.");
        }
        emotionPic.setOpacity(1);
        validationLabel.setVisible(true);
    }
}
