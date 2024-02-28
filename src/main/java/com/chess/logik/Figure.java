package com.chess.logik;

import javafx.scene.paint.Color;

public abstract class Figure {
    private int fieldMoveSet;
    private int startField;
    private int currentField;
    private char color;

    public Figure(int fieldMoveSet, int startField, int currentField, char color) {
        this.fieldMoveSet = fieldMoveSet;
        this.startField = startField;
        this.currentField = currentField;
        this.color = color;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public abstract void move(int pos);

    public int getFieldMoveSet() {
        return fieldMoveSet;
    }

    public void setFieldMoveSet(int fieldMoveSet) {
        this.fieldMoveSet = fieldMoveSet;
    }

    public int getStartField() {
        return startField;
    }

    public void setStartField(int startField) {
        this.startField = startField;
    }

    public int getCurrentField() {
        return currentField;
    }

    public void setCurrentField(int currentField) {
        this.currentField = currentField;
    }

    public boolean take(Figure f){
        //placeholder!!!!
        return (f.color != color && f.currentField == currentField + fieldMoveSet);
    }
}
