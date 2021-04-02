import java.util.Scanner;

public class Program1and2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a: ");
        float a = scanner.nextFloat();
        System.out.println("Input b: ");
        float b = scanner.nextFloat();
        scanner.close();
        try {
            float result = divide(a, b);

            System.out.println("Divide result: " + result);
        }
        // Question 1
        catch (Exception e) {
            System.out.println("Can't divide zero!");
        }
        // Question 2
        finally {
            System.out.println("Divide completed!");
        }
    }

    public static float divide(float a, float b) {
        return a / b;
    }
}
