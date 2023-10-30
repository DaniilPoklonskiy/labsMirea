package ru.mirea.lab8;




import java.util.Scanner;

    /* 6. Задание Проверка числа на простоту
    Дано натуральное число n>1. Проверьте, является ли оно простым.
    Программа должна вывести слово YES, если число простое и NO, если число
    составное. Алгоритм должен иметь сложность O(logn). */
    public class Task6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите натуральное число n (>1): ");
            int n = scanner.nextInt();

            if (isPrime(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        static boolean isPrime(int n) {
            // Базовый случай: 2 и 3 - простые числа
            if (n == 2 & n % 2 == 0) {
                return false;
            }

            // Проверяем простоту по тесту Ферма
            int k = 5; // Количество проверок
            for (int i = 0; i < k; i++) {
                int a = 2 + (int) (Math.random() % (n - 3));
                if (gcd(a, n) != 1 || power(a, n - 1, n) != 1) {
                    return false;
                }
            }

            return true;
        }

        static int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        static int power(int x, int y, int p) {
            int result = 1;
            x = x % p;
            while (y > 0) {
                if (y % 2 == 1) {
                    result = (result * x) % p;
                }
                y = y >> 1;
                x = (x * x) % p;
            }
            return result;
        }
    }


