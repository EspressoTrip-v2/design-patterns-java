public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        switch (choice.toLowerCase()) {
            case "color":
                return new ColorFactory();
            case "shape":
                return new ShapeFactory();
            default:
                return null;
        }
    }
}
