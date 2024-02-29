package com.gui.chess_in_java;

import com.chess.logik.Gamehandler;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ChessApplication extends Application {
    Gamehandler gh;
    @Override
    public void start(Stage stage) throws IOException {
        initializeGamehandler();
        FXMLLoader fxmlLoader = new FXMLLoader(ChessApplication.class.getResource("view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Chess");
        stage.setScene(scene);



        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public void initializeGamehandler(){
        gh = new Gamehandler();
    }
}