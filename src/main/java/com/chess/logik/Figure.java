package com.chess.logik;

public abstract class Figure {
    private int row;
    private int column;
    private char color;

    public Figure(int row, int column, char color) {
        this.row = row;
        this.column = column;
        this.color = color;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }




    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
