package ru.mirea.lab11;

import java.util.Date;

    public class Task1 {
        public static void main(String[] args) {
            String developerName = "Поклонский";

            // Дата и время получения задания
            Date assignmentReceivedDate = new Date();
            long assignmentReceivedTimeMillis = assignmentReceivedDate.getTime();

            // Дата и время сдачи задания
            long assignmentDueTimeMillis = assignmentReceivedTimeMillis + 7 * 24 * 60 * 60 * 1000; // 7 дней в миллисекундах
            Date assignmentDueDate = new Date(assignmentDueTimeMillis);

            System.out.println("Фамилия разработчика: " + developerName);
            System.out.println("Дата и время получения задания: " + assignmentReceivedDate);
            System.out.println("Дата и время сдачи задания: " + assignmentDueDate);
        }
}
