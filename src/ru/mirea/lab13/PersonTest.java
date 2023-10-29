package ru.mirea.lab13;

public class PersonTest {
    public static void main(String[] args) {
    Person person1 = new Person("Иванов", "Иван", "Иванович");
    System.out.println(person1.getFullName()); // Иванов И.И.

    Person person2 = new Person("Петров", "", "Петрович");
    System.out.println(person2.getFullName()); // Петров П.

    Person person3 = new Person("Сидоров", "Алексей", null);
    System.out.println(person3.getFullName()); // Сидоров А.
}
}

