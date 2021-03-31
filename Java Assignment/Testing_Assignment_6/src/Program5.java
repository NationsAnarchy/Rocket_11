import java.util.InputMismatchException;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) throws Exception {
        // Question 5
        int age = inputAge();
        System.out.println("Input age: " + age);
    }

    private static int inputAge() throws Exception {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input the age: ");
            int age = scanner.nextInt();
            scanner.close();
            return age;
        } catch (InputMismatchException e) {
            throw new Exception("Please input a number for age!");
        }
    }
}
