# 1. Collection
java`Collection`体系中的集合包括`Set`,`List`,`Queue`;set中元素不能重复，List像数组，queue是队列； Collection是前面三者的父接口，其中定义的方法适用于操作三者，
Collection定义了如下操作集合元素的方法：<br>
`add(object)`增加元素<br>
`clear()`清楚集合所有元素<br>
`contains(object)`判断集合是否包含某元素<br>
`iterator()`返回一个迭代器，遍历集合中元素<br>
`remove(object)`删除指定元素<br>
`size()`返回集合中元素个数<br>

```java
import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class CollectionClass {
    /*
    public static void main(String[] args){

//        定义一个ArrayList
        Collection c = new ArrayList();
//        添加元素
        c.add("china");
        c.add(6);
        System.out.println("集合c的元素个数为："+c.size());
//        删除元素
        c.remove(6);
        System.out.println("c集合元素个数为："+c.size());
//        判断是否包含指定元素
        System.out.println(c.contains("china"));
        c.add("anhui province");
        System.out.println("c集合中的元素："+c);

//        定义一个Hashset
        Collection book = new HashSet();
        book.add("chinese");
        book.add("music");
        System.out.println(book);
        book.add("chinese");
        System.out.println(book);
        book.clear();
        System.out.println(book);

    }
}  */
    
    
// 使用迭代器遍历集合
    public static void main(String[] args){
        Collection books = new HashSet();
        books.add("chinese");
        books.add("english");
        books.add("math");
        for(Object x:books)
        {
            System.out.println(x);
        }
        // way2;
//        Iterator it = books.iterator();
//        while (it.hasNext()){
//            String book = (String)it.next();
//            System.out.println(book);

        }
    }

```
