package com.chess.logik;

public class Gamehandler {
    private Chessboard board;

    public Gamehandler(Chessboard board){
        this.board = board;
    }
    public Chessboard getBoard() {
        return board;
    }

    public void setBoard(Chessboard board) {
        this.board = board;
    }
}
