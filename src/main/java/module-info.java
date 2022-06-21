module com.example.sqlgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sqlgui to javafx.fxml;
    exports com.example.sqlgui;
}