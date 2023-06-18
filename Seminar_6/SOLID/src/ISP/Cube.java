package ISP;

public class Cube implements iShapeCube {
    private int margin;

    /**
     * - Constructor for cube
     * @param margin - long of margin
     */
    public Cube(int margin) {
        this.margin = margin;
    }

    @Override
    public double volume() {
        return margin * margin * margin;
    }
}
