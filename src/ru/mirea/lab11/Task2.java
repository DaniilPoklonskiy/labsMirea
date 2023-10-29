package ru.mirea.lab11;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Date currentDate = new Date();

        // Обрезаем миллисекунды, чтобы учесть только секунды
        currentDate.setTime((currentDate.getTime() / 1000) * 1000);

        // Форматируем текущую дату и время в удобный для отображения вид
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String formattedCurrentDate = dateFormat.format(currentDate);

        // Выводим текущую дату и время
        System.out.println("Текущая дата и время: " + formattedCurrentDate);

        // Запрашиваем у пользователя ввод даты
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату (в формате dd-MM-yyyy HH:mm:ss): ");
        String userInput = scanner.nextLine();
        scanner.close();

        // Пытаемся преобразовать введенный текст в объект Date
        try {
            Date userDate = dateFormat.parse(userInput);

            // Сравниваем даты
            if (userDate.before(currentDate)) {
                System.out.println("Введенная дата меньше текущей даты.");
            } else if (userDate.after(currentDate)) {
                System.out.println("Введенная дата больше текущей даты.");
            } else {
                System.out.println("Введенная дата и текущая дата равны.");
            }
        } catch (Exception e) {
            System.err.println("Ошибка ввода даты. Пожалуйста, введите дату в правильном формате.");
        }
    }
}

