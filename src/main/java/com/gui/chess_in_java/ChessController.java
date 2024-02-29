package com.gui.chess_in_java;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class ChessController implements Initializable {

    private int gridSize = 64;

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private AnchorPane MainPane;

    private GridHandler backgroundGridHandler;
    private DraggableMakerGrid draggableMakerGrid;
    private DraggableMaker draggableMaker = new DraggableMaker();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        draggableMakerGrid = new DraggableMakerGrid(anchorPane.getPrefWidth(), anchorPane.getPrefHeight(), gridSize, anchorPane);

        backgroundGridHandler = new GridHandler(anchorPane.getPrefWidth(), anchorPane.getPrefHeight(), gridSize, anchorPane);
        backgroundGridHandler.updateGrid();

        Piece piece = new Piece(gridSize, 0, 0);
        anchorPane.getChildren().add(piece.getRectangle());

        draggableMakerGrid.makeDraggable(piece);
        //draggableMaker.makeDraggable(piece.getRectangle());
    }
}