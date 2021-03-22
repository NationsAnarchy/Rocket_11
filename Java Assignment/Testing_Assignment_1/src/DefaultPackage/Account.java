package DefaultPackage;

public class Account {
    int id;
    String email;
    String userName;
    String fullName;
    Department department;
    Position position;
    String createDate;
    Gender gender;
    float salary;
    int[] groups;

    public String toString(){
        String result = "";
        result += "Ho ten: " + fullName + "\n";
        result += "Nguoi dung: " + userName + "\n";
        result += "Dia chi email: " + email + "\n";
        result += "Id: " + id + "\n";
        return result;
    }
}
