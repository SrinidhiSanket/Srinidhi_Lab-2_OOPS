public class Square extends Rectangle {

    public Square(String color, int length, int width) {
        super(color, length, width);
    }

    @Override
    public double calculateArea(){
        return this.length * this.width;
        //return super.length * super.width;
    }
    
}
