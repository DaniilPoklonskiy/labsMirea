package ru.mirea.lab29;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        int[][] matrix = new int[N][N];

        for(int i=0; i<N; i++){
            String line = scanner.nextLine();
            String[] tokens = line.split(" ");

            for(int j=0; j<N; j++){
                matrix[i][j] = Integer.parseInt(tokens[j]);
            }
        }

        int count = 0;
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                count += matrix[i][j];
            }
        }

        System.out.println(count);

    }
}
