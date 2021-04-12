import java.sql.*;

public class Program {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/Testing_Assignment_1?autoReconnect=true&useSSL=false&characterEncoding=latin1";
        String username = "root";
        String password = "root";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(url, username, password);

        System.out.println("Connection Success!");
        Statement statement = connection.createStatement();
        // Step 3: Create a statement object
        String sql = "SELECT * FROM department";

        // int affectedAmount = statement.executeUpdate(sql);
        // Dùng với các lệnh Update, Delete, Insert

        // Đóng sau khi thực hiện được câu executeUpdate
        // connection.close();

        ResultSet resultset = statement.executeQuery(sql);
        // Dùng với duy nhất lệnh Select

        // Step 5: Xử lý hiển thị kết quả ra console
        while(resultset.next())
        {
            System.out.print("Department ID: " + resultset.getInt("DepartmentID"));
            System.out.println(". " + "Department Name: " + resultset.getString("DepartmentName"));
        }
    }
}

