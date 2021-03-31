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

        System.out.println("Nháº­p vÃ o tiÃªu Ä‘á»�/title: ");
        news.setTitle(scanner.nextLine());

        System.out.println("Nháº­p vÃ o ngÃ y Ä‘Äƒng: ");
        news.setPublishDate(scanner.nextLine());

        System.out.println("Nháº­p vÃ o tÃ¡c giáº£: ");
        news.setAuthor(scanner.nextLine());

        System.out.println("Nháº­p vÃ o ná»™i dung: ");
        news.setContent(scanner.nextLine());
        scanner.close();
        newsList.add(news);
    }

    public void viewListNews() {
        for (News news: newsList){
            news.display();
        }
    }
}
