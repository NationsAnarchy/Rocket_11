package com.vti.academy.backend;

import com.vti.academy.entity.News;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyNews {
    private List<News> newsList;

    public MyNews() {
        newsList = new ArrayList<>();
    }

    public void addNews() {
        News news = new News();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào tiêu đề/title: ");
        news.setTitle(scanner.nextLine());

        System.out.println("Nhập vào ngày đăng: ");
        news.setPublishDate(scanner.nextLine());

        System.out.println("Nhập vào tác giả: ");
        news.setAuthor(scanner.nextLine());

        System.out.println("Nhập vào nội dung: ");
        news.setContent(scanner.nextLine());

        newsList.add(news);
    }

    public void viewListNews() {
        for (News news: newsList){
            news.display();
        }
    }
}
