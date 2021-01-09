import colors.Color;
import shapes.Shape;

public class Client {
    public static void main(String[] args) {
        System.out.println("***Shape Factory***");
        // Shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
        Shape square = shapeFactory.getShape("square");
        square.draw();
        System.out.println();
        System.out.println("***Color Factory***");
        // Color Factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color red = colorFactory.getColor("red");
        red.fill();
        Color blue = colorFactory.getColor("blue");
        blue.fill();

    }
}
