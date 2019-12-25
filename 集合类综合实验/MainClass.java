//主函数

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args){
        Category category1 = new Category(1, "中文");
        Category category2 = new Category(2,"english");

        BookInfo book1 = new BookInfo(2001, "上海", 1.34, "abd", "2019.12");
        BookInfo book2 = new BookInfo(2002, "shanghai", 2.35, "csd", "2019.01");
        BookInfo book3 = new BookInfo(2003 ,"ningguo", 12.3, "def", "2018.3");
        BookInfo book4 = new BookInfo(2004, "宁国", 23.33, "dfd", "2093.3");

        List<BookInfo> list1 = new ArrayList<BookInfo>();
        List<BookInfo> list2 = new ArrayList<BookInfo>();

        list1.add(book1);
        list1.add(book4);
        list2.add(book2);
        list2.add(book3);

        CategoryDao.categoryMap.put(category1, list1);
        CategoryDao.categoryMap.put(category2, list2);
        CategoryDao.printDeptmentInfo();
    }
}
