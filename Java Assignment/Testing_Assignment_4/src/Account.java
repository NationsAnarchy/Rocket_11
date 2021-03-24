import java.time.LocalDate;

public class Account {
    int id;
    String email;
    String username;
    String fullName;
    Department department;
    Position position;
    LocalDate createDate;
    Group[] groups;

    Account() {
    }

    Account(int id, String email, String username, String firstName, String lastName) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.fullName = firstName + " " + lastName;
    }

    Account(String email, String username, String firstName, String lastName, Position position) {
        this.email = email;
        this.username = username;
        this.fullName = firstName + " " + lastName;
        this.position = position;
        this.createDate = LocalDate.now();
    }

    Account(int id, String email, String username, String firstName, String lastName, Position position,
            LocalDate createDate) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.fullName = firstName + " " + lastName;
        this.position = position;
        this.createDate = createDate;
    }
}
