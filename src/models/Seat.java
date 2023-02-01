package models;
public class Seat {
    private int row;
    private int number;

    public Seat(int row, int number) {
        this.row = row;
        this.number = number;
    }

    public int getRow() {
        return this.row;
    }

    public int getNumber() {
        return this.number;
    }
}