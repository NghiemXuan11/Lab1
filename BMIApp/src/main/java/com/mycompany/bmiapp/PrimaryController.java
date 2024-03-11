package com.mycompany.bmiapp;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        int a = 2;
        boolean b;
        if (a>0)
            b = true;
        App.setRoot("secondary");
    }
}
