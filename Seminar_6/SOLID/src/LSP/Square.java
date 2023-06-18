package LSP;

public class Square implements iForm {

    private int side;
    
    /**
     * - Constructor for square
     * @param side - length of the square
     */
    public Square(int side) {
        this.side = side;
    }

    /**
     * - setter for side square
     * @param side
     */
    public void setWidth(int side) {
        this.side = side;
    }

    // - method for calculating the area of a square
    public int area() {
        return this.side * this.side;
    }
}
