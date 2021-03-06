public class Triangle implements IShape {
    
    int height, base;
    String color;

    public Triangle(String color, int height, int base){
        this.color = color;
        this.height = height;
        this.base = base;
    }

    public double calculateArea(){
        return (this.height * this.base)/2;
    }

    public double calculatePerimeter(){
        return ((this.height + this.base) + Math.sqrt(this.height^2 + this.base^2));
    }

    // Renderer renderer;
}
