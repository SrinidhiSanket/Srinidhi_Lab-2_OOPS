public class Rectangle implements IShape {
    
    int length, width;
    String color;
    
    // Renderer renderer;

    public Rectangle(String color, int length, int width){
        this.color = color;
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){
        return this.length * this.width;
    }

    public double calculatePerimeter(){
        return 2*(this.length + this.width);
    }

}
