import java.util.Scanner;

public class Program5and6 {
    public static void main(String[] args) {
        // Question 5 + 6
        System.out.print("Please input your age here: ");
        inputAge();        
    }

    public static int inputInt(String message) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (Exception e) {
                System.err.println(message);
            }            
        }        
    }

    public static void inputAge() {
        while (true) {
            int age = inputInt("Incorrect input, please use an int. Please input again.");
            if (age <= 0) {
                System.err.println("Incorrect age, must be a number greater than zero. Please input again.");
            } else {
                System.out.println("Input age: " + age);
                return;
            }
        }
    }
}
