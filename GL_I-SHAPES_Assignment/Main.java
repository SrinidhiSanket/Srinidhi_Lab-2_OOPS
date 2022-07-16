public class Main {
    public static void main(String args[]){

        Circle circle = new Circle("red", 3);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
        circle.renderer.draw();
        circle.renderer.draw("This is a Circle");
        System.out.println();

        Rectangle rectangle  = new Rectangle("orange", 20, 10);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
        rectangle.renderer.draw();
        rectangle.renderer.draw("This is a Rectangle");
        System.out.println();


        Triangle triangle = new Triangle("yellow", 10, 5);
        System.out.println(triangle.calculatePerimeter());
        System.out.println(triangle.calculateArea());
        triangle.renderer.draw();
        triangle.renderer.draw("This is a Traingle");
        System.out.println();


        Square square = new Square("White", 10, 10);
        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimeter());
        square.renderer.draw();
        square.renderer.draw("This is a Square");
    
    }

}
