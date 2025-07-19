package oo.shape;

public class Shape {
    void draw() {}

    public static void main(String[] args){
        Shape[] shapes = new Shape[5];

        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Triangle();
        shapes[3] = new Square();
        shapes[4] = new Triangle();

        for(Shape s : shapes)
            s.draw();
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("oo.shape.Circle.draw()");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("oo.shape.Square.draw()");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("oo.shape.Triangle.draw()");
    }
}