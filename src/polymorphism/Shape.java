package polymorphism;

public class Shape {
    void draw() {
        System.out.println("Drawing...");
    }
}
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing rectangle...");
    }
}
class Circle extends Shape{
    void draw(){
    System.out.println("Drawing Circle...");}}
class Triangle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing Triangle...");
    }
}
class TestPolymorphism2{
    public static void main(String[] args) {
        Shape s;
        s= new Rectangle();
        s.draw();
        s =new Circle();
        s.draw();
        s= new Triangle();
        s.draw();
    }
}

