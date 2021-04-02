import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int[] numbers = new int[]{1, 2, 3};
            System.out.println("Which position do you want to get from the list?");
            int position = scanner.nextInt();            
            System.out.println("Here's the value of the input position.");
            System.out.println(numbers[position]);
        }
        // Question 3:
        catch (Exception e) {
            System.out.println("Array index out of bounds!");
        }
    }
}
