package sample;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;

public class Controller {

    @FXML
    public CheckBox musicButton;
    @FXML
    public ToggleGroup ToggleGroup;
    @FXML
    public Label ta;

    public void toggleApp(){
        if(musicButton.isSelected()){
            ToggleGroup.getToggles().forEach(toggle->){
                Node node=(Node) toggle;
                node.setDisable(true);
            });
            ta.setDisable(true);
        }

        else
        {
            ToggleGroup.getToggles().forEach(toggle->){
            Node node=(Node) toggle;
            node.setDisable(false);
        });
            ta.setDisable(false);

        }

    }

}
