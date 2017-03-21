package org.academiadecodigo.carcrash.field;

public class Position {
    private int actualCol;
    private int actualRow;


    public int getCol() {
        return actualCol;
    }

    public int getRow() {
        return actualRow;
    }

    public int  setCol(int num){
        actualCol = num;
        return actualCol;
    }

    public int setRow(int num){
        actualRow = num;
        return actualRow;
    }

    public Moves movesChoice(){
        int choice = (int) (Math.random() * (Moves.values().length));
        return Moves.values()[choice];
    }

    public boolean crashed(Position position){
        return position.getCol() == this.getCol() && position.getRow() == this.getRow();
    }


}
