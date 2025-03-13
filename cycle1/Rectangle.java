class Rectangle {
    double length;
    double width;

    Rectangle() 
    {
        this.length = 1;
        this.width = 1;
    }


    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    
    double calculateArea() {
        return this.length * this.width;
    }

    double calculatePerimeter() {
        return 2 * (this.length + this.width);
    }

    public static void main(String[] args) {
      
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(5, 10);

        System.out.println("Area of rectagle1: " + rect1.calculateArea()); 
        System.out.println("Perimeter of rectangle1: " + rect1.calculatePerimeter());
        System.out.println("Area of rectagle2: " + rect2.calculateArea()); 
        System.out.println("Perimeter of rectangle1: " + rect2.calculatePerimeter());
    }
}
