package LSP;

public class Rectangle implements iForm{
    private int hight;
    private int width;

    /**
     * - constructor for rectangle
     * @param hight
     * @param width
     */
    public Rectangle(int hight, int width) {
        this.hight = hight;
        this.width = width;
    }

    
    /**
     * - Getter/Setter for rectangle
     * @param hight
     * @param hight
     */
    public void setHight(int hight) {
        this.hight = hight;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    // - method for calculating the area of a rectangle
    public int area() {
        return this.width * this.hight;
    }
}
