public class Main {
    public static void main(String[] args) {
        // Get Shape Factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");

        // Get an Object of Shape Circle
        Shape shape1 = shapeFactory.getShape("Circle");
        // Call draw method of Shape Circle
        shape1.draw();

        // Get an Object of Shape Rectangle
        Shape shape2 = shapeFactory.getShape("Rectangle");
        // Call draw method of Shape Rectangle
        shape2.draw();

        // Get an Object of Shape Square
        Shape shape3 = shapeFactory.getShape("Square");
        // Call draw method of Shape Square
        shape3.draw();

        // Get Color Factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");

        // Get an Object of Color Red
        Color color1 = colorFactory.getColor("Red");
        // Call fill method of Red
        color1.fill();

        // Get an Object of Color Green
        Color color2 = colorFactory.getColor("Green");
        // Call fill method of Green
        color2.fill();

        // Get an Object of Color Blue
        Color color3 = colorFactory.getColor("Blue");
        // Call fill method of Blue
        color3.fill();
    }
}