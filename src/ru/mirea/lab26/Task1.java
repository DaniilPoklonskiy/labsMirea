package ru.mirea.lab26;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Task1 {
    private static void reverse(List list) {
        Collections.reverse(list);
    }

    private static int[] reverseArray(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int element : array) {
            list.add(element);
        }
        reverse(list);
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] reversed = reverseArray(array);

        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }
}
