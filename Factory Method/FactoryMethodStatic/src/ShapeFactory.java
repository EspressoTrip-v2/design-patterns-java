public class ShapeFactory {

    public static Shape getShape(String shape) {
        switch (shape.toLowerCase()) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            case "rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }
}
