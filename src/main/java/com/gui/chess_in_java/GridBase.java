package com.gui.chess_in_java;

import javafx.scene.layout.AnchorPane;

public abstract class GridBase {

    private double planeWidth;
    private double planeHeight;
    private int tilesAcross;
    private int tileAmount;
    private int gridSize;
    private int tilesDown;
    private AnchorPane anchorPane;

    public GridBase(double planeWidth, double planeHeight, int gridSize, AnchorPane anchorPane) {
        this.planeWidth = planeWidth;
        this.planeHeight = planeHeight;
        this.gridSize = gridSize;
        this.anchorPane = anchorPane;

        tilesAcross = 8;
        tileAmount = 64;
        tilesDown = tileAmount/tilesAcross;
    }

    public double getPlaneWidth() {
        return planeWidth;
    }

    public double getPlaneHeight() {
        return planeHeight;
    }

    public int getTilesAcross() {
        return tilesAcross;
    }

    public int getTileAmount() {
        return tileAmount;
    }

    public int getGridSize() {
        return gridSize;
    }

    public int getTilesDown() {
        return tilesDown;
    }

    public AnchorPane getAnchorPane() {
        return anchorPane;
    }
}