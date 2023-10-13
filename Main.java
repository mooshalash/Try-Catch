import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Enter first number");
            int firstNumber = in.nextInt();
            System.out.println("Enter second number");
            int secondNumber = in.nextInt();
            System.out.println("Sum = " + firstNumber / secondNumber);
            secondNumber =0;
        } catch (Exception e) {
            System.out.println("Cannot divide on zero");

        }
    }
}