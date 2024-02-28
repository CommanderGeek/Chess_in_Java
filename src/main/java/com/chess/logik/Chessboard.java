package com.chess.logik;

public class Chessboard {
    Figure[][] board;
    public Chessboard(){
        board = new Figure[8][8];
    }

    public void setFigure(Figure f, int row, int column){
        board[row][column] = f;
    }
}
