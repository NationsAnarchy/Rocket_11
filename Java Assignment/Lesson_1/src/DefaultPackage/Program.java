package DefaultPackage;

public class Program {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Department dep1 = new Department();
        dep1.id = 1;
        dep1.name = "Sales";

        Department dep2 = new Department();
        dep2.id = 2;
        dep2.name = "Marketing";

        Department dep3 = new Department();
        dep3.id = 3;
        dep3.name = "Development";

        System.out.println(dep3.name);
        System.out.println(dep2.name);
        System.out.println(dep1.name);
    }
}
