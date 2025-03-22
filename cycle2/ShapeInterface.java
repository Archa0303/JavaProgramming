interface Shape {
    double calculateArea();
}

class Triangle implements Shape {
    double base, height;
    
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

class Rectangle implements Shape {
    double length, width;
    
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public double calculateArea() {
        return length * width;
    }
}

class ShapeInterface{
    public static void main(String[] args) {
        Shape s1 = new Triangle(10, 5);
        Shape s2 = new Rectangle(4, 6);
        
        System.out.println("Triangle Area: " + s1.calculateArea());
        System.out.println("Rectangle Area: " + s2.calculateArea());
    }
}
