interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}
class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        if (shape1 != null) {
            shape1.draw();
        } else {
            System.out.println("Shape not found");
        }

        // Get an object of Square and call its draw method.
        Shape shape2 = shapeFactory.getShape("SQUARE");
        if (shape2 != null) {
            shape2.draw();
        } else {
            System.out.println("Shape not found");
        }

        // Get an object of Rectangle and call its draw method.
        Shape shape3 = shapeFactory.getShape("RECTANGLE");
        if (shape3 != null) {
            shape3.draw();
        } else {
            System.out.println("Shape not found");
        }

        // Attempt to get a shape that does not exist
        Shape shape4 = shapeFactory.getShape("TRIANGLE");
        if (shape4 != null) {
            shape4.draw();
        } else {
            System.out.println("Shape not found");
        }
    }
}

