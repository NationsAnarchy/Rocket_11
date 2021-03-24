import com.vti.academy.entity.Account;
import com.vti.academy.entity.Department;
import com.vti.academy.entity.Student;

public class Program {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Charles");

        Department department1 = new Department("Sales");
        Department department2 = new Department();

        Account account1 = new Account();
    }
}
