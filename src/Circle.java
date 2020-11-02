public class Circle extends GeometricShape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double shapeCalculations() {
        return Math.pow(r, 2) * Shape.getPI();
    }

    @Override
    public String toString() {
        return "Pole koła o promieniu " + r + " wynosi: " + shapeCalculations();
    }
}
