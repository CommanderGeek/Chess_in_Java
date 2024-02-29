package com.gui.chess_in_java;

import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

public class DraggableMakerGrid extends GridBase {

    private double mouseAnchorX;
    private double mouseAnchorY;

    public DraggableMakerGrid(double planeWidth, double planeHeight, int gridSize, AnchorPane anchorPane) {
        super(planeWidth, planeHeight, gridSize, anchorPane);
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
        Node node = piece.getRectangle();
        node.setOnMouseDragged(mouseEvent -> {
            mouseAnchorX = mouseEvent.getSceneX();
            mouseAnchorY = mouseEvent.getSceneY();
            double maxX = getAnchorPane().getPrefWidth();
            double maxY = getAnchorPane().getPrefHeight();
            int x = (int) ((mouseAnchorX/getGridSize())) * getGridSize();
            int y = (int) ((mouseAnchorY/getGridSize())) * getGridSize();
            int newX = x - piece.getStartPositionX();
            int newY = y - piece.getStartPositionY();
            if(newX >= 0 && newX < maxX) {
                node.setLayoutX(x - piece.getStartPositionX());
            }
            if(newY >= 0 && newY < maxY) {
                node.setLayoutY(y - piece.getStartPositionY());
            }
        });
    }
}