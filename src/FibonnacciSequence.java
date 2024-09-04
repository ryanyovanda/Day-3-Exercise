import java.util.Scanner;

//Write a function to reverse a string without using built-in reverse functions.
public class FibonnacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Fibonaci Sequence extractor");
        System.out.println("Enter the number= ");
        int n = scanner.nextInt();

        if (n<=0){
            System.out.println("Invalid number, please use positive integer");
        } else {
            System.out.println("Fibonacci sequence up to " + n + " terms: ");

            int firstTerm = 0;
            int secondTerm = 1;

            for (int i = 1; i <= n; i++) {
                System.out.print(firstTerm + " ");

                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }
    }
}

