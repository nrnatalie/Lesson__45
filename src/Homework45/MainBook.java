package Homework45;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public  class  MainBook  {


    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      System.out.print("Введите имя автора : ");
      String author = br.readLine();
      System.out.print("Введите название книги: ");
      String name = br.readLine();
      System.out.print("Введите количество страниц: ");
      int n = Integer.parseInt(br.readLine());


  //которого передавайте автора,
//  название книги и количество страниц.
  //public static void main(String[] args) throws IOException {


   /* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Введите имя автора: ");
    String author = br.readLine();
    System.out.print("Введите название книги: ");
    String name = br.readLine();
    System.out.print("Введите количество страниц: ");
    int numbers = Integer.parseInt(br.readLine());



  }
}*/


    /*  public static void main(String[] args) {
        List<Book> book = new ArrayList<Book>();

        book.add(new book( "Достоевский", "Идиот", 200));
        book.add(new book("Толстой", "Война и мир", 300));
        book.add(new book("Пушкин", "Наталие", 500));

        Collections.sort(book); // тут ошибка
        System.out.println(book);
      }
    }*/
      List<Book> books = new ArrayList<>();
      for (int i = 0; i < n; ++i) {
        books.add(Book.readBook());
      }


      Collections.sort(books);
      for (Book book : books) {
        System.out.println(book);
      }
    }
}


