import java.util.*;
class Test {
    private String name;
    private int id;
    private double price;

    public Test(String name, int id, double price){
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getPrice()
    {
        return this.price;
    }

    public String toString()
    {
        return "商品编号："+ id +"\t商品名称：" +  name + "\t价格：" + price;
    }
}

// 设置商品属性，并将商品对象加入list中，最后遍历list,输出各商品属性
public class Product{
    public static void main(String[] args){
        Test pd1 = new Test("APPPLE",1,5.5);
        Test pd2 = new Test("orange", 2, 10);
        pd1.setPrice(12);
        Test pd3 = new Test("BANANA", 3, 2.1);

        List list = new ArrayList();
        list.add(pd1);
        list.add(pd2);
        list.add(pd3);
        for (int i=0;i<list.size();i++)
        {
            Test pro = (Test)list.get(i);
            System.out.println(pro);
        }

    }

}
