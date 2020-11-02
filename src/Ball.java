public class Ball extends Shape3D {
    private double r;

    public Ball(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double shapeCalculations() {
        return 4.0/3.0 * Shape.getPI() * Math.pow(r, 3);
    }

    @Override
    public String toString() {
        return "Objętość kuli o promieniu: " + r + " wynosi: " + shapeCalculations();
    }
}
