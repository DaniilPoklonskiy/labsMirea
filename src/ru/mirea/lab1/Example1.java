package ru.mirea.lab1;
import java.util.Scanner;
public class Example1{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Введите кол-во элементов массива");

            int size = sc.nextInt();
            int[] array = new int[size];

            for (int i = 0; i < size; i++){
                System.out.println("Введите элемент массива #" + (i+1)+":");
                array[i] = sc.nextInt();
            }

            int sumArray = 0;
            for (int i = 0; i < size; i++){
                sumArray += array[i];
            }
            System.out.println("Сумма элементов массива:" + sumArray);

            double averange = (double) sumArray/size;
            System.out.println("Среднее арифметическое: " + averange);

            sc.close();
        }}

