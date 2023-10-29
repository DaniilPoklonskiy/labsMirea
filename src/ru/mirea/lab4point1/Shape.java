package ru.mirea.lab4point1;
import java.math.*;
public class Shape {
    public String getType(){
        return "Shape";
    }
    public double getArea() {
        return 0;
    }
    public double getPerimetr(){
        return 0;
    }
    public String toString(){
        return "This is a shape";
    }
}
class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public String getType(){
        return "Circle";
    }
    @Override
    public double getArea(){
        return Math.PI* radius * radius;
    }
    @Override
    public double getPerimetr(){
        return 2*Math.PI*radius;
    }
    @Override
    public String toString(){
        return "This is a Circle with radius:" + radius;
    }
}
class Rectangle extends Shape {
    private double longg;
    private double wide;

    public Rectangle(double longg, double wide) {
        this.longg = longg;
        this.wide = wide;
    }
    @Override
    public String getType(){
        return "Rectangle";
    }
    @Override
    public double getArea(){
        return longg*wide;
    }
    public double getPerimetr(){
        return longg*longg*wide*wide;
    }
    @Override
    public String toString(){
        return "This is a Shape with long\n" + longg + "\nand wide\n" + wide;
    }
}
class Square extends Shape{
    private double longgg;
    public Square(double longgg){
        this.longgg=longgg;
    }
    @Override
    public String getType(){
        return "Square";
    }
    @Override
    public double getArea(){
        return longgg*longgg;
    }
    @Override
    public double getPerimetr(){
        return 4*longgg;
    }
    @Override
    public String toString(){
        return "This is a Shape with side\n"+ longgg;
    }
}

