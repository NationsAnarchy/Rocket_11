public class Program4 {
    public static void main(String[] args) {
        // Question 4:
        getIndex(2);
    }
    public static void getIndex(int index){
        try {
            String[] departments = new String[]{"Dev", "BA", "Sales"};
            System.out.println(departments[index]);
        } catch (Exception e) {
            System.err.println("Department not exists!");
        }
    }
}
