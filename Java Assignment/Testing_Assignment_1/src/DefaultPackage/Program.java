package DefaultPackage;

import java.util.Date;

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
        Account acc2 = new Account();
        Account acc3 = new Account();

        // This is a comment

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

        // GroupAccount[] groupAccounts = {groupAccount1, groupAccount2, groupAccount3};

        System.out.println(dep3.name);
        System.out.println(dep2.name);
        System.out.println(dep1.name);

        // Testing System 2:
        // Question 1+3
        System.out.println(acc2.department == null ?
                "Nhan vien nay chua co phong ban" :
                "Phong ban cua nhan vien nay la " + acc2.department.name);

        // Question 2:

        // Làm switch case:

        switch (acc1.groups.length) {
            case 0:
                System.out.println("Nhan vien nay khong co group.");
                break;
            case 1:
            case 2:
                System.out.println("Nhan vien nay la Fresher.");
                break;
            case 3:
                System.out.println("Nhan vien nay la nguoi tham gia nhieu group.");
            default:
                System.out.println("Nhan vien nay tham gia tat ca cac group.");
        }

        Account[] accounts = {acc1, acc2, acc3};
        for (Account account : accounts) {
            System.out.println("Thong tin account thu " + account.id + " la:");
            System.out.println("Ten nhan vien: " + account.fullName);
            System.out.println("Dia chi email: " + account.email);
            System.out.println("Phong ban: " + account.department);
        }
        
        GroupAccount[] groupAccounts = {groupAccount1, groupAccount2, groupAccount3};
        for (GroupAccount groupAccount : groupAccounts
             ) {
            System.out.println(groupAccount.joinDate);
        }
    }
}