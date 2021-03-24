package DefaultPackage;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

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

        Account acc1 = new Account();
        acc1.id = 1;
        acc1.fullName = "Charles Leclerc";
        acc1.email = "nn01@gmail.com";
        acc1.department = dep1;

        Account acc2 = new Account();
        acc2.id = 2;
        acc2.fullName = "Lando Norris";
        acc2.email = "nn02@gmail.com";
        acc2.department = dep3;

        Account acc3 = new Account();
        acc3.id = 3;
        acc3.fullName = "Carlos Sainz Jr.";
        acc3.email = "nn03@gmail.com";
        acc3.department = dep2;

        acc1.groups = new int[]{1, 2, 3};
        acc2.groups = new int[]{1};
        acc3.groups = new int[]{1, 2, 3, 4};

        Group group1 = new Group();

        GroupAccount groupAccount1 = new GroupAccount();
        groupAccount1.account = acc1;
        groupAccount1.group = group1;
        groupAccount1.joinDate = new Date("2021/03/04");

        GroupAccount groupAccount2 = new GroupAccount();
        groupAccount2.account = acc1;
        groupAccount2.group = group1;
        groupAccount2.joinDate = new Date("2021/03/04");

        GroupAccount groupAccount3 = new GroupAccount();
        groupAccount3.account = acc1;
        groupAccount3.group = group1;
        groupAccount3.joinDate = new Date("2021/03/04");

        System.out.println();

        System.out.println(dep3.name);
        System.out.println(dep2.name);
        System.out.println(dep1.name);
        System.out.println();

        // Testing System 2:

        // Question 1+3
        System.out.println(acc2.department == null ?
                "Nhan vien nay chua co phong ban." :
                "Phong ban cua nhan vien nay la " + acc2.department.name + ".");
        System.out.println();

        // Question 2:
        // Làm switch case:
        groupCheck(acc1);

        Account[] accounts = new Account[]{acc1, acc2, acc3};
        for (Account account : accounts) {
            System.out.println("Thong tin account thu " + account.id + " la:");
            System.out.println("Ten nhan vien: " + account.fullName);
            System.out.println("Dia chi email: " + account.email);
            System.out.println("Phong ban: " + account.department.name);
            System.out.println();
        }

        // In ra thông tin department
        Department[] departments = new Department[]{dep1, dep2};
        for (Department department : departments
        ) {
            System.out.println("Id: " + department.id);
            System.out.println("Phong ban: " + department.name);
            System.out.println();
        }

        // In ra các số chẵn từ 0 đến 20

        for (int i = 0; i <= 20; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        // Dùng break và continue:

        for (int x = 0; x < accounts.length; x++) {

            if (x == 0) {
                continue;
            }

            if (x == 2) {
                break;
            }

            System.out.println("Ten: " + accounts[x].fullName);
            System.out.println("Email: " + accounts[x].email);
            System.out.println("Phong ban: " + accounts[x].department.name);
            System.out.println();
        }

        // Date format

        Locale locale = new Locale("vi", "VN");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        String formattedDate = dateFormat.format(new Date());
        System.out.println(formattedDate);
        System.out.println();

        // Testing Assignment 3:
        // Q1:
        acc1.salary = 5240.5f;
        acc2.salary = 10970.55f;
        int roundedSalary1 = Math.round(acc1.salary);
        int roundedSalary2 = Math.round(acc2.salary);

        System.out.println(roundedSalary1);
        System.out.println(roundedSalary2);

        //Q2:
        Random random = new Random();
        int testNumber = random.nextInt(99999);
        System.out.println("Without formatting: " + testNumber);
        String formatNumber = String.format("%05d", testNumber);
        System.out.println("With formatting: " + formatNumber);
        System.out.println();

        Account[] accounts1 = new Account[5];
        for (int i = 0; i < accounts1.length; i++){
            accounts1[i] = new Account();
            accounts1[i].email = "Email " + (i+1);
            accounts1[i].userName = "Username " + (i+1);
            accounts1[i].fullName = "Full name " + (i+1);
            accounts1[i].createDate = "Create date " + new Date();
        }

        for (Account value : accounts1) {
            System.out.println(value.email);
            System.out.println(value.userName);
            System.out.println(value.fullName);
            System.out.println(value.createDate);
            System.out.println();
        }

        // Tách các từ ra và đếm:

        String testString = "   A aaa bb   bbb";
        testString = testString.trim();
        String[] string;
        string = testString.split("\\s+");
        System.out.println("Ta có số từ được tách ra là: " + string.length);

        System.out.println();

        acc1.userName = "charlesLeclerc16";
        acc2.userName = "landoNorris4";

        Account[] accounts2 = new Account[]{acc1, acc2};

        for (Account account: accounts2
             ) {
            System.out.println(account);
        }
    }

    private static void groupCheck(Account account) {
        switch (account.groups.length) {
            case 0:
                System.out.println("Nhan vien nay khong co group.");
                break;
            case 1:
            case 2:
                System.out.println("Nhan vien nay la Fresher.");
                break;
            case 3:
                System.out.println("Nhan vien nay la nguoi tham gia nhieu group.");
                break;
            default:
                System.out.println("Nhan vien nay tham gia tat ca cac group.");
                break;
        }
        System.out.println();
    }
}