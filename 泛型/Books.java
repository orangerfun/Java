//结合泛型与集合编写一个案例实现图书信息输出

import java.util.Map;
import java.util.*;

class Book{
    private String name;
    private int id;
    private double price;

    public Book(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String toString(){
        return "id:"+this.id+"\tname:"+this.name+"\tprice:"+this.price;
    }
}


public class Books {
    public static void main(String[] args){
        Book book1 = new Book(1, "chinese", 12.5);
        Book book2 = new Book(2, "english", 13);
        Book book3 = new Book(3, "math", 45.2);

        Map<Integer, Book> books = new HashMap<Integer, Book>();
        books.put(10087, book1);
        books.put(10088, book2);
        books.put(10089, book3);
        System.out.println("泛型存储的图书信息如下：");
        for(Integer id:books.keySet()){
            System.out.println(books.get(id));
        }

        //定义泛型的List集合
        List<Book> list = new ArrayList<Book>();
        list.add(book1);
        list.add(book2);
        list.add(book3);
        System.out.println("泛型list存储的图书信息如下：");
        for(Book bk:list){
            System.out.println(bk);
        }
    }
}

