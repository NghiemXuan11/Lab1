module com.mycompany.bmiapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.bmiapp to javafx.fxml;
    exports com.mycompany.bmiapp;
}
