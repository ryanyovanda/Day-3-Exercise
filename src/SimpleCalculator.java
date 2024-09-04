import java.util.Scanner;

//Implement a simple calculator that can perform addition, subtraction, multiplication, and division.
public class SimpleCalculator {
    public static void main(String[] args) {
        int num1;
        int num2;
        String operation;

        System.out.println("Welcome to Simple Calculator!");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter operation(+,-,/,*): ");
        operation = input2.next();

        if (operation.equals("+")) {
            System.out.println(num1 + num2);
        }if (operation.equals("-")) {
            System.out.println(num1 - num2);
        }if (operation.equals("*")) {
            System.out.println(num1 * num2);
        }if (operation.equals("/")) {
            System.out.println(num1 / num2);
        }

    }
}
