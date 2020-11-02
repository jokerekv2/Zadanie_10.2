public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {
    @Override
    public double shapeArea(Shape shape) {
        return shape.shapeCalculations();
    }

    @Override
    public double volume(Shape shape) {
        return shape.shapeCalculations();
    }

}
