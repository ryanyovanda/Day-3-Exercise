import java.util.Scanner;

// Write a program to find the second smallest element in an array.
public class SmallestElement {

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
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                // Update second smallest before updating smallest
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element.");
        } else {
            System.out.println("Second smallest element is: " + secondSmallest);
        }
    }
}