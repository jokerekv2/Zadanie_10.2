public class Line2D extends Shape2D {
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public Line2D(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double shapeCalculations() {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    @Override
    public String toString() {
        return "Długość lini o współrzędnych {x1 = " + x1 + ", y1 = " + y1 + ", x2 = " + x2 + " y2 = " + y2 + "} wynosi: " +
                shapeCalculations();
    }
}
