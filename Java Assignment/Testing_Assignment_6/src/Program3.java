public class Program3 {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[]{1, 2, 3};

            System.out.println(numbers[8]);
        }
        // Question 3:
        catch (Exception e){
            System.out.println("Array index out of bounds!");
        }
    }
}
