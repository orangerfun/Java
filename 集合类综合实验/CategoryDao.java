//遍历图书类别和图书信息构成的字典，打印其中信息

import  java.util.*;

public class CategoryDao {
    //定义泛型Map,存储图书信息
    static Map<Category, List<BookInfo>> categoryMap = new HashMap<Category, List<BookInfo>>();

    public static void printDeptmentInfo(){
        for(Category cate : categoryMap.keySet()){
            System.out.println("所属类别："+cate.getName());
            List<BookInfo> books = categoryMap.get(cate);
            System.out.println("编号" +"\t\t名称\t\t价格\t\t作者\t\t出版时间");
            for(int i=0; i<books.size(); i++){
                BookInfo b = books.get(i);
                System.out.println(b.id+"\t\t"+b.name+"\t\t"+b.price+"\t\t"+b.author+"\t\t"+b.startTime);
            }
            System.out.println();
        }
    }
}
