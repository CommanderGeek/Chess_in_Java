package com.chess.logik;

import com.gui.chess_in_java.ChessApplication;

public class Gamehandler {
    private Chessboard board;

    public Gamehandler(Chessboard board){
        this.board = board;
    }

    public Gamehandler(){
        this.board = new Chessboard();
        initializeField();
    }
    public Chessboard getBoard() {
        return board;
    }

    public void setBoard(Chessboard board) {
        this.board = board;
    }

    public void initializeField(){
        board.setFigure(new Rook(0,0, 'b'), 0,0);
        board.setFigure(new Knight(0,1, 'b'), 0,1);
        board.setFigure(new Bishop(0,2,'b'),0,2);
        board.setFigure(new Queen(0,3, 'b'), 0,3);
        board.setFigure(new King(0,4,'b'), 0,4);
        board.setFigure(new Bishop(0,5,'b'),0,5);
        board.setFigure(new Knight(0,6, 'b'), 0,6);
        board.setFigure(new Rook(0,7, 'b'), 0,7);

        for (int i = 0; i < board.getBoard()[0].length; i++) {
            board.setFigure(new Pawn(1,i,'b'),1,i);
            board.setFigure(new Pawn(6,i,'w'),6,i);
        }

        board.setFigure(new Rook(7,0, 'w'), 7,0);
        board.setFigure(new Knight(7,1, 'w'), 7,1);
        board.setFigure(new Bishop(7,2,'w'),7,2);
        board.setFigure(new Queen(7,3, 'w'), 7,3);
        board.setFigure(new King(7,4,'w'), 7,4);
        board.setFigure(new Bishop(7,5,'w'),7,5);
        board.setFigure(new Knight(7,6, 'w'), 7,6);
        board.setFigure(new Rook(7,7, 'w'), 7,7);
   }



}
