package com.gui.chess_in_java;

import com.chess.logik.Gamehandler;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

public class DraggableMakerGrid extends GridBase {
    private Gamehandler gamehandler;

    private double mouseAnchorX;
    private double mouseAnchorY;

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
        Node node = piece.getBorderPane();
        node.setOnMouseDragged(mouseEvent -> {
            mouseAnchorX = (int)mouseEvent.getSceneX();
            mouseAnchorY = (int)mouseEvent.getSceneY();
            double maxX = getAnchorPane().getPrefWidth();
            double maxY = getAnchorPane().getPrefHeight();
            int x = (int) ((mouseAnchorX/getGridSize())) * getGridSize();
            int y = (int) ((mouseAnchorY/getGridSize())) * getGridSize();
            int nextX = x - piece.getStartPositionX();
            int nextY = y - piece.getStartPositionY();
            int row = nextX/64;
            int column = nextY/64;
           // if(gamehandler.getBoard().getFigure(row, column) == null ||gamehandler.getBoard().getFigure(row, column).getColor() != piece.getFigure().getColor() ) {
                if (mouseAnchorX > 0 && mouseAnchorX < maxX) {
                    node.setLayoutX(nextX);
                    piece.getFigure().setRow(row);
                }
                if (mouseAnchorY > 0 && mouseAnchorY < maxY) {
                    node.setLayoutY(nextY);
                    piece.getFigure().setColumn(column);
                }
          //  }
            //gamehandler.updateField();
           // gamehandler.printBoard();
           // System.out.println("---Ende---");
        });
    }
}
