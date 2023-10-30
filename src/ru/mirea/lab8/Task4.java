package ru.mirea.lab8;

import java.util.Scanner;

/* Вариант 21 задание 4
4. Задание Заданная сумма цифр
Даны натуральные числа k и s. Определите, сколько существует k-значных
натуральных чисел, сумма цифр которых равна d. Запись натурального числа не
может начинаться с цифры 0.
В этой задаче можно использовать цикл для перебора всех цифр, стоящих
70
на какой-либо позиции. */

    public class Task4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите k (количество цифр) и s (сумму цифр): ");
            int k = scanner.nextInt();
            int s = scanner.nextInt();

            int count = countNumbers(k, s);
            System.out.println("Количество " + k + "-значных чисел с суммой цифр " + s + ": " + count);
        }

        static int countNumbers(int k, int s) {
            int count = 0;

            // Начинаем с минимального k-значного числа, где каждая цифра равна 1
            int minNumber = (int) Math.pow(10, k - 1);

            // Завершаем на максимальном k-значном числе, где каждая цифра равна 9
            int maxNumber = (int) Math.pow(10, k) - 1;

            for (int i = minNumber; i <= maxNumber; i++) {
                if (sumOfDigits(i) == s) {
                    count++;
                }
            }

            return count;
        }

        static int sumOfDigits(int number) {
            int sum = 0;

            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }

            return sum;
        }
    }

