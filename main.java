import java.util.Scanner;

public class main {

    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }

    static double power(double a, int b) {
        double result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        return result;
    }

    static double modulus(double a, double b) {
        return a % b;
    }

    static double squareRoot(double a) {
        if (a < 0) {
            System.out.println("Cannot find square root of negative number");
            return 0;
        }
        return Math.sqrt(a);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("Simple Calculator Program:");

        while (running) {

            System.out.println("\nChoose operation:");
            System.out.println("+  Addition");
            System.out.println("-  Subtraction");
            System.out.println("*  Multiplication");
            System.out.println("/  Division");
            System.out.println("^  Power");
            System.out.println("%  Modulus");
            System.out.println("s  Square Root");
            System.out.println("e  Exit");

            System.out.print("Enter your choice: ");
            char choice = sc.next().toLowerCase().charAt(0);

            if (choice == 'e') {
                running = false;
                continue;
            }

            double num1;
            double num2;
            double result = 0;

            if (choice == 's') {
                System.out.print("Enter number: ");
                num1 = sc.nextDouble();
                result = squareRoot(num1);
            } else {
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();

                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();

                switch (choice) {
                    case '+':
                        result = add(num1, num2);
                        break;
                    case '-':
                        result = subtract(num1, num2);
                        break;
                    case '*':
                        result = multiply(num1, num2);
                        break;
                    case '/':
                        result = divide(num1, num2);
                        break;
                    case '^':
                        System.out.println("Note: second number will be treated as integer");
                        result = power(num1, (int) num2);
                        break;
                    case '%':
                        result = modulus(num1, num2);
                        break;
                    default:
                        System.out.println("Invalid operation");
                        continue;
                }
            }

            System.out.println("Result: " + result);
        }

        sc.close();
        System.out.println("Calculator closed");
    }
}