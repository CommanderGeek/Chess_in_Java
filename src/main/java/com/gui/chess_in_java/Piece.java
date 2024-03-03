package com.gui.chess_in_java;

import com.chess.logik.Figure;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

import java.io.InputStream;

public class Piece {



    public Piece(int size, int startPositionX, int startPositionY, String url, Figure figure) {
        this.startPositionX = startPositionX;
        this.startPositionY = startPositionY;
        //rectangle = new Rectangle(startPositionX, startPositionY, size, size);
        //rectangle.setFill(Color.RED);
        InputStream imgStream = ChessApplication.class.getResourceAsStream(url);
        assert imgStream != null;
        Image im = new Image(imgStream);
        img = new ImageView(im);
        borderPane = new BorderPane();
        borderPane.setCenter(img);
        borderPane.setLayoutX(startPositionX);
        borderPane.setLayoutY(startPositionY);
        this.figure = figure;
    }

    private int startPositionX;
    private int startPositionY;

    private ImageView img;

    private BorderPane borderPane;
    private Figure figure;

    public BorderPane getBorderPane() {
        return borderPane;
    }

    public void setBorderPane(BorderPane borderPane) {
        this.borderPane = borderPane;
    }

    public int getStartPositionX() {
        return startPositionX;
    }

    public void setStartPositionX(int startPositionX) {
        this.startPositionX = startPositionX;
    }

    public int getStartPositionY() {
        return startPositionY;
    }

    public void setStartPositionY(int startPositionY) {
        this.startPositionY = startPositionY;
    }

    public ImageView getImg() {
        return img;
    }

    public void setImg(ImageView img) {
        this.img = img;
    }

    public Figure getFigure() {
        return figure;
    }

}
