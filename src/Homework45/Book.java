package Homework45;
//Задача 1
   // Создайте класс Book (книга), в конструктор которого передавайте автора,
  //  название книги и количество страниц.

    //Реализуйте интерфейс для сравнения книг: они должны сортироваться по авторам,
     //   а если авторы совпадают - по названиям (и там, и там - по алфавиту, "в словарном
    //   порядке").

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 1-Создайте класс Book (книга)
public class Book implements Comparable<Book> {

    private String author;
    private String name;
    private int numbers;

    public Book(String author, String name, int numbers) {
        this.author = author;
        this.name = name;
        this.numbers = numbers;

    }

    public static Book readBook() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите имя автора: ");
        String author = br.readLine();
        System.out.print("Введите название книги: ");
        String name = br.readLine();
        System.out.print("Введите количество страниц: ");
        int numbers = Integer.parseInt(br.readLine());
        return new Book(author, name, numbers);
    }

    @Override
    public String toString() {
        return author + ": " + name + ":" + numbers;
    }

    @Override
    public int compareTo(Book other) {


    }
}







