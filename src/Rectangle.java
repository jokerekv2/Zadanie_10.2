public class Rectangle extends GeometricShape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double shapeCalculations() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Pole prostokąta o bokach {a = " + a + ", b = " + b + " } wynosi: " + shapeCalculations();
    }
}
