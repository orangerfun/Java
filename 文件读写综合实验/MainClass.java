import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args){
        Book book1 = new Book(1001, "CHINA", 12.4);
        Book book2 = new Book(1003, "ENGLISH", 12.3);

        List<Book> list = new ArrayList<Book>();
        list.add(book1);
        list.add(book2);

        Book.write(list);
        Book.read();
    }
}
