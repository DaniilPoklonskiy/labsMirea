package ru.mirea.lab1;
import java.util.Scanner;
public class Example2{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();

            int[] arr = new int[size];

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                System.out.print("Элемент " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }

            int sum = 0;
            int max = arr[0];
            int min = arr[0];
            int i = 0;

            do {
                sum += arr[i];
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
                i++;
            } while (i < size);

            System.out.println("Сумма элементов массива: " + sum);
            System.out.println("Максимальный элемент: " + max);
            System.out.println("Минимальный элемент: " + min);

        }
    }

