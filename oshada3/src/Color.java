interface Color {
    void applyColor();
}

// Concrete Implementations
class RedColor implements Color {
    public void applyColor() {
        System.out.println("Applying red color");
    }
}

class GreenColor implements Color {
    public void applyColor() {
        System.out.println("Applying green color");
    }
}

// Abstraction Class
abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}

// Refined Abstraction Classes
class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.print("Drawing Circle with ");
        color.applyColor();
    }
}

class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.print("Drawing Square with ");
        color.applyColor();
    }
}

// Client
class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedColor());
        Shape greenSquare = new Square(new GreenColor());

        redCircle.draw();
        greenSquare.draw();
    }
}

