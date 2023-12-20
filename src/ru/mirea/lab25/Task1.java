package ru.mirea.lab25;

import java.util.Scanner;
import java.util.Arrays;
public class Task1 {
    public static void main(String[] args){
        System.out.println("Enter string>> ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println("Enter pattern>> ");
        String pattern = scanner.nextLine();
        System.out.println(Arrays.toString(string.split(pattern)));
    }

}
