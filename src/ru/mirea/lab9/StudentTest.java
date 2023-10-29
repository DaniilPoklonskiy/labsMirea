package ru.mirea.lab9;
import java.util.Arrays;
    public class StudentTest {
        public static void main(String[] args) {
            // Создаем массив объектов класса Student
            Student[] students = new Student[5];
            students[0] = new Student("Dima", 123);
            students[1] = new Student("Alice", 456);
            students[2] = new Student("Boris", 789);
            students[3] = new Student("David", 234);
            students[4] = new Student("Elena", 567);

            // Выводим несортированный массив
            System.out.println("Before sorting:");
            for (Student student : students) {
                System.out.println(student);
            }

            // Сортируем массив по полю iDNumber с помощью сортировки вставками
            for (int i = 1; i < students.length; i++) {
                Student key = students[i];
                int j = i - 1;
                while (j >= 0 && students[j].getIDNumber() > key.getIDNumber()) {
                    students[j + 1] = students[j];
                    j--;
                }
                students[j + 1] = key;
            }

            // Выводим отсортированный массив
            System.out.println("\nAfter sorting:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    class Student {
        private String name;
        private int iDNumber;

        public Student(String name, int iDNumber) {
            this.name = name;
            this.iDNumber = iDNumber;
        }

        public int getIDNumber() {
            return iDNumber;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", iDNumber=" + iDNumber +
                    '}';
        }
    }

