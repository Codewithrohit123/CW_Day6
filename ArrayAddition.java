package CW_Day6;

import java.util.*;

public class ArrayAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the arrays: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] sumArr = new int[n];

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sumArr[i] = arr1[i] + arr2[i];
        }

        System.out.println("Sum of the arrays:");
        for (int i = 0; i < n; i++) {
            System.out.print(sumArr[i] + " ");
        }

    
    }
}