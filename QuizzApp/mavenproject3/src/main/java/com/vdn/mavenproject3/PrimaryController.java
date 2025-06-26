package com.vdn.mavenproject3;

import com.vdn.singleton.MyAlert;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class PrimaryController {
    public void handleQuestionManagement(ActionEvent event){
        MyAlert.getInstance().showMessage("Coming soon...");
    }
     public void handlePractise(ActionEvent event){
        MyAlert.getInstance().showMessage("Coming soon...");
     }
}
