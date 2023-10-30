package ru.mirea.lab8;

import java.util.Scanner;

    /* 5. Задание Сумма цифр числа
    Дано натуральное число N. Вычислите сумму его цифр. При решении этой
    задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).*/
    public class Task5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите натуральное число N: ");
            int N = scanner.nextInt();

            int sum = sumOfDigits(N);
            System.out.println("Сумма цифр числа " + N + ": " + sum);
        }

        static int sumOfDigits(int number) {
            // Базовый случай: если число состоит из одной цифры, возвращаем это число
            if (number < 10) {
                return number;
            }
            // Рекурсивный случай: суммируем последнюю цифру с суммой остальных цифр
            else {
                return number % 10 + sumOfDigits(number / 10);
            }
        }
    }

