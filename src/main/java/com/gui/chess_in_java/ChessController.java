package com.gui.chess_in_java;

import com.chess.logik.Chessboard;
import com.chess.logik.Gamehandler;
import com.chess.logik.Rook;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ChessController implements Initializable {

    private final int gridSize = 64;
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private AnchorPane MainPane;

    private GridHandler backgroundGridHandler;
    private DraggableMakerGrid draggableMakerGrid;
    private DraggableMaker draggableMaker = new DraggableMaker();
    private Gamehandler gamehandler;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gamehandler = new Gamehandler();
        draggableMakerGrid = new DraggableMakerGrid(anchorPane.getPrefWidth(), anchorPane.getPrefHeight(), gridSize, anchorPane, gamehandler);
        backgroundGridHandler = new GridHandler(anchorPane.getPrefWidth(), anchorPane.getPrefHeight(), gridSize, anchorPane);
        backgroundGridHandler.updateGrid();

        initializeWhitePieces();
        initializeBlackPieces();
    }

    public void initializeWhitePieces(){
        Piece whiteRook1 = new Piece(gridSize, 0, 448, "/com/gui/chess_in_java/images/white_rook.png", gamehandler.getBoard().getFigure(7,0));
        Piece whiteKnight1 = new Piece(gridSize, 64, 448, "/com/gui/chess_in_java/images/white_knight.png", gamehandler.getBoard().getFigure(7,1));
        Piece whiteBishop1 = new Piece(gridSize, 128, 448, "/com/gui/chess_in_java/images/white_bishop.png", gamehandler.getBoard().getFigure(7,2));
        Piece whiteKing = new Piece(gridSize, 256, 448, "/com/gui/chess_in_java/images/white_king.png", gamehandler.getBoard().getFigure(7,3));
        Piece whiteQueen = new Piece(gridSize, 192, 448, "/com/gui/chess_in_java/images/white_Queen.png", gamehandler.getBoard().getFigure(7,4));
        Piece whiteBishop2 = new Piece(gridSize, 320, 448, "/com/gui/chess_in_java/images/white_bishop.png", gamehandler.getBoard().getFigure(7,5));
        Piece whiteKnight2 = new Piece(gridSize, 384, 448, "/com/gui/chess_in_java/images/white_knight.png", gamehandler.getBoard().getFigure(7,6));
        Piece whiteRook2 = new Piece(gridSize, 448, 448, "/com/gui/chess_in_java/images/white_rook.png", gamehandler.getBoard().getFigure(7,7));
        Piece whitePawn1= new Piece(gridSize, 0, 384, "/com/gui/chess_in_java/images/white_pawn.png", gamehandler.getBoard().getFigure(6,0));
        Piece whitePawn2= new Piece(gridSize, 64, 384, "/com/gui/chess_in_java/images/white_pawn.png", gamehandler.getBoard().getFigure(6,1));
        Piece whitePawn3= new Piece(gridSize, 128, 384, "/com/gui/chess_in_java/images/white_pawn.png", gamehandler.getBoard().getFigure(6,2));
        Piece whitePawn4= new Piece(gridSize, 192, 384, "/com/gui/chess_in_java/images/white_pawn.png", gamehandler.getBoard().getFigure(6,3));
        Piece whitePawn5= new Piece(gridSize, 256, 384, "/com/gui/chess_in_java/images/white_pawn.png", gamehandler.getBoard().getFigure(6,4));
        Piece whitePawn6= new Piece(gridSize, 320, 384, "/com/gui/chess_in_java/images/white_pawn.png", gamehandler.getBoard().getFigure(6,5));
        Piece whitePawn7= new Piece(gridSize, 384, 384, "/com/gui/chess_in_java/images/white_pawn.png", gamehandler.getBoard().getFigure(6,6));
        Piece whitePawn8= new Piece(gridSize, 448, 384, "/com/gui/chess_in_java/images/white_pawn.png", gamehandler.getBoard().getFigure(6,7));

        anchorPane.getChildren().add(whiteRook1.getImg());
        anchorPane.getChildren().add(whiteKnight1.getImg());
        anchorPane.getChildren().add(whiteBishop1.getImg());
        anchorPane.getChildren().add(whiteKing.getImg());
        anchorPane.getChildren().add(whiteQueen.getImg());
        anchorPane.getChildren().add(whiteBishop2.getImg());
        anchorPane.getChildren().add(whiteKnight2.getImg());
        anchorPane.getChildren().add(whiteRook2.getImg());
        anchorPane.getChildren().add(whitePawn1.getImg());
        anchorPane.getChildren().add(whitePawn2.getImg());
        anchorPane.getChildren().add(whitePawn3.getImg());
        anchorPane.getChildren().add(whitePawn4.getImg());
        anchorPane.getChildren().add(whitePawn5.getImg());
        anchorPane.getChildren().add(whitePawn6.getImg());
        anchorPane.getChildren().add(whitePawn7.getImg());
        anchorPane.getChildren().add(whitePawn8.getImg());
        draggableMakerGrid.makeDraggable(whiteRook1);
        draggableMakerGrid.makeDraggable(whiteKnight1);
        draggableMakerGrid.makeDraggable(whiteBishop1);
        draggableMakerGrid.makeDraggable(whiteKing);
        draggableMakerGrid.makeDraggable(whiteQueen);
        draggableMakerGrid.makeDraggable(whiteBishop2);
        draggableMakerGrid.makeDraggable(whiteKnight2);
        draggableMakerGrid.makeDraggable(whiteRook2);
        draggableMakerGrid.makeDraggable(whitePawn1);
        draggableMakerGrid.makeDraggable(whitePawn2);
        draggableMakerGrid.makeDraggable(whitePawn3);
        draggableMakerGrid.makeDraggable(whitePawn4);
        draggableMakerGrid.makeDraggable(whitePawn5);
        draggableMakerGrid.makeDraggable(whitePawn6);
        draggableMakerGrid.makeDraggable(whitePawn7);
        draggableMakerGrid.makeDraggable(whitePawn8);
    }

    public void initializeBlackPieces(){
        Piece blackRook1 = new Piece(gridSize, 0, 0, "/com/gui/chess_in_java/images/black_rook.png", gamehandler.getBoard().getFigure(0,0));
        Piece blackKnight1 = new Piece(gridSize, 64, 0, "/com/gui/chess_in_java/images/black_knight.png",gamehandler.getBoard().getFigure(0,1));
        Piece blackBishop1 = new Piece(gridSize, 128, 0, "/com/gui/chess_in_java/images/black_bishop.png", gamehandler.getBoard().getFigure(0,2));
        Piece blackKing = new Piece(gridSize, 256, 0, "/com/gui/chess_in_java/images/black_king.png", gamehandler.getBoard().getFigure(0,3));
        Piece blackQueen = new Piece(gridSize, 192, 0, "/com/gui/chess_in_java/images/black_Queen.png", gamehandler.getBoard().getFigure(0,4));
        Piece blackBishop2 = new Piece(gridSize, 320, 0, "/com/gui/chess_in_java/images/black_bishop.png", gamehandler.getBoard().getFigure(0,5));
        Piece blackKnight2 = new Piece(gridSize, 384, 0, "/com/gui/chess_in_java/images/black_knight.png", gamehandler.getBoard().getFigure(0,6)) ;
        Piece blackRook2 = new Piece(gridSize, 448, 0, "/com/gui/chess_in_java/images/black_rook.png", gamehandler.getBoard().getFigure(0,7));
        Piece blackPawn1= new Piece(gridSize, 0, 64, "/com/gui/chess_in_java/images/black_pawn.png", gamehandler.getBoard().getFigure(1,0));
        Piece blackPawn2= new Piece(gridSize, 64, 64, "/com/gui/chess_in_java/images/black_pawn.png", gamehandler.getBoard().getFigure(1,1));
        Piece blackPawn3= new Piece(gridSize, 128, 64, "/com/gui/chess_in_java/images/black_pawn.png", gamehandler.getBoard().getFigure(1,2));
        Piece blackPawn4= new Piece(gridSize, 192, 64, "/com/gui/chess_in_java/images/black_pawn.png", gamehandler.getBoard().getFigure(1,3));
        Piece blackPawn5= new Piece(gridSize, 256, 64, "/com/gui/chess_in_java/images/black_pawn.png",  gamehandler.getBoard().getFigure(1,4));
        Piece blackPawn6= new Piece(gridSize, 320, 64, "/com/gui/chess_in_java/images/black_pawn.png", gamehandler.getBoard().getFigure(1,5));
        Piece blackPawn7= new Piece(gridSize, 384, 64, "/com/gui/chess_in_java/images/black_pawn.png", gamehandler.getBoard().getFigure(1,6));
        Piece blackPawn8= new Piece(gridSize, 448, 64, "/com/gui/chess_in_java/images/black_pawn.png", gamehandler.getBoard().getFigure(1,7));

        anchorPane.getChildren().add(blackRook1.getImg());
        anchorPane.getChildren().add(blackKnight1.getImg());
        anchorPane.getChildren().add(blackBishop1.getImg());
        anchorPane.getChildren().add(blackKing.getImg());
        anchorPane.getChildren().add(blackQueen.getImg());
        anchorPane.getChildren().add(blackBishop2.getImg());
        anchorPane.getChildren().add(blackKnight2.getImg());
        anchorPane.getChildren().add(blackRook2.getImg());
        anchorPane.getChildren().add(blackPawn1.getImg());
        anchorPane.getChildren().add(blackPawn2.getImg());
        anchorPane.getChildren().add(blackPawn3.getImg());
        anchorPane.getChildren().add(blackPawn4.getImg());
        anchorPane.getChildren().add(blackPawn5.getImg());
        anchorPane.getChildren().add(blackPawn6.getImg());
        anchorPane.getChildren().add(blackPawn7.getImg());
        anchorPane.getChildren().add(blackPawn8.getImg());
        draggableMakerGrid.makeDraggable(blackRook1);
        draggableMakerGrid.makeDraggable(blackKnight1);
        draggableMakerGrid.makeDraggable(blackBishop1);
        draggableMakerGrid.makeDraggable(blackKing);
        draggableMakerGrid.makeDraggable(blackQueen);
        draggableMakerGrid.makeDraggable(blackBishop2);
        draggableMakerGrid.makeDraggable(blackKnight2);
        draggableMakerGrid.makeDraggable(blackRook2);
        draggableMakerGrid.makeDraggable(blackPawn1);
        draggableMakerGrid.makeDraggable(blackPawn2);
        draggableMakerGrid.makeDraggable(blackPawn3);
        draggableMakerGrid.makeDraggable(blackPawn4);
        draggableMakerGrid.makeDraggable(blackPawn5);
        draggableMakerGrid.makeDraggable(blackPawn6);
        draggableMakerGrid.makeDraggable(blackPawn7);
        draggableMakerGrid.makeDraggable(blackPawn8);
    }

}