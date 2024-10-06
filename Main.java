class Shape{
    public void draw(){
        System.out.println("Draw shape");
    }
}
class Circle extends Shape{
     @Override
    public void draw(){
        System.out.println
    ("Draw circle");
    }
}
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape circle = new Circle();
        
        shape.draw();    
        circle.draw();   
    }
}