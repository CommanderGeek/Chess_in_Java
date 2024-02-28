module com.example.chess_in_java {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.gui.chess_in_java to javafx.fxml;
    exports com.gui.chess_in_java;
}