package CW_Day6;
import java.util.Scanner;

public class ArraySquaresCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] squares = new int[n];
        int[] cubes = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            squares[i] = arr[i] * arr[i];
            cubes[i] = arr[i] * arr[i] * arr[i];
        }

        System.out.println("Original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Squares array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(squares[i] + " ");
        }
        System.out.println();

        System.out.println("Cubes array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(cubes[i] + " ");
        }
        System.out.println();

      
    }
}
