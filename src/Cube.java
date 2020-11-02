public class Cube extends Shape3D {
    private double a;

    public Cube(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double shapeCalculations() {
        return Math.pow(a, 3);
    }

    @Override
    public String toString() {
        return "Objętość sześcianu o boku " + a + " wynosi: " + shapeCalculations();
    }
}
