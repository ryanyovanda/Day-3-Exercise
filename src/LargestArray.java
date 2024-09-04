//Write a program to find the largest element in an array.

import java.util.Scanner;

public class LargestArray {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many array number elements you want to store");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Elements are");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);

        }
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Maximum element is =" + max);
        }
}
