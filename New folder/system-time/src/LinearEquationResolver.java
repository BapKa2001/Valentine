import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as ' x + b = c', please enter constants");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        System.out.println("c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer); // \n xuống dòng=> đáp án cùa mình sẽ5
        } else {
            if (b == c) {
                System.out.print("The Solution is all x!");
            } else {
                System.out.print("No soulution!");
            }

        }
    }
}
