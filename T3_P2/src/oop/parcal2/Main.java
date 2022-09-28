package oop.parcal2;

import java.util.LinkedList;
import java.util.List;


abstract class Shape{
    private final String name;

    protected Shape(String name){
        this.name = name;
    }

    public abstract int getArea();
    public abstract int getPerimeter();
    public abstract int getSidesCount();
    public final String getName() {
        return name;
    }
}

class Square extends Shape {
    private int side;

    public Square(){
        super("Cuadrado");
    }
    public Square(int side){
        super("Cuadrado");
        this.side = side;
    }

    public void setSide(int side){
        this.side = side;
    }
    public int getSide(){
        return side;
    }

    public int getArea() {
        return side*side;
    }
    public int getPerimeter() {
        return side*4;
    }
    public int getSidesCount() {
        return 4;
    }
}

class Rectangle extends Shape {
    private int height;
    private int base;

    public Rectangle() {
        super("Rectángulo");
    }
    public Rectangle(int base, int height) {
        super("Rectángulo");
        this.base = base;
        this.height = height;
    }


    public void setBase(int base) {
        this.base = base;
    }
    public float getBase() {
        return base;
    }


    public void setHeight(int height) {
        this.height = height;
    }
    public float getHeight() {
        return height;
    }

    public int getArea() {
        return base * height;
    }
    public int getPerimeter() {
        return (2 * base + 2 * height);
    }
    public int getSidesCount() {
        return 4;
    }
}

 class Triangle extends Shape {
    private int height;
    private int base;

    public Triangle(int base, int height) {
        super("Triangulo");
        this.base = base;
        this.height = height;
    }

    public Triangle() {
        super("Triangulo");
    }

    public void setBase(int base) {
        this.base = base;
    }
    public float getBase() {
        return base;
    }


    public void setHeight(int height) {
        this.height = height;
    }
    public float getHeight() {
        return height;
    }

    public int getArea() {
        return base * height;
    }
    public int getPerimeter() {
        return (base*3);
    }
     public int getSidesCount() {
         return 3;
     }
}

class Circle extends Shape {
    private float radio;

    public float getRadio() {
        return radio;
    }
    public void setRadio(float radio) {
        this.radio = radio;
    }

    public Circle() {
        super("Circulo");
    }
    public Circle(float radio) {
        super("Circulo");
        this.radio = radio;
    }
    public int getArea() {
        return (int) (Math.PI * radio * radio);
    }
    public int getPerimeter() {
        return (int) (Math.PI * radio * 2);
    }
    public int getSidesCount() {
        return 1;
    }
}


public class Main {

    public static void main(String[] args) {
        List<Shape> shapes = new LinkedList<>();


        shapes.add(new Square(10)); // providing side
        shapes.add(new Rectangle(10, 20)); // providing base and height
        shapes.add(new Triangle(10, 20)); // providing base and height
        shapes.add(new Circle(10)); // providing radio


        for(Shape shape: shapes){
            System.out.println("Shape: " + shape.getName() + ": " + shape); //with shape print something related to the actual shape, for example ○ ▲ ■ █
            System.out.println("Real class name: " + shape.getClass().getName());
            System.out.println("Sides count: " + shape.getSidesCount());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println("Area: " + shape.getArea());
            System.out.println("---------------------------------------");
        }

    }
}