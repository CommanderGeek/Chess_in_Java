package com.gui.chess_in_java;

import com.chess.logik.Gamehandler;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

public class DraggableMakerGrid extends GridBase {

    private double mouseAnchorX;
    private double mouseAnchorY;
    private Gamehandler gamehandler;
    public DraggableMakerGrid(double planeWidth, double planeHeight, int gridSize, AnchorPane anchorPane, Gamehandler gamehandler) {
        super(planeWidth, planeHeight, gridSize, anchorPane);
        this.gamehandler = gamehandler;
    }

    public void makeDraggable(Node node){
        node.setOnMouseReleased(mouseEvent -> {
            mouseAnchorX = mouseEvent.getSceneX();
            mouseAnchorY = mouseEvent.getSceneY();

            int x = (int) ((mouseAnchorX/getGridSize()) % getTilesAcross()) * getGridSize();
            int y = (int) ((mouseAnchorY/getGridSize()) % getTilesDown()) * getGridSize();

            node.setLayoutX(x);
            node.setLayoutY(y);
        });
    }


    public void makeDraggable(Piece piece){
        Node node = piece.getImg();
        node.setOnMouseDragged(mouseEvent -> {
            //-40 because of inaccuracy
            mouseAnchorX = mouseEvent.getSceneX()-40;
            mouseAnchorY = mouseEvent.getSceneY();
            double maxX = getAnchorPane().getPrefWidth();
            double maxY = getAnchorPane().getPrefHeight();
            int x = (int) ((mouseAnchorX/getGridSize())) * getGridSize();
            int y = (int) ((mouseAnchorY/getGridSize())) * getGridSize();
            int newX = x - piece.getStartPositionX();
            int newY = y - piece.getStartPositionY();
            if(mouseAnchorX >= 0 && mouseAnchorX < maxX) {
                node.setLayoutX(newX);
            }
            if(mouseAnchorY >= 0 && mouseAnchorY < maxY) {
                node.setLayoutY(newY);
            }
        });
    }
}
