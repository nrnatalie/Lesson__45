package Homework45;
//Задача 1
   // Создайте класс Book (книга), в конструктор которого передавайте автора,
  //  название книги и количество страниц.

    //Реализуйте интерфейс для сравнения книг: они должны сортироваться по авторам,
     //   а если авторы совпадают - по названиям (и там, и там - по алфавиту, "в словарном
    //   порядке").
public class Book {
    private  String author;
    private String name;
    private  int numbers;

    public Book(String author, String name, int numbers){
        this.author = author;
        this.name = name;
        this.numbers = numbers;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public int getNumbers(){
        return numbers;
    }
}
