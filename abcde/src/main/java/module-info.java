module com.example.abcde {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.abcde to javafx.fxml;
    exports com.example.abcde;
}