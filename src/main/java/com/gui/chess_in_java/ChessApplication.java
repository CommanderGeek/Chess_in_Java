package com.gui.chess_in_java;

import com.chess.logik.Gamehandler;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;

public class ChessApplication extends Application {
    Gamehandler gh;
    @Override
    public void start(Stage stage) throws IOException {
        initializeGamehandler();
        FXMLLoader fxmlLoader = new FXMLLoader(ChessApplication.class.getResource("view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1040, 780);
        // Loading image as stream bc didn't work without it!
        InputStream iconStream = ChessApplication.class.getResourceAsStream("/com/gui/chess_in_java/images/Icon.PNG");
        if (iconStream != null) {
            Image icon = new Image(iconStream);
            stage.getIcons().add(icon);
        } else {
            System.err.println("Icon konnte nicht geladen werden.");
        }
        stage.setTitle("Chess");
        stage.setScene(scene);
        stage.setResizable(false);


        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public void initializeGamehandler(){
        gh = new Gamehandler();
    }
}