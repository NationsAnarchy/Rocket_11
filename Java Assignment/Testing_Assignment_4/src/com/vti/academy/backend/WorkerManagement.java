package com.vti.academy.backend;

import com.vti.academy.entity.Engineer;
import com.vti.academy.entity.Staff;
import com.vti.academy.entity.Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkerManagement {

    private List<Worker> workers;
    private Scanner scanner;

    public WorkerManagement() {
        workers = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addWorker() {
        System.out.println("Chọn loại cán bộ bạn muốn thêm:");
        System.out.println("1. Công nhân");
        System.out.println("2. Kỹ sư");
        System.out.println("3. Nhân viên");
        int select = scanner.nextInt();
        scanner.nextLine();
        switch (select){
            case 1:

            case 2:
                Engineer e = new Engineer();
                workers.add(e);
                System.out.println("Thêm cán bộ thành công!");
                break;
            case 3:
                Staff s = new Staff();
                workers.add(s);
                System.out.println("Thêm cán bộ thành công!");
                break;
        }
    }

    public void searchByName() {

    }

    public void showInformation() {

    }

    public void deleteWorker() {

    }
}
