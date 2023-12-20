package ru.mirea.lab20;

public class Main {
    public static void main(String[] args) {
    Class<Integer, String, Double> object = new Class<>(30, "Danya", 10.9);

    System.out.println("T: " + object.getT());
    System.out.println("V: " + object.getV());
    System.out.println("K: " + object.getK());

    System.out.println(object.toString());

    object.displayTypes();
}
}

