package com.chess.logik;

public class Chessboard {
    Figure[][] board;
    public Chessboard(){
        board = new Figure[8][8];
    }

    public void setFigure(Figure f, int row, int column){
        board[row][column] = f;
    }

    public Figure getFigure(int row, int column){
        if (row >= 0 && row < board.length && column >= 0 && column < board[row].length) {
            return board[row][column];
        } else {
            return null;
        }
    }


    public Figure[][] getBoard() {
        return board;
    }

    public void setBoard(Figure[][] board) {
        this.board = board;
    }
}
