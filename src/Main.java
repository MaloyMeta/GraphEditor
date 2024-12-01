public class Main {
    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();

        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        Shape hexagon = new Hexagon();

        printer.printShapeName(circle);
        printer.printShapeName(quad);
        printer.printShapeName(rectangle);
        printer.printShapeName(triangle);
        printer.printShapeName(hexagon);
    }
}