package ru.mirea.lab4point1;

public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5);
        System.out.println(shape1.getType());
        System.out.println(shape1.getArea());
        System.out.println(shape1.getPerimetr());
        System.out.println(shape1.toString());
        Shape shape2 = new Rectangle(5,5);
        System.out.println(shape2.getType());
        System.out.println(shape2.getArea());
        System.out.println(shape2.getPerimetr());
        System.out.println(shape2.toString());
        Shape shape3 = new Square(6);
        System.out.println(shape3.getType());
        System.out.println(shape3.getArea());
        System.out.println(shape3.getPerimetr());
        System.out.println(shape3.toString());
    }
}
