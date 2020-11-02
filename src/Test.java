public class Test {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(4);
        shapes[1] = new Cube(3);
        shapes[2] = new Line2D(-3, 1, -2, 4);
        shapes[3] = new Rectangle(3, 4);
        shapes[4] = new Ball(5);

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }

    }
}
