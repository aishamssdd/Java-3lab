public class Square extends Rectangle{

    private int xTopLeftCoordinate;
    private int yTopLeftCoordinate;
    private int sideLength;


    public Square() {
    }

    public Square(int xTopLeftCoordinate, int yTopLeftCoordinate, int sideLength) {
        this.x1 = xTopLeftCoordinate;
        this.y1 = yTopLeftCoordinate;
        this.sideLength = sideLength;
    }


    public Square(String color, boolean filled, int x1, int x2, int y1, int y2, int xTopLeftCoordinate, int yTopLeftCoordinate, int sideLength) {
        super(color, filled, x1, x2, y1, y2);
        this.x1 = xTopLeftCoordinate;
        this.y1 = yTopLeftCoordinate;
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return (int) Math.sqrt(getLength() * getWidth());
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideLength=" + sideLength +
                ", x1=" + x1 +
                ", x2=" + x2 +
                ", y1=" + y1 +
                ", y2=" + y2 +
                ", which is subclass of" + super.toString() +
                '}';
    }

    public int getCircumference() {
        return 4*getSideLength();
    }
}